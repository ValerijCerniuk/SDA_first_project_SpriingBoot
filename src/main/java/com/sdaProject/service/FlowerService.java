package com.sdaProject.service;


import com.sdaProject.entity.Flower;

import java.util.List;

public interface FlowerService {

    // Save operation
    Flower saveFlower(Flower flower);

    // Read operation
    List<Flower> fetchFlowerList();

    // Update operation
    Flower updateFlower(Flower flower,
                        Integer flowerId);

    // Delete operation
    void deleteFlowerById(Integer flowerId);

}

