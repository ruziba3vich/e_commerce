package com.prodonik.users.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.prodonik.users.entities.EUser;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepo extends JpaRepository<EUser, UUID> {
    Optional<EUser> findById(UUID userId);
    List<EUser> findAll();
    <S extends EUser> S save(S entity);
    void deleteById(UUID userId);
    void delete(EUser user);
    Optional<EUser> findByUsername(String username);

    @Modifying
    @Transactional
    @Query("UPDATE EUser u SET u.balance = u.balance + :newBalance WHERE u.id = :id")
    void updateUserBalance(@Param("newBalance") long newBalance, @Param("id") UUID id);
}
