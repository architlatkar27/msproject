package com.example.company;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
    
    @Id
    private String name;
    private String role;
    private String location;
    private Float ctc;


    public Company() {
    }

    public Company(String name, String role, String location, Float ctc) {
        this.name = name;
        this.role = role;
        this.location = location;
        this.ctc = ctc;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Float getCtc() {
        return this.ctc;
    }

    public void setCtc(Float ctc) {
        this.ctc = ctc;
    }

    // public Company name(String name) {
    //     setName(name);
    //     return this;
    // }

    // public Company role(String role) {
    //     setRole(role);
    //     return this;
    // }

    // public Company location(String location) {
    //     setLocation(location);
    //     return this;
    // }

    // public Company ctc(Float ctc) {
    //     setCtc(ctc);
    //     return this;
    // }

}
