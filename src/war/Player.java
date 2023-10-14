package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
// Fields
	
	List <Card> hand = new ArrayList<Card> () ;
	int score;
	String name;
	
// Constructor
	
	Player (String name, int score, List<Card> hand) {
	this.name = name;
	this.score = 0;
	this.hand = hand;
}
	

// Methods	
	
public void describe () {
	System.out.println(this.name + "  --  " + score);
	for (Card playersHand : this.hand) {
		playersHand.describe();
	}
}

public Card flip (List<Card> hand) {
	return hand.remove(0);
	
} 

public void draw (Deck gameDeck) {
	hand.add(gameDeck.draw());
}

public void incrementScore () {
   score++;
 }

//Getters and Setters

public List<Card> getHand() {
	return hand;
}

public void setHand(List<Card> hand) {
	this.hand = hand;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}









