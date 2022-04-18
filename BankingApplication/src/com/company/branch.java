package com.company;

import java.util.ArrayList;

public class branch {
    private String name;
    private ArrayList<customer> customers;//Separate list of customers for each branch

    public branch(String name) {
        this.name = name;
        this.customers = new ArrayList<customer>();//Initializing in constructor is best practise
    }

    public String getName() {
        return name;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName)==null){
            this.customers.add(new customer(customerName, initialTransaction));
            System.out.println("New customer added successfully");
            return true;
        }
        else{
            System.out.println("Customer already exists");
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(transaction);
            System.out.println("New transaction added successfully");
            return true;
        }
        else{
            System.out.println("Customer transaction unsuccessful");
            return false;
        }
    }

    private customer findCustomer(String customerName){
        //This method is private because it is used within this branch only!
        //This method is returning a customer
        for(int i=0; i<customers.size(); i++) {
            customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
