//Jay Verma
//111057834
//CSE 114
//Final Project: UNO
import java.util.ArrayList;
import java.util.Scanner;

public class Play extends Deck{

	public void compPlay(ArrayList<Card> deck, ArrayList<Card> compDeck, ArrayList<Card> discarded) {
		System.out.println("Computer's Choices: ");
		for (Card e : compDeck) {
			System.out.println(e);
		}
		for (Card a : compDeck) {
			if (a.equals(discarded.get(discarded.size() - 1))) {
				discarded.add(a);
				compDeck.remove(a);
				return;
			}
		}
		draw(compDeck);
	}

	public boolean playerPlay(ArrayList<Card> deck, ArrayList<Card> playerDeck, ArrayList<Card> discarded) {
		Scanner input = new Scanner(System.in);

		System.out.println("Your Choices:");
		int count = 0;
		for (Card e : playerDeck) {
			System.out.println(count++ + ": " + e);
		}
		int choice = input.nextInt();
		switch (choice) {
		case -2: return true;
		case -1:
			draw(playerDeck);
			return false;
		case 0:
			if (playerDeck.get(0).equals(discarded.get(discarded.size() - 1))) {
				discarded.add(playerDeck.get(0));
				playerDeck.remove(0);
				return true;
			}
			break;
		case 1:
			if (playerDeck.get(1).equals(discarded.get(discarded.size() - 1))) {
				discarded.add(playerDeck.get(1));
				playerDeck.remove(1);
				return true;
			}
			break;
		case 2:
			if (playerDeck.get(2).equals(discarded.get(discarded.size() - 1))) {
				discarded.add(playerDeck.get(2));
				playerDeck.remove(2);
				return true;
			}
			break;
		case 3:
			if (playerDeck.get(3).equals(discarded.get(discarded.size() - 1))) {
				discarded.add(playerDeck.get(3));
				playerDeck.remove(3);
				return true;
			}
			break;
		default:
			if (playerDeck.get(4).equals(discarded.get(discarded.size() - 1))) {
				discarded.add(playerDeck.get(4));
				playerDeck.remove(4);
				return true;
			}
			break;
		}
		return false;

	}
}
