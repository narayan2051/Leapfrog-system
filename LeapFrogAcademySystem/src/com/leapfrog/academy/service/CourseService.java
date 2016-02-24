/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.service;


import com.leapfrog.academy.entity.Course;
import java.io.IOException;

/**
 *
 * @author Narayan
 */
public interface CourseService extends GenericService<Course>{
    
    void export(String filename, String content) throws IOException;
    void LoadFromFile(String fileName) throws IOException;
    
    
}
