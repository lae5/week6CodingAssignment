package week6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();//list of card
	
	
	public Deck() {//constructor
		
		
		List<String> cValue = new ArrayList<String>();//card fields,populate 52 cards
		cValue.add("2");
		cValue.add("3");
		cValue.add("4");
		cValue.add("5");
		cValue.add("6");
		cValue.add("7");
		cValue.add("8");
		cValue.add("9");
		cValue.add("10");
		cValue.add("Jack");
		cValue.add("Queen");
		cValue.add("King");
		cValue.add("Ace");
		
		List<String> cName = new ArrayList<String>();
		cName.add("Hearts");
		cName.add("Spades");
		cName.add("Diamonds");
		cName.add("Clubs");
		
		String name = "";
		
			for (int y = 0; y < cValue.size(); y++) {
				
				for (int i = 0; i < cName.size(); i++) {	
				name =  cName.get(i) + " of " + cValue.get(y);
			Card addC = new Card(name, i+1);
			cards.add(addC);
		
				}System.out.println(name);	
		}
		
		
		}
	

	public void shuffle()  {//randomize order of cards
		Collections.shuffle(cards);
		
	}
	public Card draw() {//method to remove and return top card
		Card drawnTopCard = new Card(null, 0);
		if (cards.size() == 0) {
			System.out.println("Deck empty!");
			return null;
		}else {
			drawnTopCard = cards.get(0);
			cards.remove(0);
			return drawnTopCard;
		}
		
	}
	
		
}

