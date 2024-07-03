package com.prodonik.genprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: products.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PurchaseServiceGrpc {

  private PurchaseServiceGrpc() {}

  public static final String SERVICE_NAME = "com.prodonik.genprotos.PurchaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.RemoveProductsRequest,
      com.prodonik.genprotos.Products.RemoveProductsResponse> getRemoveProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveProducts",
      requestType = com.prodonik.genprotos.Products.RemoveProductsRequest.class,
      responseType = com.prodonik.genprotos.Products.RemoveProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.RemoveProductsRequest,
      com.prodonik.genprotos.Products.RemoveProductsResponse> getRemoveProductsMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.RemoveProductsRequest, com.prodonik.genprotos.Products.RemoveProductsResponse> getRemoveProductsMethod;
    if ((getRemoveProductsMethod = PurchaseServiceGrpc.getRemoveProductsMethod) == null) {
      synchronized (PurchaseServiceGrpc.class) {
        if ((getRemoveProductsMethod = PurchaseServiceGrpc.getRemoveProductsMethod) == null) {
          PurchaseServiceGrpc.getRemoveProductsMethod = getRemoveProductsMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.RemoveProductsRequest, com.prodonik.genprotos.Products.RemoveProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.RemoveProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.RemoveProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchaseServiceMethodDescriptorSupplier("RemoveProducts"))
              .build();
        }
      }
    }
    return getRemoveProductsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PurchaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchaseServiceStub>() {
        @java.lang.Override
        public PurchaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchaseServiceStub(channel, callOptions);
        }
      };
    return PurchaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PurchaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchaseServiceBlockingStub>() {
        @java.lang.Override
        public PurchaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchaseServiceBlockingStub(channel, callOptions);
        }
      };
    return PurchaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PurchaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchaseServiceFutureStub>() {
        @java.lang.Override
        public PurchaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchaseServiceFutureStub(channel, callOptions);
        }
      };
    return PurchaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PurchaseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void removeProducts(com.prodonik.genprotos.Products.RemoveProductsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.RemoveProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveProductsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveProductsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.RemoveProductsRequest,
                com.prodonik.genprotos.Products.RemoveProductsResponse>(
                  this, METHODID_REMOVE_PRODUCTS)))
          .build();
    }
  }

  /**
   */
  public static final class PurchaseServiceStub extends io.grpc.stub.AbstractAsyncStub<PurchaseServiceStub> {
    private PurchaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void removeProducts(com.prodonik.genprotos.Products.RemoveProductsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.RemoveProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveProductsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PurchaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PurchaseServiceBlockingStub> {
    private PurchaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.prodonik.genprotos.Products.RemoveProductsResponse removeProducts(com.prodonik.genprotos.Products.RemoveProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveProductsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PurchaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PurchaseServiceFutureStub> {
    private PurchaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.RemoveProductsResponse> removeProducts(
        com.prodonik.genprotos.Products.RemoveProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveProductsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_PRODUCTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PurchaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PurchaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_PRODUCTS:
          serviceImpl.removeProducts((com.prodonik.genprotos.Products.RemoveProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.RemoveProductsResponse>) responseObserver);
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

  private static abstract class PurchaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PurchaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.prodonik.genprotos.Products.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PurchaseService");
    }
  }

  private static final class PurchaseServiceFileDescriptorSupplier
      extends PurchaseServiceBaseDescriptorSupplier {
    PurchaseServiceFileDescriptorSupplier() {}
  }

  private static final class PurchaseServiceMethodDescriptorSupplier
      extends PurchaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PurchaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PurchaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PurchaseServiceFileDescriptorSupplier())
              .addMethod(getRemoveProductsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
