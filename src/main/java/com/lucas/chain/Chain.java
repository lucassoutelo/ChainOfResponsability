/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas.chain;

/**
 *
 * @author Lucas
 */
public class Chain {

    public static void main(String[] args) {
        // Setup Chain of Responsibility
		Approver diretor = new Director();
		Approver vice = new VicePresident();
		Approver presidente = new President();

		diretor.setSuccessor(vice);
		vice.setSuccessor(presidente);

		// Generate and process purchase requests
		Purchase purchase = new Purchase(1000.00, "Library Books");
		vice.processRequest(purchase);

		purchase = new Purchase(30500.10, "Lab Machines");
		vice.processRequest(purchase);

		purchase = new Purchase(130500.00, "Apple Mac Books");
		vice.processRequest(purchase);
    }
}
