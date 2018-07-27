package com.MarqueBurgess;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// HashTable Java Program
        //Create hash map
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names; //key
        String str;
        double bal;

        balance.put("Zara", 3434.34);
        balance.put("Mahnaz", 123.22);
        balance.put("Ayan", 1378.00);
        balance.put("Daisy", 99.22);
        balance.put("Abdul", -139.08);
        balance.put("Toya", 634.34);
        balance.put("Manny",2923.22);
        balance.put("Andre", 9728.00);
        balance.put("Dana", 90.22);
        balance.put("Quincy", 225.08);

        // Balances in hash table.
        names = balance.keys();

        while(names.hasMoreElements()) {//will run while there are keys
            str = names.nextElement(); //string set to key
            System.out.println(str + ": " + balance.get(str)); //print by key
        }
        System.out.println();

        // Deposit 650 into Manny's account
        bal = balance.get("Manny");
        balance.put("Manny", bal + 650);
        System.out.println("Manny's new balance: " + balance.get("Manny"));
        System.out.println();

        // Withdraw 155 from Dana's account
        bal = balance.get("Dana");
        balance.put("Dana", bal - 155);
        System.out.println("Dana's new balance: " + balance.get("Dana"));
        System.out.println();

        // Deposit 1,025 into Zara's account
        bal = balance.get("Zara");
        balance.put("Zara", bal + 1025);
        System.out.println("Zara's new balance: " + balance.get("Zara"));
        System.out.println();

        // Withdraw 7,900 from Andre's account
        bal = balance.get("Andre");
        balance.put("Andre", bal - 7900);
        System.out.println("Andre's new balance: " + balance.get("Andre"));
    }
}
