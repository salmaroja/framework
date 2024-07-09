package com.example.education.Controller;

import com.example.education.Services.CitizenServices;
import com.example.education.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/citizen")
public class CitizenController {
    @Autowired
    private CitizenServices citizenServices;

    @PostMapping("/post-citizen")
    public Citizen addCitizen(@RequestBody Citizen citizen) {
        return citizenServices.createCitizen(citizen);
    }

    @GetMapping("/get-citizen")
    public List<Citizen> findAll() {
        return citizenServices.findAll();
    }

    @GetMapping("/count-citizen")
    public long countCitizens() {
        return citizenServices.countCitizens();
    }

    @DeleteMapping("/citizen/{id}")
    public void deleteCitizen(@PathVariable Integer id) {
        citizenServices.deleteCitizen(id);
    }

    @PutMapping("/update/{id}")
    public Citizen updateCitizen(@RequestBody Citizen citizen, @PathVariable Integer id) {
        citizen.setId(id);
        return citizenServices.updateCitizen(citizen, id);
    }
}
