package com.sdaProject.repository;

import com.sdaProject.entity.FlowersOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowersOrderRepository extends JpaRepository<FlowersOrder,Integer> {
}
