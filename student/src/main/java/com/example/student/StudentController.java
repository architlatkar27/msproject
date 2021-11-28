package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/student/{usn}")
    public Optional<Student> getStudent(@PathVariable("usn") String usn){
        return studentService.getStudent(usn);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public String addStudent(@RequestBody Student student){
        try{
            studentService.addStudent(student);
            return "success";
        }catch(Exception e){
            return "failure";
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{usn}")
    public String updateStudent(@RequestBody Student student, @PathVariable("usn") String usn){
        try{
            studentService.updateStudent(student);
            return "update success";
        }catch(Exception e){
            return "update failure";
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{usn}")
    public String deleteStudent(@PathVariable("usn") String usn){
        try{
            studentService.deleteStudent(usn);
            return "delete successful";
        }catch(Exception e){
            return "delete failed";
        }
    }

    @RequestMapping(method=RequestMethod.PUT, value="/{company}/selects")
    public void companySelects(@PathVariable("usn") String company, @RequestBody List<String> usns){
        studentService.companySelects(usns, company);
    }
}
