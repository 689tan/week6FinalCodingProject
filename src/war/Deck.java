package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	
	

// Fields
	List<Card> cards = new ArrayList<Card>();
	
	
// Constructor
	
	Deck () {
		String [] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String [] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"
		};
		
		for(String suit : suits) {
			int value = 2;
					for (String number : numbers) {
						Card card = new Card(number, suit, value);
						this.cards.add(card);
						value++;
						
			}
		}
	}
	
// Methods
	
	public void describe () {
		for (Card card : this.cards) {
			card.describe();
		}	
	}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}	
	
// Getters and Setters
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}


