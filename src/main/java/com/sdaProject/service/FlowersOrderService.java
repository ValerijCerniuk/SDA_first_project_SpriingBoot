package com.sdaProject.service;

import com.sdaProject.controller.FlowersOrderController;
import com.sdaProject.entity.FlowersOrder;

import javax.validation.Valid;
import java.util.List;

public interface FlowersOrderService {

    // Save operation
    FlowersOrder saveFlowersOrder(@Valid FlowersOrder flowersOrder);

    // Read operation
    List<FlowersOrder> fetchFlowersOrderList();

    // Update operation
    FlowersOrder updateFlowersOrder(FlowersOrder flowersOrder,
                                    Integer flowersOrderId);

    // Delete operation
    void deleteFlowersOrderById(Integer flowersOrderId);
}
