package week6CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();//instantiated deck and 2 players
		Player p1 = new Player("Ryan");
		Player p2 = new Player("Lily");
		
		deck.shuffle();
		
		
		for (int i=0; i<52; i++) {//iterate 52 times calling draw method on other players
			if (i % 2 == 0) {
				p1.draw(deck);
			} else {
				p2.draw(deck);
			}
		}
		for (int i = 0; i< 26; i++) {//iterate 26 times and call flip method for each player, compares value of each player card, calls increment score method for player w/higher card
			Card c1 = p1.flip();
			Card c2 = p2.flip();
			if(c1.getValue() > c2.getValue()) {
				p1.incrementScore();
				
			}else if (c1.getValue() < c2.getValue()){
				p2.incrementScore();
			}
			
		}System.out.println("Final Score player 1: " + p1.getScore() + " " + p1.getName());//prints final score
		System.out.println("Final Score player 2: " + p1.getScore() + " " + p2.getName());
		
		if(p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 wins!");
		}else if (p1.getScore() < p2.getScore()) {//final winner or draw
			System.out.println("Player 2 wins!");
			
		}else if 
			 (p1.getScore() == p2.getScore()) {
			 System.out.println("Draw");
		} 
			
		
	}
		
}//end class
