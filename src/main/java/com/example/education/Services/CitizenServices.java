package com.example.education.Services;

import com.example.education.Repo.CitizenRepository;
import com.example.education.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class CitizenServices {
    @Autowired
    public CitizenRepository citizenRepository;


    public Citizen createCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    public List<Citizen> findAll() {
        return citizenRepository.findAll();
    }

    public long countCitizens() {
        return citizenRepository.count();
    }

   public void deleteCitizen(Integer id){
        citizenRepository.deleteById(id);


    }



 public Citizen updateCitizen(Citizen citizen, Integer id){
        citizen.setId(id);
        return citizenRepository.save(citizen);
 }
}
