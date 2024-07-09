package com.example.education.Controller;

import com.example.education.Services.HeadofVillageServices;
import com.example.education.model.HeadofVillage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/head")
public class HeadofVillageController {
    @Autowired
    public HeadofVillageServices headofVillageServices;

 @PostMapping("/post-head")
    public HeadofVillage createHeadofVillage(HeadofVillage village){
        return  headofVillageServices.createHeadofVillage(village);
    }
@GetMapping("/get-head")
public List<HeadofVillage> findAll(){
     return headofVillageServices.findAll();
}
@GetMapping("/count-head")
public long countHeadofVillage(){
     return headofVillageServices.countHeadofVillage();
}
@DeleteMapping("/head/{id}")
    public void deleteHeadofVillage(@PathVariable Integer id){
     headofVillageServices.deleteHeadofVillage(id);
}
@PutMapping("/head/{id}")
    public HeadofVillage updateHeadofVillage(@RequestBody HeadofVillage headofVillage,@PathVariable Integer id){
     headofVillage.setId(id);
     return headofVillageServices.updateHeadofVillage(headofVillage ,id);
}
}
