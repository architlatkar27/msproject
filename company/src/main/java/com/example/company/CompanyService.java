package com.example.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
   
    @Autowired
    private CompanyRepository companyRepository;

    public void addCompany(Company c){
        companyRepository.save(c);
    }
    public Optional<Company> getCompany(String name){
        return companyRepository.findById(name);
    }
    public List<Company> getAllCompanies(){
        Iterable<Company> iter = companyRepository.findAll();
        List<Company> companies = new ArrayList<>();
        iter.forEach(companies::add);
        return companies;
    }
    public void updateCompany(Company c){
        companyRepository.save(c);
    }
    public void deleteCompany(String name){
        companyRepository.deleteById(name);
    }
}
