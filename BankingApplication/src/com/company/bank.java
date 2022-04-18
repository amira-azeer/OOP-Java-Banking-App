package com.company;

import java.util.ArrayList;

public class bank {
    private String name;
    private ArrayList<branch>branches;

    public bank(String name) {
        this.name = name;
        this.branches = new ArrayList<branch>();
    }

    public boolean addCustomerTransaction(String branchName, String nameOfCustomer, double amount){
        branch branchSearch = findBranch(branchName);
        if(branchSearch != null){
            return branchSearch.addCustomerTransaction(nameOfCustomer, amount);
        }
        return false;
    }

    public boolean addCustomer(String branchName, String nameOfCustomer, double initialTransaction){
        branch branchSearch = findBranch(branchName);
        if(branchSearch != null){
            return branchSearch.newCustomer(nameOfCustomer, initialTransaction);
        }
        return false;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)!=null){
            System.out.println("Branch addition was unsuccessful");
            return true;
        }
        else{
            this.branches.add(new branch(branchName));
            return false;
        }
    }

    private branch findBranch(String branchName){
        for(int i=0; i<branches.size(); i++){
            branch checkedBranch = branches.get(i);
            if(checkedBranch.equals(branchName)){
                System.out.println("Branch exists");
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransactions){
        branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch "+branch.getName());
            ArrayList<customer>branchCustomers =branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer Name: "+branchCustomer.getName());
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double>transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("Transaction count: "+(j+1)+transactions.get(j));
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

}
