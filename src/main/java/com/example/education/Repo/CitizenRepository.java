package com.example.education.Repo;

import com.example.education.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CitizenRepository  extends JpaRepository<Citizen,Integer> {
}
