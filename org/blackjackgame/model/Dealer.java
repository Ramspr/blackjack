package org.blackjackgame.model;

import java.util.Scanner;

import org.blackjackgame.impl.DealerHand;
public class Dealer implements Person{
	
	DealerHand dealerHand = new DealerHand();
			
	@Override
	public void deal() {
		
		//CardDeck deck = CardDeck.getInstance();
		Cards card = deck.dealCard();
		if(dealerHand.size() == 0) {
			System.out.println("Dealing to dealer , card: face down");
		} else {
			System.out.println("Dealing to dealer , card "+dealerHand.getCards());
		}
		dealerHand.addCard(card);
		// TODO Auto-generated method stub
	}
	
	@Override
	public void play() {
		boolean isPlaying = true;
		System.out.println("Dealing to computer , card "+dealerHand.getCards()+"Hit or Stand ");
		while(isPlaying) {
			Scanner sc = new Scanner(System.in);
			String action = sc.nextLine();	
			if(action.equalsIgnoreCase("hit")) {
				Cards card = deck.dealCard();
				dealerHand.addCard(card);
				System.out.println("Dealing to player , card "+dealerHand.getCards());
				if(dealerHand.totalCount() == 21) {
					isPlaying = false;
					System.out.println("Player is busted");
				} else if(dealerHand.totalCount() > 21) {
					isPlaying = false;
				} else {
					isPlaying = strategy(dealerHand.totalCount());
				}
			} else {
				isPlaying = false;
			}
			}
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return dealerHand.totalCount();
	}
}
