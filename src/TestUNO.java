//Jay Verma
//111057834
//CSE 114
//Final Project: UNO
import java.util.ArrayList;

public class TestUNO {
	public static void main(String[] args) {
		System.out.println("WELCOME to UNO!");
		System.out.println("Choose appropriate indices while playing" );
		System.out.println("-1: To draw another card");
		System.out.println("-2: If your card doesn't matches after drawing");
		int toss = 0;
		ArrayList<Card> playerDeck = new ArrayList<Card>();
		ArrayList<Card> compDeck = new ArrayList<Card>();
		ArrayList<Card> discarded = new ArrayList<Card>();
		Deck deck = new Deck();
		deck.shuffle();

		Play r = new Play();

		deck.draw(compDeck);
		deck.draw(playerDeck);
		boolean f = deck.firstTurn(compDeck, playerDeck);
		deck.putBack(compDeck);
		deck.putBack(playerDeck);
		deck.shuffle();
		deck.distribute(playerDeck, compDeck);
		discarded.add(deck.getDeck().get(deck.getDeck().size() - 1));
		while (toss == 0) {
			System.out.println();
			System.out.println("Discarded Pile");
			for (Card w : discarded) {
				System.out.println(w);
			}
			System.out.println("__________________________________________________________");
			System.out.println("__________________________________________________________");
			if (f == true) {
				if(r.playerPlay(deck.getDeck(), playerDeck, discarded)) {
					f = false;
				}
				else {r.playerPlay(deck.getDeck(), playerDeck, discarded);
				f = false;}
				if (playerDeck.size() == 0) {
					toss = 1;
					System.out.println("You Won!!");
				}
			}

			else {
				r.compPlay(deck.getDeck(), compDeck, discarded);

				if (compDeck.size() == 0) {
					toss = 1;
					System.out.println("Computer Wins!!");
				}
				f = true;
			}
		}
	}
}
