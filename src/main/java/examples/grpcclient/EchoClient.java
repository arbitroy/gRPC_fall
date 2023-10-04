package examples.grpcclient;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;
import service.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.protobuf.Empty; // needed to use Empty


/**
 * Client that requests `parrot` method from the `EchoServer`.
 */
public class EchoClient {
  private final EchoGrpc.EchoBlockingStub blockingStub;
  private final JokeGrpc.JokeBlockingStub blockingStub2;
  private final ZooGrpc.ZooBlockingStub blockingStub5;
  private final CoffeePotGrpc.CoffeePotBlockingStub blockingStub6;
  private final RegistryGrpc.RegistryBlockingStub blockingStub3;
  private final RegistryGrpc.RegistryBlockingStub blockingStub4;

  /** Construct client for accessing server using the existing channel. */
  public EchoClient(Channel channel, Channel regChannel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's
    // responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to
    // reuse Channels.
    blockingStub = EchoGrpc.newBlockingStub(channel);
    blockingStub2 = JokeGrpc.newBlockingStub(channel);
    blockingStub3 = RegistryGrpc.newBlockingStub(regChannel);
    blockingStub4 = RegistryGrpc.newBlockingStub(channel);
    blockingStub5 = ZooGrpc.newBlockingStub(channel);
    blockingStub6 = CoffeePotGrpc.newBlockingStub(channel);
  }

