package week6CodingAssignment;


public class Card {

	private int value;//instance variables
	private String name;
	
	
	public Card (String name, int value) {//constructor
		this.name = name;
		this.value = value;
	}
	
	public void describe() {//method describe
		System.out.println(value + " of " + name);
		
	}
	public String getName() {//getters/setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}//end class
