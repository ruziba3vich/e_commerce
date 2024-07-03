package com.prodonik.products.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodonik.products.entities.EHistory;


public interface HistoryRepo extends JpaRepository<EHistory, UUID> {
    List<EHistory> getByClientId(UUID userId);
    @SuppressWarnings("unchecked")
    EHistory save(EHistory entity);
}
