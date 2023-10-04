package examples.grpcclient;



import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import service.*;
public class GeometryImpl extends GeometryCalculatorGrpc.GeometryCalculatorImplBase {
    private final List<SquareRequest> squareRequests = new ArrayList<>();
    private final List<CircleRequest> circleRequests = new ArrayList<>();

    @Override
    public void calculateSquareArea(SquareRequest request, StreamObserver<SquareResponse> responseObserver) {
        double sideLength = request.getSideLength();
        double area = sideLength * sideLength;

        SquareResponse response = SquareResponse.newBuilder()
                .setArea(area)
                .build();

        // Store the request for persistent data
        squareRequests.add(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void calculateCircleArea(CircleRequest request, StreamObserver<CircleResponse> responseObserver) {
        double radius = request.getRadius();
        double area = Math.PI * radius * radius;

        CircleResponse response = CircleResponse.newBuilder()
                .setArea(area)
                .build();

        // Store the request for persistent data
        circleRequests.add(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}

