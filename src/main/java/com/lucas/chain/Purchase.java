/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.chain;

/**
 *
 * @author Lucas
 */

import java.util.Random;

public class Purchase {
    double amount;
    String name;
    int number;
    public Purchase(double amount, String name){
        Random random = new Random();
        this.number = random.nextInt(1000 - 0) + 0;
        set_amount(amount);
        set_name(name);
        System.out.println("The request "+this.number+" is "+this.name+" in the amount of "+this.amount+" moneys");
    }
    
    public int get_number(){
        return this.number;
    }
    
    public void set_amount(double amount){
        this.amount = amount;
    }
    
    public void set_name(String name){
        this.name = name;
    }
    
    public double get_amount(){
        return this.amount;
    }
}
