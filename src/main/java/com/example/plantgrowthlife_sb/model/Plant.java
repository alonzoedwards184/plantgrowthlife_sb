package com.example.plantgrowthlife_sb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String  plantName;
    private String  plantGrowthStage;
    private String  nutrientLevel;
    private String  plantDate;

    public Plant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getNutrientLevel() {
        return nutrientLevel;
    }

    public void setNutrientLevel(String nutrientLevel) {
        this.nutrientLevel = nutrientLevel;
    }

    public String getPlantGrowthStage() {
        return plantGrowthStage;
    }

    public void setPlantGrowthStage(String plantGrowthStage) {
        this.plantGrowthStage = plantGrowthStage;
    }

    public String getPlantDate() {
        return plantDate;
    }

    public void setPlantDate(String plantDate) {
        this.plantDate = plantDate;
    }
}
