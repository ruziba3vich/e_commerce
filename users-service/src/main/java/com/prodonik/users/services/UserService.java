package com.prodonik.users.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prodonik.genprotos.UserServiceGrpc;
import com.prodonik.genprotos.Users.CreateUserRequest;
import com.prodonik.genprotos.Users.DeleteUserRequest;
import com.prodonik.genprotos.Users.DeleteUserResponse;
import com.prodonik.genprotos.Users.GetAllUsersResponse;
import com.prodonik.genprotos.Users.GetUserRequest;
import com.prodonik.genprotos.Users.UpdateUserBalanceRequest;
import com.prodonik.genprotos.Users.UpdateUserBalanceResponse;
import com.prodonik.genprotos.Users.UpdateUserRequest;
import com.prodonik.genprotos.Users.User;
import com.prodonik.users.errors.UserAlreadyExistsException;
import com.prodonik.users.errors.UserDoesNotExistsException;
import com.prodonik.users.storage.UserRepoImple;

import io.grpc.stub.StreamObserver;
import io.grpc.Status;

@Service
public class UserService extends UserServiceGrpc.UserServiceImplBase {
    private UserRepoImple userRepoImple;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserService(UserRepoImple userRepoImple) {
        this.userRepoImple = userRepoImple;
    }
    
    @Override
    public void createUser(CreateUserRequest request, StreamObserver<User> responseObserver) {
        logger.info("came request to CREATE USER METHOD");
        System.out.printf("user id %s\nusername %s\npassword %s\n",
                request.getUser().getId(),
                request.getUser().getUsername(),
                request.getUser().getPassword());
        try {
            User user = userRepoImple.createUser(request.getUser());
            responseObserver.onNext(user);
            responseObserver.onCompleted();
        } catch (UserAlreadyExistsException e) {
            logger.info(e.getMessage() + " 1");
            responseObserver.onError(Status.ALREADY_EXISTS.withDescription(e.getMessage()).asRuntimeException());
        } catch (Exception e) {
            logger.info(e.getMessage() + " 2");
            responseObserver.onError(Status.INTERNAL.withDescription("Internal server error").withCause(e).asRuntimeException());
        }
    }

    @Override
    public void getAllUsers(com.google.protobuf.Empty request, StreamObserver<GetAllUsersResponse> responObserver) {
        logger.info("came request to GET ALL USERS METHOD");
        responObserver.onNext(
            GetAllUsersResponse
                    .newBuilder()
                    .addAllUsers(this.userRepoImple.getAllUsers())
                    .build()
        );
        responObserver.onCompleted();
    }

    @Override
    public void getUserById(GetUserRequest request, StreamObserver<User> responObserver) {
        logger.info("came request to GET USER BY ID METHOD");
        try {
            Optional<User> user = this.userRepoImple.getUserById(UUID.fromString(request.getUserId()));
            responObserver.onNext(user.get());
            responObserver.onCompleted();
        } catch (UserDoesNotExistsException e) {
            logger.info(e.getMessage());
            responObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        } catch (Exception e) {
            logger.info(e.getMessage());
            responObserver.onError(Status.INTERNAL.withDescription("Internal server error").withCause(e).asRuntimeException());
        }
    }

    @Override
    public void updateUser(UpdateUserRequest request, StreamObserver<User> responseObserver) {
        logger.info("came request to UPDATE USER BY ID METHOD");
        try {
            User user = this.userRepoImple.updateUserById(UUID.fromString(request.getUserId()), request.getUpdatedUser());
            responseObserver.onNext(user);
            responseObserver.onCompleted();
        } catch (UserDoesNotExistsException e) {
            logger.info(e.getMessage());
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asException());
        } catch (Exception e) {
            logger.info(e.getMessage());
            responseObserver.onError(Status.INTERNAL.withCause(e).asException());
        }
    }

    @Override
    public void deleteUser(DeleteUserRequest request, StreamObserver<DeleteUserResponse> responseObserver) {
        logger.info("came request to DELETE USER BY ID METHOD");
        try {
            this.userRepoImple.deleteUserById(UUID.fromString(request.getUserId()));
            responseObserver.onNext(
                DeleteUserResponse
                            .newBuilder()
                            .setMessage("user has successfully been deleted")
                            .build()
            );
            responseObserver.onCompleted();
        } catch (UserDoesNotExistsException e) {
            logger.info(e.getMessage() + " 1");
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asException());
        } catch (Exception e) {
            logger.info(e.getMessage());
            responseObserver.onError(Status.INTERNAL.withCause(e).asException());
        }
    }

    @Override
    public void updateUserBalance(UpdateUserBalanceRequest request, StreamObserver<UpdateUserBalanceResponse> responseObserver) {
        try {
            logger.info("came request to UPDATE USER BALANCE BY ID METHOD");
            this.userRepoImple.updateUserBalance(request);
            responseObserver.onNext(
                UpdateUserBalanceResponse.newBuilder()
                                            .setMessage("comleted successfully")
                                            .build()
            );
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).asException());
        }
    }
}

// this.userRepoImple.updateUserBalance(request)
