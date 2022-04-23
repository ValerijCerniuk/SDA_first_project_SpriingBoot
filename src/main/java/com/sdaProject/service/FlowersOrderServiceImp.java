package com.sdaProject.service;

import com.sdaProject.entity.FlowersOrder;
import com.sdaProject.repository.FlowersOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Service
public class FlowersOrderServiceImp
        implements FlowersOrderService{

    @Autowired
    private FlowersOrderRepository flowersOrderRepository;

    // Save operation
    @Override
    public FlowersOrder saveFlowersOrder(FlowersOrder flowersOrder)
    {
        return flowersOrderRepository.save(flowersOrder);
    }

    // Read operation
    @Override
    public List<FlowersOrder> fetchFlowersOrderList()
    {
        return (List<FlowersOrder>)
                flowersOrderRepository.findAll();
    }

    // Update operation
    @Override
    public FlowersOrder
    updateFlowersOrder(FlowersOrder flowersOrder,
                       Integer flowersOrderId)
    {
        FlowersOrder flowersOrderDB
                = flowersOrderRepository.findById(flowersOrderId)
                .get();

        if (Objects.nonNull(flowersOrder.getOrderDate())
                && !"".equalsIgnoreCase(
                flowersOrder.getOrderDate())) {
            flowersOrderDB.setOrderDate(
                    flowersOrder.getOrderDate());
        }

        if (Objects.nonNull(
                flowersOrder.getDeliveryDay())
                && !"".equalsIgnoreCase(
                flowersOrder.getDeliveryDay())) {
            flowersOrderDB.setDeliveryDay(
                    flowersOrder.getDeliveryDay());
        }

        return flowersOrderRepository.save(flowersOrderDB);
    }

    // Delete operation
    @Override
    public void deleteFlowersOrderById(Integer flowersOrderId)
    {
        flowersOrderRepository.deleteById(flowersOrderId);
    }
}

