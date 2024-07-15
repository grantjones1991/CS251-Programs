package program2;

import java.util.Random;

public class Deck2Driver
{
	public static void main(String[]args)
	{
		Deck2 deck = new Deck2();
		final int cardsPerRow = 8;
		int cardsThisRow = 0;
		int myCard;
		
		deck.initDeck();
		System.out.println("Run1: With old Deck2 class: ");
		System.out.println("---------------------------------------");
		System.out.println("\nHere is a shuffled deck ...\n");
		while (!deck.emptyDeck())
		{
			myCard = deck.dealCard();
			++cardsThisRow;
			if (cardsThisRow <= cardsPerRow)
			{
				deck.cardToString(myCard);
			}
			else
			{
				System.out.println("");
				cardsThisRow = 1;
				deck.cardToString(myCard);
			}
		}
		System.out.println("\n---------------------------------");
		System.out.println("Run 2: SmartDeck");
		System.out.println("---------------------------------");
		System.out.println("Here is the shuffled deck using the SmartDeck class: ");

		SmartDeck smart = new SmartDeck();
		smart.initDeck();
		cardsThisRow = 0;

		while (!smart.emptyDeck())
		{
			myCard = smart.dealCard();
			++cardsThisRow;
			if (cardsThisRow <= cardsPerRow)
			{
				smart.cardToString(myCard);
			}
			else
			{
				System.out.println("");
				cardsThisRow = 1;
				smart.cardToString(myCard);
			}
		}


	}

}
