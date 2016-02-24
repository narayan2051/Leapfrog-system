/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy;

import com.leapfrog.academy.view.AbstractView;
import com.leapfrog.academy.view.ViewFactory;
import java.util.Scanner;

/**
 *
 * @author Narayan
 */
public class Program {
    
    public static void menu(){
        System.out.println("=========================");
        System.out.println("===Welcome To Leapfrog===");
        System.out.println("=========================");
        System.out.println("1.Courses");
        System.out.println("2.Student");
        System.out.println("3.Facilitator");
        System.out.println("4.Exit");
        System.out.print("Enter your Choice[1-5]");
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
        menu();
        
        AbstractView view= ViewFactory.getValue(input.next());
        
        if(view!=null){
            view.setInput(input);
            view.controller(); 
        }
        else{
            System.out.println("Invalid Choice");
        }
        
        }
        
    }
    
}
