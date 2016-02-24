/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

/**
 *
 * @author Narayan
 */
public class ExitView extends AbstractView{

    @Override
    public void controller() {
        
        showExitScreen();
        
    }
    
    private  void showExitScreen(){
        System.out.println("Are you sure do you want exit?[Y/N]");
        if(input.next().equalsIgnoreCase("Y")){
            System.exit(0);
        }
    }
    
}
