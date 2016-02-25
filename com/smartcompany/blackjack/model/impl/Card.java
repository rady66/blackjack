package com.smartcompany.blackjack.model.impl;

import com.smartcompany.blackjack.model.CardFace;
import com.smartcompany.blackjack.model.CardSuit;
import com.smartcompany.blackjack.model.ICard;

class Card implements ICard {

	private final CardFace face;
	private final CardSuit suit;

	Card(CardFace face, CardSuit suit) {
		this.face = face;
		this.suit = suit;
	}

	@Override
	public CardFace getFace() {
		return face;
	}

	@Override
	public CardSuit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return "Card[" + face + "," + suit + "]";
	}
}
