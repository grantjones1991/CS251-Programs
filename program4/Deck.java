package program4;
import java.util.Scanner;
import java.util.Random;
public class Deck
{
	private Card[] deck = new Card[52];
	private int cardsDealt;

    Deck()//constructor
	{
		this.cardsDealt = 0;
		for(int i = 0; i < deck.length; i++)
		{
            String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            String[] suit = {"C", "S", "H", "D"};
            this.deck[i] = new Card(num[i%13], suit[i/13]);
		}
	}
	
	public int getCardsDealt() // accessor
	{
		return this.cardsDealt;
	}
	
	private void setCardsDealt(int cardsDealt) // mutator
	{
		this.cardsDealt = cardsDealt;
	}
	
	public boolean isEmptyDeck()
	{
        return getCardsDealt() == 52;
	}
	
	public void collectAllCards()
	{
		setCardsDealt(0);
	}
	
	public Card dealCard()
	{
		if(!isEmptyDeck()){
			setCardsDealt(getCardsDealt() + 1);
			return deck[getCardsDealt() - 1];
		}
		else return null;
	}
	
	public void shuffleDeck()
	{
		int index1, index2;
		Card copy;

		for(int i = 0; i < 100; i++)
		{
			index1 = (int) (Math.random() * 52);
			index2 = (int) (Math.random() * 52);

			copy = deck[index2].clone();
			deck[index2] = deck[index1];
			deck[index1] = copy;
		}
	}
	
	public void shuffleDeck(int swapCnt)
	{
		int index1, index2;
		Card copy;

		for(int i = 0; i < swapCnt; i++)
		{
			index1 = (int) (Math.random() * 52);
			index2 = (int) (Math.random() * 52);

			copy = deck[index2].clone();
			deck[index2] = deck[index1];
			deck[index1] = copy;
		}
	}

	public void printDeck()
	{
		for(int i = 0; !isEmptyDeck(); i++)
		{
			if(i%4 == 3){
				System.out.println(dealCard().toString() + " ");
			}
			else System.out.print(dealCard().toString() + " ");
		}
	}
}
