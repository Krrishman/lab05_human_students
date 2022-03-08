/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Arrays;

/**
 *
 * @author soblab
 */
public class Senior extends Student
{
    private int credits;
    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        this.credits = credits;
    }
    @Override
    public String toString(){
        return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nCredits: " + this.credits;
    }
}
