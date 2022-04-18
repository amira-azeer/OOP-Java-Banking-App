package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Banking Application");
        bank bank = new bank("National Australian Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Amira", 25.00);
        bank.addCustomer("Adelaide", "Mike", 75.34);
        bank.addCustomer("Adelaide", "Percy", 23.45);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);
        bank.addCustomerTransaction("Adelaide", "Amira", 56.89);
        bank.addCustomerTransaction("Adelaide", "Amira", 2000.00);
        bank.addCustomerTransaction("Adelaide", "Mike", 23.00);

        bank.addCustomerTransaction("Melbourne", "Amani", 2300.00);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);
    }
}
