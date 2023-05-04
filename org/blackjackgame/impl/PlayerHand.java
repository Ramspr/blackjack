package org.blackjackgame.impl;

import java.util.ArrayList;
import java.util.List;

import org.blackjackgame.model.Cards;
import org.blackjackgame.model.Hand;

public class PlayerHand extends Hand{

	List<Cards> playerCards = new ArrayList<>();
	
	@Override
	public void addCard(Cards card) {
		playerCards.add(card);
	}
	
	@Override
	public String getCards() {
		/*StringBuilder sb = new StringBuilder(); 
		for(int i=0;i<playerCards.size();i++) {
			if(i != playerCards.size()-1) {
				sb.append(playerCards.toString());
				sb.append(",");
			} else {
				sb.append(playerCards.toString());
			}
		}

		return sb.toString();
		*/
		return playerCards.toString();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return playerCards.size();
	}

	
	@Override
	public int totalCount() {
		//return playerCards.stream().map(element -> element.getValue());
		return playerCards.stream().map(element -> element.getValue()).reduce(0, (x,y) -> x+y);
	}
}
