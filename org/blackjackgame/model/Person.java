package org.blackjackgame.model;

public interface Person {
	
	CardDeck deck = new CardDeck();
	//strategy
	public default boolean strategy(int totalCount) {
		if(totalCount < 21 && totalCount > 16) {
			return false;
		} else {
			return true;
		}
	}
	
	public void deal();
	
	public void play();
	
	public int getTotalCount();
	
	public default void decide(Player player, Dealer dealer) {
		if(player.getTotalCount() > 21) {
			System.out.println("Scoring player 2 busted.  Dealer wins.");
		} else {
			if(dealer.getTotalCount() > 21) {
				System.out.println("Scoring player has "+player.getTotalCount()+", dealer has "+dealer.getTotalCount()+". Player wins"); 
			} else {
				if(player.getTotalCount() > dealer.getTotalCount()) {
					System.out.println("Scoring player has "+player.getTotalCount()+", dealer has "+dealer.getTotalCount()+". Player wins"); 
				} else {
					System.out.println("Scoring player has "+player.getTotalCount()+", dealer has "+dealer.getTotalCount()+". dealer wins"); 
				}
			}
		}
	}
}
