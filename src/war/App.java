package war;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Instantiate a Deck and two players, call the shuffle method on the deck.	
		Deck deck = new Deck();
		
		List<Card> hand1 = new ArrayList<Card>();
		List<Card> hand2 = new ArrayList<Card>();
		String firstPlayer = "Tannon";
		String secondPlayer = "McKell";
		Player player1 = new Player(firstPlayer, 0, hand1);
		Player player2 = new Player(secondPlayer, 0, hand2);
		
		
		
		
		// In player class do I need to have a method to create the hand when a deck is added?
		
		deck.shuffle();
		
		// Deal the cards 
		for (int i = 0 ; i < 52 ; i++) {
			if (i % 2 == 0) {
			hand1.add(deck.draw());
			
			} else {hand2.add(deck.draw());
				
			}
		}
		
		
// automated rounds
		
		
		for (int i = 1; i <= 26 ; i++) {
			// indicate the beginning of each new round
			
			System.out.println("---------------Round "+ i + "---------------" + "\n");
			
			// create a card for each player using the flip method
			
			Card card1 = player1.flip(hand1);
			
			Card card2 = player2.flip(hand2);
			
			// indicate which card each player drew
			
		System.out.print(player1.getName() + " has the "); card1.describe();
		System.out.print(player2.getName() + " has the "); card2.describe();
		
		
		// pull the value for the cards drew
		int card1Value = card1.getvalue();
		int card2Value = card2.getvalue();
		
			
			
		// Compare the value of the cards drawn to determine the winner of the round
		
		if(card1Value > card2Value ) {
			player1.incrementScore(); 
			System.out.println("\n" + player1.getName()+ " wins this round and is awarded a point!" +"\n");
		}
			
			else if (card1Value < card2Value) {
				player2.incrementScore();
				System.out.println("\n" + player2.getName()	+ " wins this round and is awarded a point!" +"\n");
		} else System.out.println("\n" + "Tie -- No point is awarded" +"\n");
		
		// display the current score of each player
		System.out.println( player1.getName() + "'s" + " Score:" + player1.getScore());
		System.out.println( player2.getName() + "'s" + " Score: " + player2.getScore() + "\n\n");
		
		
		}
		System.out.println("\n\n\n");
		System.out.println("-------------Game Over-------------");
		
		System.out.println("Final scores:");
		System.out.println(player1.getName() + " : " + player1.getScore());
		System.out.println(player2.getName() + " : " + player2.getScore());
		
		System.out.println("\n\n");
		// declare winner of the game
		
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("The ULTIMATE WINNER is " + player1.getName() + "!!!!!");
		} else System.out.println("The ULTIMATE WINNER is " + player2.getName() + "!!!!!");
		
		
			
		
		}
		
		
	
	
		

	}


