package com.smartcompany.blackjack;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.smartcompany.blackjack.model.CardDeckFactory;
import com.smartcompany.blackjack.model.CardFace;
import com.smartcompany.blackjack.model.CardSuit;
import com.smartcompany.blackjack.model.ICard;
import com.smartcompany.blackjack.model.ICardDeck;

public class Blackjack {
	
	private final ICardDeck deck = CardDeckFactory.getInstance().createSingleDeckOfCards();
	private final Scanner keyboard = new Scanner(System.in);

	public void start() {
		System.out.println("You have a card deck: " + deck);
		ICard card1 = getCardFromInput(keyboard);	
		ICard card2 = getCardFromInput(keyboard);
		System.out.println("Result: " + BlackjackCalculator.getInstance().calculateScore(card1, card2));
	}

	private ICard getCardFromInput(Scanner keyboard) {		
		ICard card = null;
		while (card == null) {
			System.out.print("Please enter a valid/unicked card from the deck (e.g. 'TEN,HEARTS'): ");
			String cardStr = keyboard.nextLine();
			card = pickCard(cardStr);
		}				
		return card;
	}

	private ICard pickCard(String cardStr) {
		StringTokenizer tokenizer = new StringTokenizer(cardStr, ",");
		if (tokenizer.countTokens() != 2) {
			return null;
		}
		CardFace face = CardFace.valueOf(tokenizer.nextToken());
		CardSuit suit = CardSuit.valueOf(tokenizer.nextToken());
		return deck.pickCard(face, suit);
	}

}
