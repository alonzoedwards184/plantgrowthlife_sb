package com.example.plantgrowthlife_sb.controller;

import com.example.plantgrowthlife_sb.model.Plant;
import com.example.plantgrowthlife_sb.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    private PlantService plantService;

    @PostMapping("/add")
    public String add(@RequestBody Plant plant){
        plantService.savePlant(plant);
        return "New plant is added";
    }
    @GetMapping("/getAll")
    public List<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }
}
