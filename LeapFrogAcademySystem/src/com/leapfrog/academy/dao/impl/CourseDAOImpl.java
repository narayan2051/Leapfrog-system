/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.dao.impl;

import com.leapfrog.academy.dao.CourseDAO;
import com.leapfrog.academy.entity.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class CourseDAOImpl implements CourseDAO {

    private List<Course> courseList;

    public CourseDAOImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    public CourseDAOImpl() {
        courseList = new ArrayList<>();
    }

    @Override
    public int insert(Course t) {
        courseList.add(t);
        return 1;

    }

    @Override
    public int update(Course t) {
        try{
            courseList.set(courseList.indexOf(t), t);
            return 1;
        }catch (Exception ex){
            ex.printStackTrace();
            
        }
        return 0;
    }

    @Override
    public int delete(int id) {
            Course c=getById(id);
            if (c!=null) {
                courseList.remove(c);
                return 1;   
            }
        return 0;

    }

    @Override
    public Course getById(int id) {
        
        for(Course c: courseList){
            if(c.getId()==id){
                return c;
            }
        }
       return null;
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public List<Course> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void export(String filename, String content) throws IOException {
        FileWriter writer=new FileWriter(new File(filename));
        writer.write(content);
        writer.close();
        

    
    }

    @Override
    public void LoadFromFile(String fileName) throws IOException {

//        FileReader reader= new FileReader(new File(fileName));
//        int i=0;
//        while((i=reader.read())!=-1){
//            
//            System.out.println((char)i);
//        }
//        reader.close();
        
        BufferedReader reader= new BufferedReader(new FileReader(new File(fileName)));
        
        String str="";
        
        while((str=reader.readLine())!=null){
            
            System.out.println(str);
            
        }
        reader.close();
        
    }

}
