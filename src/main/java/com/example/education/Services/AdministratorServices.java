package com.example.education.Services;

import com.example.education.Repo.AdministratorRepository;
import com.example.education.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AdministratorServices {
    @Autowired
    public AdministratorRepository administratorRepository;

    public Administrator createAdministrator(Administrator administrator) {
        return  administratorRepository.save(administrator);
    }

    public List<Administrator> listAdminstrators() {
        return administratorRepository.findAll();
    }
}
