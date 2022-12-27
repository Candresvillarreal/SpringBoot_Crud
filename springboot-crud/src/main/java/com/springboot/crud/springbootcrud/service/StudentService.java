package com.springboot.crud.springbootcrud.service;

import com.springboot.crud.springbootcrud.model.Student;
import com.springboot.crud.springbootcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listAll(){
        return studentRepository.findAll(); //findAll() is a method provided by JPARepository from StudentRepository
    }

    public void save(Student student){
        studentRepository.save(student);    //save() is a method provided by JPARepository from StudentRepository
    }

    public Student get(Integer id){
        return studentRepository.findById(id).get();    //findById(id).get(); is a method provided by JPARepository from StudentRepository
    }

    public void delete(Integer id){
        studentRepository.deleteById(id);    //delete() is a method provided by JPARepository from StudentRepository
    }



}
