package org.blackjackgame.model;

public enum Symbol {
	
	CLUBS("Clubs"),
	SPADES("Spades"),
	HEARTS("Hearts"),
	DIAMONDS("Diamonds");
	
	private String name;
	
	Symbol(String symbolName) {		
		this.name = symbolName;			
	}								
	 
	 @Override
	 public String toString() {
		 return name;
	 }


}
