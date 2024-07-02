package com.prodonik.users.storage;

import java.util.Optional;
import java.util.UUID;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.Users.User;
import com.prodonik.users.entities.EUser;
import com.prodonik.users.errors.UserAlreadyExistsException;
import com.prodonik.users.errors.UserDoesNotExistsException;
import com.prodonik.users.repositories.UserRepo;


@Service
public class UserRepoImple {
    private UserRepo userRepo;
    private Convertor convertor;

    public UserRepoImple(UserRepo userRepo, Convertor convertor) {
        this.userRepo = userRepo;
        this.convertor = convertor;
    }

    public User createUser(User request) throws UserAlreadyExistsException {
        Optional<EUser> euser = this.userRepo.findByUsername(request.getUsername());

        if (euser.isPresent()) {
            throw new UserAlreadyExistsException("User already exists");
        }
        return this.convertor.toProto(userRepo.save(this.convertor.toEntity(request)));
    }

    public Optional<User> getUserById(UUID userId) throws UserDoesNotExistsException {
        Optional<EUser> euser = this.userRepo.findById(userId);
        if (euser.isPresent()) {
            return Optional.of(this.convertor.toProto(euser.get()));
        }
        throw new UserDoesNotExistsException("user has not been found");
    }

    public List<User> getAllUsers() {
        return this.userRepo.findAll().stream()
                .map(this.convertor::toProto)
                .collect(Collectors.toList());
    }

    public User updateUserById(UUID userId, User newUser) throws UserDoesNotExistsException {
        Optional<EUser> euser = this.userRepo.findById(userId);

        if (euser.isPresent()) {
            EUser updatedEntity = this.convertor.toEntity(newUser);
            updatedEntity.setId(userId);
            return this.convertor.toProto(this.userRepo.save(updatedEntity));
        }
        throw new UserDoesNotExistsException("User does not exist");
    }

    public void deleteUserById(UUID userId) throws UserDoesNotExistsException {
        if (this.userRepo.findById(userId).isPresent()) {
            this.userRepo.deleteById(userId);
        } else {
            throw new UserDoesNotExistsException("User not found");
        }
    }
}
