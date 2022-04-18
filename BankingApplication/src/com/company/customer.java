package com.company;

import java.util.ArrayList;

public class customer {
    private String name;
    private ArrayList<Double> transactions;

    public customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions (double amount){
        this.transactions.add(amount); //AutoBoxing - transforming primitive to array class
    }
}
