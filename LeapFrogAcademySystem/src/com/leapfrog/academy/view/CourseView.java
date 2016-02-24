/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

import com.leapfrog.academy.entity.Course;
import com.leapfrog.academy.service.CourseService;
import com.leapfrog.academy.service.impl.CourseServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class CourseView extends AbstractView {
    
    CourseService courseService=new CourseServiceImpl();

    @Override
    public void controller() {
        while(true){
            
            boolean back=false;
        menu();
        
        switch(input.nextInt()){
            
            case 1:
                add();
              break;
                
            case 2:
                update();
                break;
            
            case 3:
                delete();
                break;
                
            case 4:
                export();
                break;
              case 5:
                showAll();
                break;
            
            case 6:
                showById();
                break;
                
            case 7:
                back=true;
                
                break;
        }
        
        if(back){
            break;
        }
        }
        
        
        
    }

    private void menu() {
        System.out.println("=========================");
        System.out.println("===Welcome To CourseView===");
        System.out.println("=========================");
        System.out.println("1.Add");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Save in File");
        System.out.println("5.Show All Information");
        System.out.println("6.Search Course by ID");
        System.out.println("7.Search");
        System.out.println("8.Back");
        System.out.print("Enter your Choice[1-7]");
        }

    private void add() {
        
        while(true){        
        Course c= new Course();
        
        
        System.out.println("Enter Id:");
        c.setId(input.nextInt());
        System.out.println("Enter Name:");
        c.setName(input.next());
        System.out.println("Enter Description:");
        c.setDescription(input.next());
        System.out.println("Enter Fee:");
        c.setFees(input.nextDouble());
        System.out.println("Enter Status:");
        c.setStatus(input.nextBoolean());
        courseService.insert(c);
        System.out.println("Insert Success");
        
            System.out.println("Do you want to add more course?[Y/N]");
            if(input.next().equalsIgnoreCase("N")){
                break;
            }
        }
        
        
    }
    
    private void showAll(){
        
        
        if(!courseService.getAll().isEmpty()){
        courseService.getAll().forEach(c->{
        
            System.out.println(c.toString());
        
        });
        }
        else{
            System.out.println("No information is available");
        }
        
    }

    private void delete() {
        checkAvailable();
                
                System.out.println("Enter id to Delete:");
                if(courseService.delete(input.nextInt())==1){
                     System.out.println("Delete Success");
                    
                }else{
                    System.out.println("Id not found ");
                }
                
    }

    private void showById() {
        checkAvailable();
           System.out.println("Enter ID:");
           
               Course course=courseService.getById(input.nextInt());
               if(course!=null){
                  System.out.println(course.toString());
               }
               else{
                   System.out.println("This Id is not available");
               }
    }

    private void update() {
        checkAvailable();
        
        if(courseService.getAll().isEmpty()){
            System.out.println("Please Insert First");
        }else{
         while(true){        
        Course c= new Course();
        
        System.out.println("Enter Id:");
        c.setId(input.nextInt());
        System.out.println("Enter Name:");
        c.setName(input.next());
        System.out.println("Enter Description:");
        c.setDescription(input.next());
        System.out.println("Enter Fee:");
        c.setFees(input.nextDouble());
        System.out.println("Enter Status:");
        c.setStatus(input.nextBoolean());
        courseService.update(c);
        System.out.println("Update  Success");
        
            System.out.println("Do you want to Update more course?[Y/N]");
            if(input.next().equalsIgnoreCase("N")){
                break;
            }
        }
        
    }
}
 private void checkAvailable() {
        
          if (courseService.getAll().isEmpty()) {

              System.out.println("No Imformation are Available"); 
              
              
    }else{
              
          }

}

  private void export() {
//        List<Course> courseList=new ArrayList<Course>();
//        courseList=courseService.getAll();
//        
//        courseList.forEach(cs->{
//        
//        
//        
//        });
       
    
}
}