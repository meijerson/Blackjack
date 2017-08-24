package com.example.kenzie.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>(52);
        populateCards();
}

    public void populateCards() {
        cards.add(new Card(2, 1, "2Club"));
        cards.add(new Card(2, 2, "2Spade"));
        cards.add(new Card(2, 3, "2Heart"));
        cards.add(new Card(2, 4, "2Diamond"));
        cards.add(new Card(3, 5, "3Club"));
        cards.add(new Card(3, 6, "3Spade"));
        cards.add(new Card(3, 7, "3Heart"));
        cards.add(new Card(3, 8, "3Diamond"));
        cards.add(new Card(4, 9, "4Club"));
        cards.add(new Card(4, 10, "4Spade"));
        cards.add(new Card(4, 11, "4Heart"));
        cards.add(new Card(4, 12, "4Diamond"));
        cards.add(new Card(5, 13, "5Club"));
        cards.add(new Card(5, 14, "5Spade"));
        cards.add(new Card(5, 15, "5Heart"));
        cards.add(new Card(5, 16, "5Diamond"));
        cards.add(new Card(6, 17, "6Club"));
        cards.add(new Card(6, 18, "6Spade"));
        cards.add(new Card(6, 19, "6Heart"));
        cards.add(new Card(6, 20, "6Diamond"));
        cards.add(new Card(7, 21, "7Club"));
        cards.add(new Card(7, 22, "7Spade"));
        cards.add(new Card(7, 23, "7Heart"));
        cards.add(new Card(7, 24, "7Diamond"));
        cards.add(new Card(8, 25, "8Club"));
        cards.add(new Card(8, 26, "8Spade"));
        cards.add(new Card(8, 27, "8Heart"));
        cards.add(new Card(8, 28, "8Diamond"));
        cards.add(new Card(9, 29, "9Club"));
        cards.add(new Card(9, 30, "9Spade"));
        cards.add(new Card(9, 31, "9Heart"));
        cards.add(new Card(9, 32, "9Diamond"));
        cards.add(new Card(10, 33, "10Club"));
        cards.add(new Card(10, 34, "10Spade"));
        cards.add(new Card(10, 35, "10Heart"));
        cards.add(new Card(10, 36, "10Diamond"));
        cards.add(new Card(10, 37, "JClub"));
        cards.add(new Card(10, 37, "JSpade"));
        cards.add(new Card(10, 38, "JHeart"));
        cards.add(new Card(10, 39, "JDiamond"));
        cards.add(new Card(10, 40, "QClub"));
        cards.add(new Card(10, 41, "QSpade"));
        cards.add(new Card(10, 42, "QHeart"));
        cards.add(new Card(10, 43, "QDiamond"));
        cards.add(new Card(10, 44, "KClub"));
        cards.add(new Card(10, 45, "KSpade"));
        cards.add(new Card(10, 46, "KHeart"));
        cards.add(new Card(10, 47, "KDiamond"));
        cards.add(new Card(10, 48, "AClub"));
        cards.add(new Card(10, 49, "ASpade"));
        cards.add(new Card(10, 50, "AHeart"));
        cards.add(new Card(10, 51, "ADiamond"));
    }

    public Card drawCard() {
        Boolean cardChosen = false;
        Random rand = new Random();
        while (cardChosen == false) {
            int randomNumber = rand.nextInt(52);
            if (cards.get(randomNumber).getHasCardBeenDrawn() == false) {
                cards.get(randomNumber).setHasCardBeenDrawn(true);
                return cards.get(randomNumber);
            }
        }
        return null;
    }

    public void shuffleDeck() {
        for (int i = 0; i < 52; i++) {
            cards.get(i).setHasCardBeenDrawn(false);
        }
    }
}
