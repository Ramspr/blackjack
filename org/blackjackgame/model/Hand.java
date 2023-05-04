package org.blackjackgame.model;

import java.util.ArrayList;
import java.util.List;
public abstract class Hand {
	
	
	
	public abstract void addCard(Cards card);
	//cards.add(card);
	//}
	public void initialDeal() {
		
	}
	
	public abstract String getCards();
	
	public abstract int size();
	
	public abstract int totalCount();
	
	/*public String getCards() {
		StringBuilder sb = new StringBuilder(); 
		for(int i=0;i<cards.size();i++) {
			if(i != cards.size()-1) {
				sb.append(cards.toString());
				sb.append(",");
			} else {
				sb.append(cards.toString());
			}
		}

		return sb.toString();
	}*/
}
