/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.chain;

/**
 *
 * @author Lucas
 */
public abstract class Approver {
	
	protected Approver successor;

	public void setSuccessor(Approver successor){
		this.successor = successor;
    }

	public abstract void processRequest(Purchase purchase);
	
}