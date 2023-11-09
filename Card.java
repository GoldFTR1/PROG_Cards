import java.util.ArrayList;

public class Card {

	private static String[] type = { "Diamonds", "Clubs", "Spades", "Hearts" };
	private static String[] pos = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	private String Cardtype;
	private String CardPos;

	public Card(String cardtype, String cardPos) {
		super();
		Cardtype = cardtype;
		CardPos = cardPos;
	}

	public static ArrayList GenerateDeck() {

		ArrayList list = new ArrayList();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				Card card = new Card(type[i], pos[j]);
				list.add(card);
			}
		}
		return list;
	}

	public String getCardtype() {
		return Cardtype;
	}

	public void setCardtype(String cardtype) {
		Cardtype = cardtype;
	}

	public String getCardPos() {
		return CardPos;
	}

	public void setCardPos(String cardPos) {
		CardPos = cardPos;
	}

	@Override
	public String toString() {

		return this.CardPos + " of " + this.getCardtype();

	}

}
