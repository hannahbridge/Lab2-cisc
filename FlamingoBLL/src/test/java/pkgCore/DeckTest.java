package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		Deck deck1 = new Deck(1);
		assertEquals(52, deck1.getDeckSize());
		
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
		Deck deck2 = new Deck(6);
		assertEquals(312, deck2.getDeckSize());
		
		
	}

}
