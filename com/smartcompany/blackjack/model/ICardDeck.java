package com.smartcompany.blackjack.model;

/**
 * Interface for a card deck
 */
public interface ICardDeck {
	/**
	 * Picks/removes a card from the deck
	 * @param face card face
	 * @param suit card suit
	 * @return true if it is available and removed
	 */
	ICard pickCard(CardFace face, CardSuit suit);

}
