package com.example.education.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Administrator {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String address;

}
