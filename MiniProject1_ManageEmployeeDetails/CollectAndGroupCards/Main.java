package com.wipro.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        Map<String, ArrayList<Card>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            map.putIfAbsent(symbol, new ArrayList<>());
            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");
        for (String s : map.keySet())
            System.out.print(s + " ");
        System.out.println();

        for (String s : map.keySet()) {
            System.out.println("Cards in " + s + " Symbol");
            int sum = 0;

            for (Card c : map.get(s)) {
                System.out.println(c);
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + map.get(s).size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}