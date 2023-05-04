package org.blackjackgame.model;

import java.util.*;


public class CardDeck {
	
	private List<Cards> deck = new ArrayList<>();
	
	private static CardDeck cardDeck;
	
	public CardDeck(){
		for (CardValue r : CardValue.values()) { 	
			for (Symbol s : Symbol.values()) {
				deck.add(new Cards(r, s)); 
			}									
		}
	}
	
	public List<Cards> getDeck(){
		return deck;
	}
	
	public Cards dealCard() {
		Random randomCard = new Random();
		int index = randomCard.nextInt(deck.size());
		return deck.remove(deck.get(index).getValue());
	}
	/*public static CardDeck getInstance() {
			if(cardDeck == null) {
				cardDeck = new CardDeck();
			}
			return cardDeck;
	}*/
}
