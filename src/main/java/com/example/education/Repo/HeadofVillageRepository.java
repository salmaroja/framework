package com.example.education.Repo;

import com.example.education.model.HeadofVillage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadofVillageRepository extends JpaRepository<HeadofVillage,Integer> {



}
