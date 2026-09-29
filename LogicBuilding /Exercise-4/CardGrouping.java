package com.card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class CardGrouping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, List<Card>> cardMap = new HashMap<>();

        System.out.print("Enter Number of Cards: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            String symbol = sc.nextLine();

            int number = sc.nextInt();
            sc.nextLine();

            symbol = symbol.toLowerCase();

            Card card = new Card(symbol, number);

            if (!cardMap.containsKey(symbol)) {
                cardMap.put(symbol, new ArrayList<Card>());
            }

            cardMap.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are:");

        TreeSet<String> sortedSymbols =
                new TreeSet<>(cardMap.keySet());

        for (String symbol : sortedSymbols) {
            System.out.print(symbol);
        }

        System.out.println();

        for (String symbol : sortedSymbols) {

            List<Card> cards = cardMap.get(symbol);

            int sum = 0;

            System.out.println("Cards in " + symbol + " Symbol");

            for (Card card : cards) {

                System.out.println(card);

                sum = sum + card.getNumber();
            }

            System.out.println("Number of cards: " + cards.size());

            System.out.println("Sum of Numbers: " + sum);
        }

        sc.close();
    }
}