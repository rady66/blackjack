package com.smartcompany.blackjack.model;

import com.smartcompany.blackjack.model.impl.CardDeckFactoryImpl;

public abstract class CardDeckFactory {
	
	private final static CardDeckFactory INSTANCE = new CardDeckFactoryImpl();
	
	protected CardDeckFactory(){}
	
	public static CardDeckFactory getInstance(){
		return INSTANCE;
	}
	
	public abstract ICardDeck createSingleDeckOfCards();	

}
