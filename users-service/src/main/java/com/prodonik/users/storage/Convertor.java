package com.prodonik.users.storage;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.Users.User;
import com.prodonik.users.entities.EUser;

@Service
public class Convertor {
    public EUser toEntity(User userProto) {
        EUser user = new EUser();
        user.setId(UUID.fromString(userProto.getId()));
        user.setUsername(userProto.getUsername());
        user.setPassword(userProto.getPassword());
        user.setEmail(userProto.getEmail());
        user.setFirstName(userProto.getFirstName());
        user.setLastName(userProto.getLastName());

        return user;
    }

    public User toProto(EUser user) {
        User.Builder userProtoBuilder = User.newBuilder()
                .setId(user.getId().toString())
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setEmail(user.getEmail());

        if (user.getFirstName() != null) {
            userProtoBuilder.setFirstName(user.getFirstName());
        }
        
        if (user.getLastName() != null) {
            userProtoBuilder.setLastName(user.getLastName());
        }

        return userProtoBuilder.build();
    }
}
