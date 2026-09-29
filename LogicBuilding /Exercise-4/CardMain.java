package com.card;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class CardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Card> cards = new LinkedHashSet<>();
        Set<String> symbols = new TreeSet<>();
        while (symbols.size() < 4) {
            System.out.println("Enter a card:");
            String symbol = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            Card card = new Card(symbol, number);
            cards.add(card);
            symbols.add(symbol.toLowerCase());
        }
        System.out.println(
                "Four symbols gathered in "
                + cards.size() + " cards"
        );
        System.out.println("Cards in Set are:");
        Set<Card> sortedCards = new TreeSet<>(
                (c1, c2) -> {
                    int result = c1.getSymbol()
                            .compareToIgnoreCase(c2.getSymbol());
                    if (result == 0) {
                        result = Integer.compare(
                                c1.getNumber(),
                                c2.getNumber()
                        );
                    }
                    return result;
                }
        );
        sortedCards.addAll(cards);

        for (Card card : sortedCards) {
            System.out.println(card);
        }
        sc.close();
    }
}