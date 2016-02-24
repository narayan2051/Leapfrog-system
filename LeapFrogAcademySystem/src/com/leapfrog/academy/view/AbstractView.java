/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

import java.util.Scanner;

/**
 *
 * @author Narayan
 */
public abstract class AbstractView {
    protected Scanner input;
    
    public abstract void controller();
    
    public void setInput(Scanner input){
        this.input=input;
    }
}
