package examples.grpcclient;
import io.grpc.stub.StreamObserver;
import service.CoffeePotGrpc.CoffeePotImplBase;
import service.BrewResponse;
import service.GetCupResponse;
import service.BrewStatusResponse;
import com.google.protobuf.Empty;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import io.grpc.stub.StreamObserver;
import service.*;


public class CoffeePotImpl extends CoffeePotGrpc.CoffeePotImplBase {
    private int cupsOfCoffee = 0; // Number of cups available
    private boolean isBrewing = false; // Brewing status

    @Override
    public void brew(Empty request, StreamObserver<BrewResponse> responseObserver) {
        // Check if coffee is still brewing
        if (isBrewing) {
            // Handle error, coffee is already brewing
            BrewResponse response = BrewResponse.newBuilder()
                    .setIsSuccess(false)
                    .setError("Coffee is already brewing.")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        // Check if there's coffee in the pot
        if (cupsOfCoffee > 0) {
            // Handle error, coffee pot still has coffee
            BrewResponse response = BrewResponse.newBuilder()
                    .setIsSuccess(false)
                    .setError("Coffee pot still has coffee. Remove cups first.")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        // Start brewing (simulated)
        isBrewing = true;
        simulateBrewing();

        // Respond when brewing is done
        BrewResponse response = BrewResponse.newBuilder()
                .setIsSuccess(true)
                .setMessage("Brewing started. Please wait.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCup(Empty request, StreamObserver<GetCupResponse> responseObserver) {
        if (isBrewing) {
            // Handle error, coffee is brewing
            GetCupResponse response = GetCupResponse.newBuilder()
                    .setIsSuccess(false)
                    .setMessage("Coffee is brewing. Please wait.")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        if (cupsOfCoffee <= 0) {
            // Handle error, no coffee in the pot
            GetCupResponse response = GetCupResponse.newBuilder()
                    .setIsSuccess(false)
                    .setMessage("Coffee pot is empty. Brew some coffee first.")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        // Serve a cup of coffee
        cupsOfCoffee--;
        GetCupResponse response = GetCupResponse.newBuilder()
                .setIsSuccess(true)
                .setMessage("Enjoy your cup of coffee!")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    // Simulate brewing for demonstration purposes (you may need a real implementation)
    private void simulateBrewing() {
        new Thread(() -> {
            try {
                Thread.sleep(30000); // Simulate 30 seconds of brewing
                isBrewing = false;
                cupsOfCoffee = 10; // Refill the pot with 10 cups
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
