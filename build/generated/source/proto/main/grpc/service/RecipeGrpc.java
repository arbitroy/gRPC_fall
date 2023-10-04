package service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.1)",
    comments = "Source: services/calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecipeGrpc {

  private RecipeGrpc() {}

  public static final String SERVICE_NAME = "services.Recipe";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.EvaluateRequest,
      service.EvaluateResponse> getEvaluateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "evaluate",
      requestType = service.EvaluateRequest.class,
      responseType = service.EvaluateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.EvaluateRequest,
      service.EvaluateResponse> getEvaluateMethod() {
    io.grpc.MethodDescriptor<service.EvaluateRequest, service.EvaluateResponse> getEvaluateMethod;
    if ((getEvaluateMethod = RecipeGrpc.getEvaluateMethod) == null) {
      synchronized (RecipeGrpc.class) {
        if ((getEvaluateMethod = RecipeGrpc.getEvaluateMethod) == null) {
          RecipeGrpc.getEvaluateMethod = getEvaluateMethod =
              io.grpc.MethodDescriptor.<service.EvaluateRequest, service.EvaluateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "evaluate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.EvaluateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.EvaluateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecipeMethodDescriptorSupplier("evaluate"))
              .build();
        }
      }
    }
    return getEvaluateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.HistoryResponse> getHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "history",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.HistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.HistoryResponse> getHistoryMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.HistoryResponse> getHistoryMethod;
    if ((getHistoryMethod = RecipeGrpc.getHistoryMethod) == null) {
      synchronized (RecipeGrpc.class) {
        if ((getHistoryMethod = RecipeGrpc.getHistoryMethod) == null) {
          RecipeGrpc.getHistoryMethod = getHistoryMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.HistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "history"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecipeMethodDescriptorSupplier("history"))
              .build();
        }
      }
    }
    return getHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecipeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecipeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecipeStub>() {
        @java.lang.Override
        public RecipeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecipeStub(channel, callOptions);
        }
      };
    return RecipeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecipeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecipeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecipeBlockingStub>() {
        @java.lang.Override
        public RecipeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecipeBlockingStub(channel, callOptions);
        }
      };
    return RecipeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecipeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecipeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecipeFutureStub>() {
        @java.lang.Override
        public RecipeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecipeFutureStub(channel, callOptions);
        }
      };
    return RecipeFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RecipeImplBase implements io.grpc.BindableService {

    /**
     */
    public void evaluate(service.EvaluateRequest request,
        io.grpc.stub.StreamObserver<service.EvaluateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvaluateMethod(), responseObserver);
    }

    /**
     */
    public void history(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.HistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEvaluateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.EvaluateRequest,
                service.EvaluateResponse>(
                  this, METHODID_EVALUATE)))
          .addMethod(
            getHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                service.HistoryResponse>(
                  this, METHODID_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class RecipeStub extends io.grpc.stub.AbstractAsyncStub<RecipeStub> {
    private RecipeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecipeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecipeStub(channel, callOptions);
    }

    /**
     */
    public void evaluate(service.EvaluateRequest request,
        io.grpc.stub.StreamObserver<service.EvaluateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvaluateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void history(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.HistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecipeBlockingStub extends io.grpc.stub.AbstractBlockingStub<RecipeBlockingStub> {
    private RecipeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecipeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecipeBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.EvaluateResponse evaluate(service.EvaluateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvaluateMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.HistoryResponse history(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecipeFutureStub extends io.grpc.stub.AbstractFutureStub<RecipeFutureStub> {
    private RecipeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecipeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecipeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.EvaluateResponse> evaluate(
        service.EvaluateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvaluateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.HistoryResponse> history(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EVALUATE = 0;
  private static final int METHODID_HISTORY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecipeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecipeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EVALUATE:
          serviceImpl.evaluate((service.EvaluateRequest) request,
              (io.grpc.stub.StreamObserver<service.EvaluateResponse>) responseObserver);
          break;
        case METHODID_HISTORY:
          serviceImpl.history((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.HistoryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RecipeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecipeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.CalculatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Recipe");
    }
  }

  private static final class RecipeFileDescriptorSupplier
      extends RecipeBaseDescriptorSupplier {
    RecipeFileDescriptorSupplier() {}
  }

  private static final class RecipeMethodDescriptorSupplier
      extends RecipeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecipeMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RecipeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecipeFileDescriptorSupplier())
              .addMethod(getEvaluateMethod())
              .addMethod(getHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
