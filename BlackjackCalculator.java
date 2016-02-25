package com.smartcompany.blackjack;

import com.smartcompany.blackjack.model.ICard;

class BlackjackCalculator {
	
	private final static BlackjackCalculator INSTANCE = new BlackjackCalculator();
	
	private BlackjackCalculator() {}
	
	static BlackjackCalculator getInstance() {
		return INSTANCE;
	}
	
	int calculateScore(ICard card1, ICard card2) {
		return card1.getFace().getValue() + card2.getFace().getValue();		
	}

}
