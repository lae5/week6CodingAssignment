package week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {//instance variables
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
	}

	

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void describe() {//prints out player info
		System.out.println(name);
		for(int i =0; i < hand.size(); i++) {
			hand.get(i).describe();
		}

	}



	public void draw(Deck deck) { //calls draw method
		Card card = deck.draw();
		hand.add(card);
		
	}



	public Card flip() {  //removes and returns top card
		Card topCard = hand.get(hand.size()-1);
		hand.remove(topCard);
		
		return topCard;
	}



	public void incrementScore() {//adds 2 to player score
	 score = score + 1;
		
	}



	
	
	
	
	

}//end class
