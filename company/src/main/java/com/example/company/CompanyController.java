package com.example.company;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;
    
    @RequestMapping("/companies")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @RequestMapping("/companies/{name}")
    public Optional<Company> getCompany(@PathVariable("name") String name){
        return companyService.getCompany(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/companies")
    public void addCompany(@RequestBody Company c){
        companyService.addCompany(c);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/companies")
    public void updateCompany(@RequestBody Company c){
        companyService.updateCompany(c);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/companies/{name}")
    public void deleteCompany(@PathVariable("name") String name){
        companyService.deleteCompany(name);
    }
}
