package com.sdaProject.controller;


import com.sdaProject.entity.FlowersOrder;
import com.sdaProject.service.FlowersOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FlowersOrderController {

    @Autowired
    private FlowersOrderService flowersOrderService;

    // Save operation
    @PostMapping("/flowersOrders")
    public FlowersOrder saveFlowersOrder(
            @RequestBody @Valid FlowersOrder flowersOrder)
    {
        return flowersOrderService.saveFlowersOrder(flowersOrder);
    }

    // Read operation
    @GetMapping("/flowersOrders")
    public List<FlowersOrder> fetchFlowersOrderList()
    {
        return flowersOrderService.fetchFlowersOrderList();
    }

    // Update operation
    @PutMapping("/flowersOrders/{id}")
    public FlowersOrder
    updateFlowersOrder(@RequestBody FlowersOrder flowersOrder,
                 @PathVariable("id") Integer flowersOrderId) {
        return flowersOrderService.updateFlowersOrder(
                flowersOrder, flowersOrderId);
    }

    // Delete operation
    @DeleteMapping("/flowersOrders/{id}")
    public String deleteFlowersOrderById(@PathVariable("id")
                                         Integer flowersOrderId) {
        flowersOrderService.deleteFlowersOrderById(
                flowersOrderId);
        return "Deleted Successfully";
    }
}

