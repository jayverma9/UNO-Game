//Jay Verma
//111057834
//CSE 114
//Final Project: UNO
public class Card {
	private String color;
	private int number;
	public Card() {}
	public Card(String color, int number) {
		this.color = color;
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return number + " " + color;
	}
	public boolean equals(Object a) {
		Card i = (Card)a;
		if(color.equals(i.getColor())||number==i.getNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Card c = new Card("Green", 1);
		System.out.println(c.getColor()+" "+c.getNumber());
	}
}
