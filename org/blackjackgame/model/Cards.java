package org.blackjackgame.model;

public class Cards {
	private CardValue cardValues;
	private Symbol symbol;
	
	public Cards(CardValue values, Symbol symbol) {
		super();
		this.cardValues = values;
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Cards "+cardValues + " " + symbol;
	}
	
	public int getValue() {			
		return cardValues.getValue();	
	}
}
