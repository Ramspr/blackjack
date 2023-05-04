package org.blackjackgame.app;

import java.util.Scanner;

import org.blackjackgame.impl.Game;

public class BlackjackGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("./blackjack 3");
		Game game = new Game();
		System.out.println("Total Number of Players ");
		Scanner sc = new Scanner(System.in);
		int totalPlayers = sc.nextInt();
		game.startGame(totalPlayers);
		
	}

}
