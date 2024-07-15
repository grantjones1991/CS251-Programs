package program4;
import java.util.Scanner;
public class DeckDriver_p4 
{
	public static void main(String[]args)
	{
		Scanner stdIn = new Scanner(System.in);
		Deck deck = new Deck();
		deck.shuffleDeck();

		System.out.println("Here is a deck of cards with 100 individual card swaps.\n");
		deck.printDeck();
		deck.collectAllCards();

		int swaps;
		System.out.println("\nNow, how many more swaps do you want to make?: ");
		swaps = stdIn.nextInt();
		deck.shuffleDeck(swaps);

		System.out.println("\nHere is the new Deck of Cards!\n");
		deck.printDeck();

		stdIn.close();
	}
}
