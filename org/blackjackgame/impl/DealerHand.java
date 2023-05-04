package org.blackjackgame.impl;

import java.util.ArrayList;
import java.util.List;

import org.blackjackgame.model.Cards;
import org.blackjackgame.model.Hand;

public class DealerHand extends Hand{

	List<Cards> dealerCards = new ArrayList<>();
	
	@Override
	public void addCard(Cards card) {
		//super.addCard(card);
		dealerCards.add(card);
	}
	
	@Override
	public String getCards() {
		/*StringBuilder sb = new StringBuilder(); 
		
		for(int i=0;i<dealerCards.size();i++) {
			if(i != dealerCards.size()-1) {
				sb.append(dealerCards.toString());
				sb.append(",");
			} else {
				sb.append(dealerCards.toString());
			}
		}

		return sb.toString();*/
		return dealerCards.toString();
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return dealerCards.size();
	}

	@Override
	public int totalCount() {
		return (int) dealerCards.stream().map(element -> element.getValue()).count();
	}
}
