package com.smartcompany.blackjack.model.impl;

import com.smartcompany.blackjack.model.CardDeckFactory;
import com.smartcompany.blackjack.model.ICardDeck;

public class CardDeckFactoryImpl extends CardDeckFactory {
	
	public ICardDeck createSingleDeckOfCards() {
		return new CardDeck();
	}

}
