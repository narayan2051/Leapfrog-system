/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.dao.impl;

import com.leapfrog.academy.dao.StudentDAO;
import com.leapfrog.academy.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class StudentDAOImpl implements StudentDAO{
    
    private List<Student> studentList;

    public StudentDAOImpl() {
        studentList=new ArrayList<>();
    }

    public StudentDAOImpl(List<Student> studentList) {
        this.studentList = studentList;
    }
    

   
    
    

    @Override
    public int insert(Student t) {
        
        studentList.add(t);
        return 1;
        
    }

    @Override
    public int update(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        
        Student s=getById(id);
        if(s!=null){
            studentList.remove(s);
            
        }
        return 0;
       
    }

    @Override
    public Student getById(int id) {
        for(Student s: studentList){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
       return studentList;
    }

    @Override
    public List<Student> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
