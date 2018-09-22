//Jay Verma
//111057834
//CSE 114
//Final Project: UNO
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < 4; j++) {
				switch (j) {
				case 0:
					deck.add(new Card("Red", i));
					break;
				case 1:
					deck.add(new Card("Green", i));
					break;
				case 2:
					deck.add(new Card("Blue", i));
					break;
				case 3:
					deck.add(new Card("Yellow", i));
					break;
				}
			}
		}
	}

	public void draw(ArrayList<Card> a) {
		a.add(deck.get(deck.size() - 1));
		deck.remove(deck.size() - 1);
	}

	public void putBack(ArrayList<Card> a) {
		for (int i = 0; i < a.size(); i++) {
			deck.add(a.get(i));
			a.remove(i);
		}
	}

	public void distribute(ArrayList<Card> playerDeck, ArrayList<Card> compDeck) {
		for (int j = 0, i = (deck.size() - 1); j < 10; j++, i--) {
			if (i % 2 == 0) {
				playerDeck.add(deck.get(i));
				deck.remove(i);
			} else {
				compDeck.add(deck.get(i));
				deck.remove(i);
			}
		}
	}

	public boolean firstTurn(ArrayList<Card> compDeck, ArrayList<Card> playerDeck) {
		if (playerDeck.get(0).getNumber() > compDeck.get(0).getNumber()) {
			return true;
		} else if (playerDeck.get(0).getNumber() == compDeck.get(0).getNumber()) {
			putBack(compDeck);
			putBack(playerDeck);
			shuffle();
			draw(compDeck);
			draw(playerDeck);
			return firstTurn(compDeck, playerDeck);
		} else {
			return false;
	}
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

}