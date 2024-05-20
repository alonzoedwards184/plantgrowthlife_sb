package com.example.plantgrowthlife_sb.service;

import com.example.plantgrowthlife_sb.model.Plant;
import java.util.List;

public interface PlantService {
    Plant savePlant(Plant plant);
    List<Plant> getAllPlants();
}
