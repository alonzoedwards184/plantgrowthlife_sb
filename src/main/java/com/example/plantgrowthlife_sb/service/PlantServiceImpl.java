package com.example.plantgrowthlife_sb.service;

import com.example.plantgrowthlife_sb.model.Plant;
import com.example.plantgrowthlife_sb.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService{
    @Autowired
    private PlantRepository plantRepository;

    @Override
    public Plant savePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    @Override
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }
}
