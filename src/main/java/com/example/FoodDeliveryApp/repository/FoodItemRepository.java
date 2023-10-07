package com.example.FoodDeliveryApp.repository;

import com.example.FoodDeliveryApp.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem , Integer> {
}
