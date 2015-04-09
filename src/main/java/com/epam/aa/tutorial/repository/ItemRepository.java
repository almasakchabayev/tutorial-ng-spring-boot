package com.epam.aa.tutorial.repository;

import com.epam.aa.tutorial.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
