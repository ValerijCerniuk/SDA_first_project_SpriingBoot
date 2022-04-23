package com.sdaProject.controller;

import com.sdaProject.entity.Flower;
import com.sdaProject.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    // Save operation
    @PostMapping("/flowers")
    public Flower saveFlower(
            @Valid @RequestBody Flower flower)
    {
        return flowerService.saveFlower(flower);
    }

    // Read operation
    @GetMapping("/flowers")
    public List<Flower> fetchFlowerList( )
    {
        List<Flower> flowers = flowerService.fetchFlowerList();

        return flowers;
    }

    // Update operation
    @PutMapping("/flowers/{id}")
    public Flower
    updateFlower(@RequestBody Flower flower,
                     @PathVariable("id") Integer flowerId)
    {
        return flowerService.updateFlower(
                flower, flowerId);
    }

    // Delete operation
    @DeleteMapping("/flowers/{id}")
    public String deleteFlowerById(@PathVariable("id")
                                       Integer flowerId)
    {
        flowerService.deleteFlowerById(
                flowerId);
        return "Deleted Successfully";
    }
}
