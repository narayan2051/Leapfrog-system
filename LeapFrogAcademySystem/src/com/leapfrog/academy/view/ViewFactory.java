/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

import java.util.HashMap;

/**
 *
 * @author Narayan
 */
public class ViewFactory {
    
    
    private static HashMap<String, AbstractView> views=initViews();
    
    private static HashMap<String,AbstractView> initViews(){
        
        HashMap<String,AbstractView> allViews=new HashMap<>();
        allViews.put("1", new CourseView());
        allViews.put("2", new StudentView());
        allViews.put("3", new FacilitatorView());
        allViews.put("4", new ExitView());
        return allViews;
        
    }
    private static boolean isKey(String key){
        return views.containsKey(key);
    }
    public static AbstractView getValue(String key){
        
        if(isKey(key)){
            
            return views.get(key);
            
        }
       return null;
        
    }
    
}
