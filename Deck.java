import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> useCard;
	public int nUsed;
	// TODO: Please implement the constructor (30 points)
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		useCard = new ArrayList<Card>();
		for (int f = 1; f <= nDeck; f++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int r = 1; r < 14; r++) {
					Card card = new Card(s, r);
					cards.add(card);
				}
			}
		}
		// 1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		// Hint: Use new Card(x,y) and 3 for loops to add card into deck
		// Sample code start
		// Card card=new Card(1,1); ->means new card as clubs ace
		// cards.add(card);
		// Sample code end

	}

	// TODO: Please implement the method to print all cards on screen (10
	// points)
	public void printDeck() {
		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).printCard();

		}
		// Hint: print all items in ArrayList<Card> cards,

		// TODO: please implement and reuse printCard method in Card class (5
		// points)

	}

	public ArrayList<Card> getAllCards() {

		return cards;
	}

	public void shuffle() {
		Random r = new Random();
		for(int i =0 ;i<cards.size();i++){
		int t1=r.nextInt(cards.size()+1);
		int t2=r.nextInt(cards.size()+1);
		Card temp =cards.get(t1);
		Card a =cards.get(t1);
		Card b =cards.get(t2);
		a = b;
		cards.set(t1,a);
		b = temp;
		cards.set(t2, b);

		}
		for(int i =0 ;i<cards.size();i++)
			
			cards.remove(i);
		nUsed = 0;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public Card getOneCard() {
		Card Z = cards.get(nUsed);
		if (nUsed<cards.size()){
		
		useCard.add(Z);
		nUsed++;
	
		}
		else 
			shuffle();
		return Z;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
