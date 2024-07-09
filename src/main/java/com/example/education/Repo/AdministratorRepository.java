package com.example.education.Repo;

import com.example.education.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdministratorRepository extends JpaRepository<Administrator,Integer> {

}
