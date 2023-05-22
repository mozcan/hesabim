package com.mozcan.adapters.item.jpa.repository;

import com.mozcan.adapters.item.jpa.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemJpaRepository extends JpaRepository<ItemEntity, Long> {
}
