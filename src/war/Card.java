package war;

public class Card {

// Fields
	
	int value;
	
	String name;
	
	String suit;
	
// Constructor
	
Card (String name, String suit, int value) {
	this.name = name;
	this.value = value;
	this.suit = suit;
	
}

// Methods

public void describe () {
	System.out.println(this.name + " " + "of" + " " + this.suit + "     " + this.value);
}

// Getters and Setters

public  int getvalue () {
	return value;
}
	
public void setValue(int value) {
	this.value = value;
}

public String getName () {
	return name;
}
	public void setName(String name) {
		this.name = name;
		
	}


	
}
