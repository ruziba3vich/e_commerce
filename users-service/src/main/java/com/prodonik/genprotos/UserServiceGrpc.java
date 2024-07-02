package com.prodonik.genprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: users.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.prodonik.genprotos.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.GetUserRequest,
      com.prodonik.genprotos.Users.User> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = com.prodonik.genprotos.Users.GetUserRequest.class,
      responseType = com.prodonik.genprotos.Users.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.GetUserRequest,
      com.prodonik.genprotos.Users.User> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.GetUserRequest, com.prodonik.genprotos.Users.User> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserByIdMethod = UserServiceGrpc.getGetUserByIdMethod) == null) {
          UserServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Users.GetUserRequest, com.prodonik.genprotos.Users.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.prodonik.genprotos.Users.GetAllUsersResponse> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUsers",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.prodonik.genprotos.Users.GetAllUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.prodonik.genprotos.Users.GetAllUsersResponse> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.prodonik.genprotos.Users.GetAllUsersResponse> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
          UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.prodonik.genprotos.Users.GetAllUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.GetAllUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.CreateUserRequest,
      com.prodonik.genprotos.Users.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.prodonik.genprotos.Users.CreateUserRequest.class,
      responseType = com.prodonik.genprotos.Users.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.CreateUserRequest,
      com.prodonik.genprotos.Users.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.CreateUserRequest, com.prodonik.genprotos.Users.User> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Users.CreateUserRequest, com.prodonik.genprotos.Users.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.UpdateUserRequest,
      com.prodonik.genprotos.Users.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.prodonik.genprotos.Users.UpdateUserRequest.class,
      responseType = com.prodonik.genprotos.Users.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.UpdateUserRequest,
      com.prodonik.genprotos.Users.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.UpdateUserRequest, com.prodonik.genprotos.Users.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Users.UpdateUserRequest, com.prodonik.genprotos.Users.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.DeleteUserRequest,
      com.prodonik.genprotos.Users.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.prodonik.genprotos.Users.DeleteUserRequest.class,
      responseType = com.prodonik.genprotos.Users.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.DeleteUserRequest,
      com.prodonik.genprotos.Users.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Users.DeleteUserRequest, com.prodonik.genprotos.Users.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Users.DeleteUserRequest, com.prodonik.genprotos.Users.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Users.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserById(com.prodonik.genprotos.Users.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.GetAllUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    /**
     */
    public void createUser(com.prodonik.genprotos.Users.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.prodonik.genprotos.Users.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.prodonik.genprotos.Users.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Users.GetUserRequest,
                com.prodonik.genprotos.Users.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGetAllUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.prodonik.genprotos.Users.GetAllUsersResponse>(
                  this, METHODID_GET_ALL_USERS)))
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Users.CreateUserRequest,
                com.prodonik.genprotos.Users.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Users.UpdateUserRequest,
                com.prodonik.genprotos.Users.User>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Users.DeleteUserRequest,
                com.prodonik.genprotos.Users.DeleteUserResponse>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserById(com.prodonik.genprotos.Users.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.GetAllUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(com.prodonik.genprotos.Users.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.prodonik.genprotos.Users.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.prodonik.genprotos.Users.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.prodonik.genprotos.Users.User getUserById(com.prodonik.genprotos.Users.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Users.GetAllUsersResponse getAllUsers(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Users.User createUser(com.prodonik.genprotos.Users.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Users.User updateUser(com.prodonik.genprotos.Users.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Users.DeleteUserResponse deleteUser(com.prodonik.genprotos.Users.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Users.User> getUserById(
        com.prodonik.genprotos.Users.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Users.GetAllUsersResponse> getAllUsers(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Users.User> createUser(
        com.prodonik.genprotos.Users.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Users.User> updateUser(
        com.prodonik.genprotos.Users.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Users.DeleteUserResponse> deleteUser(
        com.prodonik.genprotos.Users.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_ID = 0;
  private static final int METHODID_GET_ALL_USERS = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.prodonik.genprotos.Users.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.GetAllUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.prodonik.genprotos.Users.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.prodonik.genprotos.Users.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.User>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.prodonik.genprotos.Users.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Users.DeleteUserResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.prodonik.genprotos.Users.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getGetAllUsersMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