  public void askServerToParrot(String message) {

    ClientRequest request = ClientRequest.newBuilder().setMessage(message).build();
    ServerResponse response;
    try {
      response = blockingStub.parrot(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getMessage());
  }
  //coffeepot
  public void getCoffeeResponse() {
    // Create a request with an empty message (since getCup doesn't require any input)
    Empty request = Empty.newBuilder().build();
    GetCupResponse response;

    try {
      // Call the getCup method of the CoffeePot service
      response = blockingStub6.getCup(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    // If a cup was retrieved successfully, print a success message
    System.out.println("Message: " + response.getMessage());

  }

  //coffee brewing
  public void brewCoffee(){
    // Create a request with an empty message (since getCup doesn't require any input)
    Empty request = Empty.newBuilder().build();
    BrewResponse response;

    try {
      // Call the getCup method of the CoffeePot service
      response = blockingStub6.brew(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    // If a cup was retrieved successfully, print a success message
    System.out.println(response.getMessage());
  }
  //Zoo get animal sound
  public void getSound(String animalName) {
    SpeakRequest request = SpeakRequest.newBuilder().setName(animalName).build();
    SpeakResponse response;

    try {
      response = blockingStub5.speak(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }

    if (response.getIsSuccess()) {
      System.out.println("The sound of " + animalName + " is:");
      for (String sound : response.getAnimalsList()) {
        System.out.println("--- " + sound);
      }
    } else {
      System.err.println("Failed to get sound for " + animalName + ": " + response.getError());
    }
  }
  public void getAllSounds() {
    // Create an Empty request since speakAll doesn't require any input
    Empty request = Empty.newBuilder().build();
    SpeakResponse response;

    try {
      // Call the speakAll method of the Zoo service
      response = blockingStub5.speakAll(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }

    if (response.getIsSuccess()) {
      // If at least one animal's sound was found, print the sounds
      System.out.println("All animal sounds:");
      for (String sound : response.getAnimalsList()) {
        System.out.println("--- " + sound);
      }
    } else {
      // If no animals were found or sounds are not defined, print the error message
      System.err.println("Error: " + response.getError());
    }
  }
  public void askForJokes(int num) {
    JokeReq request = JokeReq.newBuilder().setNumber(num).build();
    JokeRes response;

    // just to show how to use the empty in the protobuf protocol
    Empty empt = Empty.newBuilder().build();

    try {
      response = blockingStub2.getJoke(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
    System.out.println("Your jokes: ");
    for (String joke : response.getJokeList()) {
      System.out.println("--- " + joke);
    }
  }

  public void setJoke(String joke) {
    JokeSetReq request = JokeSetReq.newBuilder().setJoke(joke).build();
    JokeSetRes response;

    try {
      response = blockingStub2.setJoke(request);
      System.out.println(response.getOk());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void getNodeServices() {
    GetServicesReq request = GetServicesReq.newBuilder().build();
    ServicesListRes response;
    try {
      response = blockingStub4.getServices(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void getServices() {
    GetServicesReq request = GetServicesReq.newBuilder().build();
    ServicesListRes response;
    try {
      response = blockingStub3.getServices(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void findServer(String name) {
    FindServerReq request = FindServerReq.newBuilder().setServiceName(name).build();
    SingleServerRes response;
    try {
      response = blockingStub3.findServer(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void findServers(String name) {
    FindServersReq request = FindServersReq.newBuilder().setServiceName(name).build();
    ServerListRes response;
    try {
      response = blockingStub3.findServers(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public static void main(String[] args) throws Exception {
    if (args.length != 6) {
      System.out
          .println("Expected arguments: <host(String)> <port(int)> <regHost(string)> <regPort(int)> <message(String)> <regOn(bool)>");
      System.exit(1);
    }
    int port = 9099;
    int regPort = 9003;
    String host = args[0];
    String regHost = args[2];
    String message = args[4];
    try {
      port = Integer.parseInt(args[1]);
      regPort = Integer.parseInt(args[3]);
    } catch (NumberFormatException nfe) {
      System.out.println("[Port] must be an integer");
      System.exit(2);
    }

    ManagedChannel channel = ManagedChannelBuilder.forTarget(host + ":" + port).usePlaintext().build();
    ManagedChannel regChannel = ManagedChannelBuilder.forTarget(regHost + ":" + regPort).usePlaintext().build();

    try {

      // ##############################################################################
      // ## Assume we know the port here from the service node it is basically set through Gradle
      // here.
      // In your version you should first contact the registry to check which services
      // are available and what the port
      // etc is.

      /**
       * Your client should start off with 
       * 1. contacting the Registry to check for the available services
       * 2. List the services in the terminal and the client can
       *    choose one (preferably through numbering) 
       * 3. Based on what the client chooses
       *    the terminal should ask for input, eg. a new sentence, a sorting array or
       *    whatever the request needs 
       * 4. The request should be sent to one of the
       *    available services (client should call the registry again and ask for a
       *    Server providing the chosen service) should send the request to this service and
       *    return the response in a good way to the client
       * 
       * You should make sure your client does not crash in case the service node
       * crashes or went offline.
       */

      // Just doing some hard coded calls to the service node without using the
      // registry
      // create client
      EchoClient client = new EchoClient(channel, regChannel);
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      // Prompt the user to choose between joke service and zoo service
      System.out.println("Select a service:\n1. Joke Service\n2. Zoo Service\n3. Coffepot service");
      int serviceChoice = Integer.parseInt(reader.readLine());

      if (serviceChoice == 1) {
        // Joke Service
        System.out.println("How many jokes would you like?");
        int numJokes = Integer.parseInt(reader.readLine());
        client.askForJokes(numJokes);
      } else if (serviceChoice == 2) {
        // Zoo Service
        System.out.println("Select an animal:\n1. Lion\n2. Elephant\n");
        int animalChoice = Integer.parseInt(reader.readLine());

        if (animalChoice == 1) {
          client.getSound("lion");
        } else if (animalChoice == 2) {
          client.getSound("elephant");
        }else {
          client.getSound("lion");
        }
      } else if (serviceChoice == 3) {
        System.out.println("Do you want:\n1.Check CoffeePot Status\n2.Brew Some Coffee\n");
        Integer coffeChoice = Integer.parseInt(reader.readLine());

        if(coffeChoice == 1){
        System.out.println("Getting cup:");
        client.getCoffeeResponse();
        } else if (coffeChoice == 2) {

          client.brewCoffee();
        }else {
          System.out.println("Invalid choice.");
        }
      } else {
        System.out.println("Invalid choice.");
      }

      System.out.println("Services on the connected node. (without registry)");
      client.getNodeServices(); // get all registered services 

      // ############### Contacting the registry just so you see how it can be done

      if (args[5].equals("true")) { 
        // Comment these last Service calls while in Activity 1 Task 1, they are not needed and wil throw issues without the Registry running
        // get thread's services
        client.getServices(); // get all registered services 

        // get parrot
        client.findServer("services.Echo/parrot"); // get ONE server that provides the parrot service
        
        // get all setJoke
        client.findServers("services.Joke/setJoke"); // get ALL servers that provide the setJoke service

        // get getJoke
        client.findServer("services.Joke/getJoke"); // get ALL servers that provide the getJoke service

        //speak
        client.findServer("services.Zoo/speak");
        //speak
        client.findServer("services.Zoo/speakAll");

        //coffee
        client.findServer("services.CoffePot/getCup");

        // does not exist
        client.findServer("random"); // shows the output if the server does not find a given service
      }

    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent
      // leaking these
      // resources the channel should be shut down when it will no longer be used. If
      // it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
      regChannel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
