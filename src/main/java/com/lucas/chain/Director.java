/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.chain;

/**
 *
 * @author Lucas
 */
public class Director extends Approver {

	@Override
	public void processRequest(Purchase purchase){
		if(purchase.get_amount() < 1000.0){
			System.out.println(this.getClass().getSimpleName()+" approved request #"+ purchase.get_number());
		}else if (successor != null){
			successor.processRequest(purchase);
		}
	}
}
