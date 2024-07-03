package com.prodonik.genprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: products.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HistoryServiceGrpc {

  private HistoryServiceGrpc() {}

  public static final String SERVICE_NAME = "com.prodonik.genprotos.HistoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.GetProductsHistoryRequest,
      com.prodonik.genprotos.Products.GetProductsHistoryResponse> getGetProductsHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsHistory",
      requestType = com.prodonik.genprotos.Products.GetProductsHistoryRequest.class,
      responseType = com.prodonik.genprotos.Products.GetProductsHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.GetProductsHistoryRequest,
      com.prodonik.genprotos.Products.GetProductsHistoryResponse> getGetProductsHistoryMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.GetProductsHistoryRequest, com.prodonik.genprotos.Products.GetProductsHistoryResponse> getGetProductsHistoryMethod;
    if ((getGetProductsHistoryMethod = HistoryServiceGrpc.getGetProductsHistoryMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getGetProductsHistoryMethod = HistoryServiceGrpc.getGetProductsHistoryMethod) == null) {
          HistoryServiceGrpc.getGetProductsHistoryMethod = getGetProductsHistoryMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.GetProductsHistoryRequest, com.prodonik.genprotos.Products.GetProductsHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.GetProductsHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.GetProductsHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("GetProductsHistory"))
              .build();
        }
      }
    }
    return getGetProductsHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CreateProductsHistoryRequest,
      com.prodonik.genprotos.Products.CreateProductsHistoryResponse> getCreateHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHistory",
      requestType = com.prodonik.genprotos.Products.CreateProductsHistoryRequest.class,
      responseType = com.prodonik.genprotos.Products.CreateProductsHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CreateProductsHistoryRequest,
      com.prodonik.genprotos.Products.CreateProductsHistoryResponse> getCreateHistoryMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CreateProductsHistoryRequest, com.prodonik.genprotos.Products.CreateProductsHistoryResponse> getCreateHistoryMethod;
    if ((getCreateHistoryMethod = HistoryServiceGrpc.getCreateHistoryMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getCreateHistoryMethod = HistoryServiceGrpc.getCreateHistoryMethod) == null) {
          HistoryServiceGrpc.getCreateHistoryMethod = getCreateHistoryMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.CreateProductsHistoryRequest, com.prodonik.genprotos.Products.CreateProductsHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.CreateProductsHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.CreateProductsHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("CreateHistory"))
              .build();
        }
      }
    }
    return getCreateHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HistoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceStub>() {
        @java.lang.Override
        public HistoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceStub(channel, callOptions);
        }
      };
    return HistoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HistoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingStub>() {
        @java.lang.Override
        public HistoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceBlockingStub(channel, callOptions);
        }
      };
    return HistoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HistoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceFutureStub>() {
        @java.lang.Override
        public HistoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceFutureStub(channel, callOptions);
        }
      };
    return HistoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HistoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductsHistory(com.prodonik.genprotos.Products.GetProductsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.GetProductsHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsHistoryMethod(), responseObserver);
    }

    /**
     */
    public void createHistory(com.prodonik.genprotos.Products.CreateProductsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.CreateProductsHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductsHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.GetProductsHistoryRequest,
                com.prodonik.genprotos.Products.GetProductsHistoryResponse>(
                  this, METHODID_GET_PRODUCTS_HISTORY)))
          .addMethod(
            getCreateHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.CreateProductsHistoryRequest,
                com.prodonik.genprotos.Products.CreateProductsHistoryResponse>(
                  this, METHODID_CREATE_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class HistoryServiceStub extends io.grpc.stub.AbstractAsyncStub<HistoryServiceStub> {
    private HistoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductsHistory(com.prodonik.genprotos.Products.GetProductsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.GetProductsHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createHistory(com.prodonik.genprotos.Products.CreateProductsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.CreateProductsHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HistoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HistoryServiceBlockingStub> {
    private HistoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.prodonik.genprotos.Products.GetProductsHistoryResponse getProductsHistory(com.prodonik.genprotos.Products.GetProductsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Products.CreateProductsHistoryResponse createHistory(com.prodonik.genprotos.Products.CreateProductsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HistoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HistoryServiceFutureStub> {
    private HistoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.GetProductsHistoryResponse> getProductsHistory(
        com.prodonik.genprotos.Products.GetProductsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.CreateProductsHistoryResponse> createHistory(
        com.prodonik.genprotos.Products.CreateProductsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS_HISTORY = 0;
  private static final int METHODID_CREATE_HISTORY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HistoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HistoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS_HISTORY:
          serviceImpl.getProductsHistory((com.prodonik.genprotos.Products.GetProductsHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.GetProductsHistoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_HISTORY:
          serviceImpl.createHistory((com.prodonik.genprotos.Products.CreateProductsHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.CreateProductsHistoryResponse>) responseObserver);
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

  private static abstract class HistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HistoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.prodonik.genprotos.Products.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HistoryService");
    }
  }

  private static final class HistoryServiceFileDescriptorSupplier
      extends HistoryServiceBaseDescriptorSupplier {
    HistoryServiceFileDescriptorSupplier() {}
  }

  private static final class HistoryServiceMethodDescriptorSupplier
      extends HistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HistoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HistoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HistoryServiceFileDescriptorSupplier())
              .addMethod(getGetProductsHistoryMethod())
              .addMethod(getCreateHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
