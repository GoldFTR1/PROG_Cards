import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {

		ArrayList<Card> listofcards = Card.GenerateDeck();

		Collections.shuffle(listofcards);
		System.out.println("The first card, after shuffling is " + listofcards.get(0).toString());

	}
}
