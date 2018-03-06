package pkgCore;
import java.util.*;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	ArrayList<Card> cards = new ArrayList<>();
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	public Deck(int numOfDecks)
	{	
		for(int i=0; i<numOfDecks; i++)
		{
			for(eSuit eSuit: eSuit.values())
			{		
				for(int x=1; x<14; x++)
				{
					cards.add(new Card(eSuit, eRank.values()[x]));
				}
			}
		}
	}
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	
	public Card draw()
	{
		int posCard = (int)(Math.random() * cards.size());
		return cards.get(posCard);
	}
	public int getDeckSize()
	{
		return cards.size();
	}
}
