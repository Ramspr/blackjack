package org.blackjackgame.model;

import java.util.Scanner;

import org.blackjackgame.impl.PlayerHand;
public class Player implements Person{

	PlayerHand playerHand = new PlayerHand();

	//CardDeck deck = new CardDeck();

	@Override
	public void deal() {
		
		//CardDeck deck = CardDeck.getInstance();
		Cards card = deck.dealCard();
		playerHand.addCard(card);
		System.out.println("Dealing to player , card "+playerHand.getCards());
		System.out.println(playerHand.totalCount());		
	}
	
	@Override
	public void play() {
		boolean isPlaying = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dealing to player , card "+playerHand.getCards()+"Hit or Stand ");
		//int handValue = playerHand.totalCount();
		while(isPlaying) {
		String action = sc.nextLine();	
		if(action.equalsIgnoreCase("hit")) {
			Cards card = deck.dealCard();
			playerHand.addCard(card);
			System.out.println("Dealing to player , card "+playerHand.getCards());
			if(playerHand.totalCount() == 21) {
				isPlaying = false;
				System.out.println("Player has blackjack");
			} else if(playerHand.totalCount() > 21) {
				isPlaying = false;
				System.out.println("Player is busted");
			} else {
				isPlaying = strategy(playerHand.totalCount());
			}
		} else {
			isPlaying = false;
		}
		}
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return playerHand.totalCount();
	}
	
}
