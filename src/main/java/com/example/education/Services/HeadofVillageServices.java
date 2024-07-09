package com.example.education.Services;

import com.example.education.Repo.HeadofVillageRepository;
import com.example.education.model.HeadofVillage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadofVillageServices {
    @Autowired
    HeadofVillageRepository headofVillageRepository;

    public HeadofVillage createHeadofVillage( HeadofVillage headofVillage){
        return headofVillageRepository.save(headofVillage);
    }
    public List<HeadofVillage> findAll(){
        return headofVillageRepository.findAll();
    }
    public long countHeadofVillage(){
        return headofVillageRepository.count();
    }

    public void deleteHeadofVillage( Integer id) {
        headofVillageRepository.deleteById(id);
    }

    public HeadofVillage updateHeadofVillage(HeadofVillage headofVillage, Integer id) {
        headofVillage.setId(id);
        return headofVillageRepository.save(headofVillage);
    }
}
