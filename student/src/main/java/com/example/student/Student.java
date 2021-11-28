package com.example.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student{
    @Id
    private String usn;
    private String name;
    private String branch;
    private float cgpa;
    private String emailid;
    private String phone;
    private String company;


    public Student() {
    }

    public Student(String usn, String name, String branch, float cgpa, String emailid, String phone, String company) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.emailid = emailid;
        this.phone = phone;
        this.company = company;
    }

    public String getUsn() {
        return this.usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getEmailid() {
        return this.emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}