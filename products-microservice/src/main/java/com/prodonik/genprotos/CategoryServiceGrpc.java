package com.prodonik.genprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: products.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CategoryServiceGrpc {

  private CategoryServiceGrpc() {}

  public static final String SERVICE_NAME = "com.prodonik.genprotos.CategoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryRequest,
      com.prodonik.genprotos.Products.Category> getCreateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategory",
      requestType = com.prodonik.genprotos.Products.CategoryRequest.class,
      responseType = com.prodonik.genprotos.Products.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryRequest,
      com.prodonik.genprotos.Products.Category> getCreateCategoryMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryRequest, com.prodonik.genprotos.Products.Category> getCreateCategoryMethod;
    if ((getCreateCategoryMethod = CategoryServiceGrpc.getCreateCategoryMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getCreateCategoryMethod = CategoryServiceGrpc.getCreateCategoryMethod) == null) {
          CategoryServiceGrpc.getCreateCategoryMethod = getCreateCategoryMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.CategoryRequest, com.prodonik.genprotos.Products.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.CategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("CreateCategory"))
              .build();
        }
      }
    }
    return getCreateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryRequest,
      com.prodonik.genprotos.Products.Category> getUpdateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCategory",
      requestType = com.prodonik.genprotos.Products.CategoryRequest.class,
      responseType = com.prodonik.genprotos.Products.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryRequest,
      com.prodonik.genprotos.Products.Category> getUpdateCategoryMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryRequest, com.prodonik.genprotos.Products.Category> getUpdateCategoryMethod;
    if ((getUpdateCategoryMethod = CategoryServiceGrpc.getUpdateCategoryMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getUpdateCategoryMethod = CategoryServiceGrpc.getUpdateCategoryMethod) == null) {
          CategoryServiceGrpc.getUpdateCategoryMethod = getUpdateCategoryMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.CategoryRequest, com.prodonik.genprotos.Products.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.CategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("UpdateCategory"))
              .build();
        }
      }
    }
    return getUpdateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryId,
      com.prodonik.genprotos.Products.Category> getGetCategoryByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCategoryById",
      requestType = com.prodonik.genprotos.Products.CategoryId.class,
      responseType = com.prodonik.genprotos.Products.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryId,
      com.prodonik.genprotos.Products.Category> getGetCategoryByIdMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryId, com.prodonik.genprotos.Products.Category> getGetCategoryByIdMethod;
    if ((getGetCategoryByIdMethod = CategoryServiceGrpc.getGetCategoryByIdMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getGetCategoryByIdMethod = CategoryServiceGrpc.getGetCategoryByIdMethod) == null) {
          CategoryServiceGrpc.getGetCategoryByIdMethod = getGetCategoryByIdMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.CategoryId, com.prodonik.genprotos.Products.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCategoryById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.CategoryId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("GetCategoryById"))
              .build();
        }
      }
    }
    return getGetCategoryByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryName,
      com.prodonik.genprotos.Products.Category> getGetCategoryByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCategoryByName",
      requestType = com.prodonik.genprotos.Products.CategoryName.class,
      responseType = com.prodonik.genprotos.Products.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryName,
      com.prodonik.genprotos.Products.Category> getGetCategoryByNameMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.CategoryName, com.prodonik.genprotos.Products.Category> getGetCategoryByNameMethod;
    if ((getGetCategoryByNameMethod = CategoryServiceGrpc.getGetCategoryByNameMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getGetCategoryByNameMethod = CategoryServiceGrpc.getGetCategoryByNameMethod) == null) {
          CategoryServiceGrpc.getGetCategoryByNameMethod = getGetCategoryByNameMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.CategoryName, com.prodonik.genprotos.Products.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCategoryByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.CategoryName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("GetCategoryByName"))
              .build();
        }
      }
    }
    return getGetCategoryByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.prodonik.genprotos.Products.GetAllCategoriesResponse> getGetAllCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCategories",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.prodonik.genprotos.Products.GetAllCategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.prodonik.genprotos.Products.GetAllCategoriesResponse> getGetAllCategoriesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.prodonik.genprotos.Products.GetAllCategoriesResponse> getGetAllCategoriesMethod;
    if ((getGetAllCategoriesMethod = CategoryServiceGrpc.getGetAllCategoriesMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getGetAllCategoriesMethod = CategoryServiceGrpc.getGetAllCategoriesMethod) == null) {
          CategoryServiceGrpc.getGetAllCategoriesMethod = getGetAllCategoriesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.prodonik.genprotos.Products.GetAllCategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.GetAllCategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("GetAllCategories"))
              .build();
        }
      }
    }
    return getGetAllCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.DeleteCategoryRequest,
      com.google.protobuf.Empty> getDeleteCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCategory",
      requestType = com.prodonik.genprotos.Products.DeleteCategoryRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.DeleteCategoryRequest,
      com.google.protobuf.Empty> getDeleteCategoryMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Products.DeleteCategoryRequest, com.google.protobuf.Empty> getDeleteCategoryMethod;
    if ((getDeleteCategoryMethod = CategoryServiceGrpc.getDeleteCategoryMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getDeleteCategoryMethod = CategoryServiceGrpc.getDeleteCategoryMethod) == null) {
          CategoryServiceGrpc.getDeleteCategoryMethod = getDeleteCategoryMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Products.DeleteCategoryRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Products.DeleteCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("DeleteCategory"))
              .build();
        }
      }
    }
    return getDeleteCategoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub>() {
        @java.lang.Override
        public CategoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceStub(channel, callOptions);
        }
      };
    return CategoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub>() {
        @java.lang.Override
        public CategoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceBlockingStub(channel, callOptions);
        }
      };
    return CategoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub>() {
        @java.lang.Override
        public CategoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceFutureStub(channel, callOptions);
        }
      };
    return CategoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CategoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCategory(com.prodonik.genprotos.Products.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryMethod(), responseObserver);
    }

    /**
     */
    public void updateCategory(com.prodonik.genprotos.Products.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCategoryMethod(), responseObserver);
    }

    /**
     */
    public void getCategoryById(com.prodonik.genprotos.Products.CategoryId request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryByIdMethod(), responseObserver);
    }

    /**
     */
    public void getCategoryByName(com.prodonik.genprotos.Products.CategoryName request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAllCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.GetAllCategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCategoriesMethod(), responseObserver);
    }

    /**
     */
    public void deleteCategory(com.prodonik.genprotos.Products.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCategoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.CategoryRequest,
                com.prodonik.genprotos.Products.Category>(
                  this, METHODID_CREATE_CATEGORY)))
          .addMethod(
            getUpdateCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.CategoryRequest,
                com.prodonik.genprotos.Products.Category>(
                  this, METHODID_UPDATE_CATEGORY)))
          .addMethod(
            getGetCategoryByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.CategoryId,
                com.prodonik.genprotos.Products.Category>(
                  this, METHODID_GET_CATEGORY_BY_ID)))
          .addMethod(
            getGetCategoryByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.CategoryName,
                com.prodonik.genprotos.Products.Category>(
                  this, METHODID_GET_CATEGORY_BY_NAME)))
          .addMethod(
            getGetAllCategoriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.prodonik.genprotos.Products.GetAllCategoriesResponse>(
                  this, METHODID_GET_ALL_CATEGORIES)))
          .addMethod(
            getDeleteCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Products.DeleteCategoryRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CATEGORY)))
          .build();
    }
  }

  /**
   */
  public static final class CategoryServiceStub extends io.grpc.stub.AbstractAsyncStub<CategoryServiceStub> {
    private CategoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCategory(com.prodonik.genprotos.Products.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCategory(com.prodonik.genprotos.Products.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCategoryById(com.prodonik.genprotos.Products.CategoryId request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCategoryByName(com.prodonik.genprotos.Products.CategoryName request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.GetAllCategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCategory(com.prodonik.genprotos.Products.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CategoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CategoryServiceBlockingStub> {
    private CategoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.prodonik.genprotos.Products.Category createCategory(com.prodonik.genprotos.Products.CategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Products.Category updateCategory(com.prodonik.genprotos.Products.CategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Products.Category getCategoryById(com.prodonik.genprotos.Products.CategoryId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Products.Category getCategoryByName(com.prodonik.genprotos.Products.CategoryName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Products.GetAllCategoriesResponse getAllCategories(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCategoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCategory(com.prodonik.genprotos.Products.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCategoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CategoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CategoryServiceFutureStub> {
    private CategoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.Category> createCategory(
        com.prodonik.genprotos.Products.CategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.Category> updateCategory(
        com.prodonik.genprotos.Products.CategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.Category> getCategoryById(
        com.prodonik.genprotos.Products.CategoryId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.Category> getCategoryByName(
        com.prodonik.genprotos.Products.CategoryName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Products.GetAllCategoriesResponse> getAllCategories(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCategoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCategory(
        com.prodonik.genprotos.Products.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CATEGORY = 0;
  private static final int METHODID_UPDATE_CATEGORY = 1;
  private static final int METHODID_GET_CATEGORY_BY_ID = 2;
  private static final int METHODID_GET_CATEGORY_BY_NAME = 3;
  private static final int METHODID_GET_ALL_CATEGORIES = 4;
  private static final int METHODID_DELETE_CATEGORY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((com.prodonik.genprotos.Products.CategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category>) responseObserver);
          break;
        case METHODID_UPDATE_CATEGORY:
          serviceImpl.updateCategory((com.prodonik.genprotos.Products.CategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category>) responseObserver);
          break;
        case METHODID_GET_CATEGORY_BY_ID:
          serviceImpl.getCategoryById((com.prodonik.genprotos.Products.CategoryId) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category>) responseObserver);
          break;
        case METHODID_GET_CATEGORY_BY_NAME:
          serviceImpl.getCategoryByName((com.prodonik.genprotos.Products.CategoryName) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.Category>) responseObserver);
          break;
        case METHODID_GET_ALL_CATEGORIES:
          serviceImpl.getAllCategories((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Products.GetAllCategoriesResponse>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY:
          serviceImpl.deleteCategory((com.prodonik.genprotos.Products.DeleteCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.prodonik.genprotos.Products.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryService");
    }
  }

  private static final class CategoryServiceFileDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier {
    CategoryServiceFileDescriptorSupplier() {}
  }

  private static final class CategoryServiceMethodDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CategoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryServiceFileDescriptorSupplier())
              .addMethod(getCreateCategoryMethod())
              .addMethod(getUpdateCategoryMethod())
              .addMethod(getGetCategoryByIdMethod())
              .addMethod(getGetCategoryByNameMethod())
              .addMethod(getGetAllCategoriesMethod())
              .addMethod(getDeleteCategoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
