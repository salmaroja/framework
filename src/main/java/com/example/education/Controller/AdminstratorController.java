package com.example.education.Controller;

import com.example.education.Services.AdministratorServices;
import com.example.education.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Administrator")

public class AdminstratorController {

    public AdministratorServices administratorServices;
    @PostMapping
    public Administrator addAdministrator(@RequestBody Administrator administrator){
        return administratorServices.createAdministrator(administrator);
    }
    @GetMapping
    public List<Administrator> listAdministrators(){
        return administratorServices.listAdminstrators();
    }


}
