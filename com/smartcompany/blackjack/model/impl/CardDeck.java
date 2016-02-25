package com.smartcompany.blackjack.model.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.smartcompany.blackjack.model.CardFace;
import com.smartcompany.blackjack.model.CardSuit;
import com.smartcompany.blackjack.model.ICard;
import com.smartcompany.blackjack.model.ICardDeck;

class CardDeck implements ICardDeck {

	private final Set<ICard> cards;

	CardDeck() {
		cards = createDeckCards();
	}
	
	public Set<ICard> getCards() {
		return Collections.unmodifiableSet(cards);
	}

	private Set<ICard> createDeckCards() {
		Set<ICard> deckCards = new HashSet<ICard>();
		for (CardFace face : CardFace.values()) {
			for (CardSuit suit : CardSuit.values()) {
				deckCards.add(new Card(face, suit));
			}
		}
		return deckCards;
	}
	
	@Override
	public ICard pickCard(CardFace face, CardSuit suit) {
		for (ICard card: cards) {
			if (card.getFace().equals(face) && card.getSuit().equals(suit)) {
				cards.remove(card);
				return card;
			}			
		}
		return null;
		
	}

	@Override
	public String toString() {
		return super.toString() + " [cards=" + cards + "]";
	}	

}
