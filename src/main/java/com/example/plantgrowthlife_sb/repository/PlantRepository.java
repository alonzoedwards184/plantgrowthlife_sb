package com.example.plantgrowthlife_sb.repository;

import com.example.plantgrowthlife_sb.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PlantRepository extends JpaRepository<Plant, Integer>{
}
