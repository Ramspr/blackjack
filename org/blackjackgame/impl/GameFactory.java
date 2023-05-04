package org.blackjackgame.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.blackjackgame.model.Dealer;
import org.blackjackgame.model.GameFactory;
import org.blackjackgame.model.Person;
import org.blackjackgame.model.Player;

public class Game extends GameFactory{
	
	public void startGame(int totalPlayers) {
		//prepareDeck();
		Dealer dealer = new Dealer();
		System.out.println("Starting Game with "+ totalPlayers +" Players");
		System.out.println("Shuffling");
		List<Player> activePlayers = bet(totalPlayers);
		activePlayers.stream().forEach(player -> player.deal());
		dealer.deal();
		activePlayers.stream().forEach(player -> player.deal());
		dealer.deal();
		activePlayers.stream().forEach(player -> player.play());
		dealer.play();
		//endGame(activePlayers, dealer);
		activePlayers.stream().forEach(player -> player.decide(player, dealer));
		//activePlayers.
		
		//activePlayers.streamUtil
		//dealPlayers(activePlayers);
	}

	/*private void prepareDeck() {
		CardDeck.getInstance();
	}*/

	

	private List<Player> bet(int totalPlayers) {
		List<Player> playerList = new ArrayList<Player>();
		for(int i=0;i<totalPlayers;i++) {
			//Person  = getPersonType("Player");
			System.out.println("Player "+i+" betting");
			Scanner sc = new Scanner(System.in);
			String isPlayerBetting = sc.nextLine();
			if(isPlayerBetting.equalsIgnoreCase("Yes")) {
				playerList.add((Player) getPersonType("Player"));
			} 
		}
		return playerList;
	}

	@Override
	public Person getPersonType(String personType) {
		if(personType.equalsIgnoreCase("Player")) {
			return new Player();
		} else if(personType.equalsIgnoreCase("Dealer")){
			return new Dealer();
		}
		return null;
	}
}
