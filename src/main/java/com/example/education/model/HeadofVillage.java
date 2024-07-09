package com.example.education.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class HeadofVillage {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String address;

}
