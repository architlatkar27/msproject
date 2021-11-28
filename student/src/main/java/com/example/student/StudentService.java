package com.example.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    //get all students
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
    //get student by usn
    public Optional<Student> getStudent(String usn){
        return studentRepository.findById(usn);
    }
    //post student object
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    //update student by object
    public void updateStudent(Student s){
        studentRepository.save(s);
    }
    //delete student
    public void deleteStudent(String usn){
        studentRepository.deleteById(usn);
    }

    public void companySelects(List<String> usns, String company){
        for(String usn: usns){
            Optional<Student> s = studentRepository.findById(usn);
            if(s.isPresent()){
                Student st = s.get();
                st.setCompany(company);
                studentRepository.save(st);
            }else{
                System.out.println("usn: "+usn+" is not present");
            }
        }
    }
}
