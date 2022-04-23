package com.sdaProject.service;

import com.sdaProject.entity.Flower;
import com.sdaProject.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FlowerServiceImp implements FlowerService{
    @Autowired
    private FlowerRepository flowerRepository;

    // Save operation
    @Override
    public Flower saveFlower(Flower flower)
    {
        return flowerRepository.save(flower);
    }

    // Read operation
    @Override public List<Flower> fetchFlowerList()
    {
        return (List<Flower>)
                flowerRepository.findAll();
    }

    // Update operation
    @Override
    public Flower
    updateFlower(Flower flower,
                   Integer flowerId)
    {
        Flower flowerDB
                = flowerRepository.findById(flowerId)
                .get();

        if (Objects.nonNull(flower.getName())
                && !"".equalsIgnoreCase(
                flower.getName())) {
            flowerDB.setName(
                    flower.getName());
        }

        if (Objects.nonNull(
                flower.getFlowerPrice())
                && !"".equalsIgnoreCase(
                String.valueOf(flower.getFlowerPrice()))) {
            flowerDB.setFlowerPrice(
                    flower.getFlowerPrice());
        }

        if (Objects.nonNull(flower.getColor())
                && !"".equalsIgnoreCase(
                flower.getColor())) {
            flowerDB.setColor(
                    flower.getColor());
        }

        return flowerRepository.save(flower);
    }

    // Delete operation
    @Override
    public void deleteFlowerById(Integer flowerId)
    {
        flowerRepository.deleteById(flowerId);
    }
}

