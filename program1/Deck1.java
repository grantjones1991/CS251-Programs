package program1;

import java.util.Random;

public class Deck1
{
	// set the values of deck to indicate that they are all
	// present- not dealt yet.
	public static void initDeck(boolean[] deck){
		for(int i = 0; i < deck.length; i++)
		{
			deck[i]=false;
		}
	}

	// returns whether or not all the cards in the deck
	// have already been dealt.
	public static boolean emptyDeck(boolean[] deck){
        for(int i = 0; i < deck.length; i++) {
            if (!deck[i]) return false;
        }
		return true;
	}

	// returns a card (an int in the range 0 to 51) at random
	// that has not been dealt since the deck was initialized
	// via initDeck. Also notes (in deck) that this card is
	// no longer available.
	public static int dealCard(boolean[] deck){

		int deal = (int) (Math.random() * 52);
		while(deck[deal]){
			deal = (int) (Math.random() * 52);
		}
		deck[deal] =true;
		return deal;
	}

	// given a card (an int in the range 0 to 51) prints
	// an appropriate representation of this card based
	// on a 1-1 and onto mapping of the set [0, 51] to
	// the cards described above.
	public static void printCard(int card){
		String suit;
		if(card/13 == 0) suit = "C";
		else if(card/13 == 1)suit = "S";
		else if(card/13 == 2)suit = "H";
		else suit = "D";

		int rank = card%13;

		if(rank == 0 || rank >= 10)
		{
			String royal;
			if(rank == 0)royal = "A";
			else if(rank == 10)royal = "J";
			else if(rank == 11)royal = "Q";
			else royal = "K";
			System.out.print(suit+royal);
		} else System.out.print(suit+ (rank+1));
	}

	public static void main(String[]args)
	{
		boolean[] myDeck = new boolean[52];
		final int cardsPerRow = 8;
		int cardsThisRow = 0;
		int myCard;
		initDeck(myDeck);
		System.out.println("\nHere is a shuffled deck ...\n");
		while (!emptyDeck(myDeck))
		{
			myCard = dealCard(myDeck);
			++cardsThisRow;
			if (cardsThisRow <= cardsPerRow)
			{
				printCard(myCard);
				System.out.print(" ");
			}
			else
			{
				System.out.println("");
				cardsThisRow = 1;
				printCard(myCard);
				System.out.print(" ");
			}
		}
		System.out .println("\n");
	}
}
