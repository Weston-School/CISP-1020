//  Weston Hale
//  A00267225
//  January 24th, 2024
//  Bank Account Tester


import java.util.ArrayList;
import java.util.Scanner;

import src.Account;

class BankAccountTester {
    public static void main(String[] args){

        ArrayList<Account> accounts = new ArrayList<Account>();
        Scanner in = new Scanner(System.in);

        // Number of accounts to create
        System.out.print("Number of accounts to add:");
        int desired_count = in.nextInt();

        for(int i = 0; i < desired_count; i++){

            // Inputs
            System.out.print("Enter Account Number:");
            int acc_num = in.nextInt();

            System.out.print("Enter Account Balance: $");
            double acc_bal = in.nextDouble();

            // Create and add the new account
            Account new_account = new Account(acc_num, acc_bal);
            accounts.add(new_account);
        }

        display_accounts(accounts);
        //System.out.println(accounts);
        display_total(accounts);
        in.close();
    }


    // gets the number of accounts and the total bank value
    static double display_total(ArrayList<Account> accounts){

        double total = 0.0;
        for (Account acc : accounts) { 
            total += acc.get_balance();
        }
        System.out.printf("Num of Accounts: %d  Bank Total: $%.2f\n", accounts.size(), total); 
        return total;
    }

    // Loops over the accounts and outputs the account number and its balance
    static void display_accounts(ArrayList<Account> accounts){

        System.out.println("Account Report");
        for (Account acc : accounts) {      
            System.out.printf("Account: %d Balance: $%.2f\n", acc.get_account(), acc.get_balance()); 
        }
    }
}