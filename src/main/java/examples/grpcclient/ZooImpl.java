package examples.grpcclient;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import io.grpc.stub.StreamObserver;
import service.*;
import com.google.protobuf.Empty;



// Implement the Zoo service
class ZooImpl extends ZooGrpc.ZooImplBase {
    private Stack<Animal> animalStack = new Stack<>();
    private Map<String, String> animalSounds = new HashMap<>();

    public ZooImpl() {
        super();
        // Predefined animals and their sounds
        animalSounds.put("lion", "The lion roars!");
        animalSounds.put("elephant", "The elephant trumpets!");
    }

    @Override
    public void add(AddAnimalRequest request, StreamObserver<AddAnimalResponse> responseObserver) {
        Animal animal = request.getAnimal();
        animalStack.push(animal);

        AddAnimalResponse response = AddAnimalResponse.newBuilder()
                .setIsSuccess(true)
                .setMessage("Animal added successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void speak(SpeakRequest request, StreamObserver<SpeakResponse> responseObserver) {
        String animalName = request.getName();
        String sound = animalSounds.get(animalName);

        SpeakResponse.Builder responseBuilder = SpeakResponse.newBuilder();

        if (sound != null) {
            responseBuilder.setIsSuccess(true);
            responseBuilder.addAnimals(sound);
        } else {
            responseBuilder.setIsSuccess(false);
            responseBuilder.setError("Animal not found or sound not defined");
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

//    @Override
//    public void speakAll(Empty request, StreamObserver<SpeakResponse> responseObserver) {
//        SpeakResponse.Builder responseBuilder = SpeakResponse.newBuilder();
//        boolean atLeastOneAnimalFound = false;
//
//        for (Animal animal : animalStack) {
//            String sound = animalSounds.get(animal.getType());
//            if (sound != null) {
//                responseBuilder.addAnimals(sound);
//                atLeastOneAnimalFound = true;
//            }
//        }
//
//        if (atLeastOneAnimalFound) {
//            responseBuilder.setIsSuccess(true);
//        } else {
//            responseBuilder.setIsSuccess(false);
//            responseBuilder.setError("No animals found or sounds not defined");
//        }
//
//        responseObserver.onNext(responseBuilder.build());
//        responseObserver.onCompleted();
//    }
}
