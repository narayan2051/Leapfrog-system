/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.service.impl;

import com.leapfrog.academy.dao.CourseDAO;
import com.leapfrog.academy.dao.impl.CourseDAOImpl;
import com.leapfrog.academy.entity.Course;
import com.leapfrog.academy.service.CourseService;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class CourseServiceImpl implements CourseService {

    private CourseDAO courseDAO;

    public CourseServiceImpl() {
        courseDAO = new CourseDAOImpl();
    }

    @Override
    public void export(String filename, String content) throws IOException {
        
        courseDAO.export(filename, content);
    }

    @Override
    public void LoadFromFile(String fileName) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Course t) {

        return courseDAO.insert(t);
    }

    @Override
    public int update(Course t) {

        return courseDAO.update(t);
    }

    @Override
    public int delete(int id) {

        return courseDAO.delete(id);
    }

    @Override
    public Course getById(int id) {

        return courseDAO.getById(id);
    }

    @Override
    public List<Course> getAll() {
        return courseDAO.getAll();
    }

    @Override
    public List<Course> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
