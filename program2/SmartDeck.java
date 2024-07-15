package program2;

import java.util.Random;

public class SmartDeck 
{
	private boolean[] deck = new boolean[52];
	private int cardsDealt;

//	public SmartDeck(){
//		this.cardsDealt = 0;
//	}
	
	public void initDeck()
	{
		this.cardsDealt = 0;
		for(int i = 0; i < deck.length; i++)
		{
			this.deck[i] = true;
		}
	}
	
	public boolean emptyDeck()
	{
		return cardsDealt == 52;
	}
	
	public int dealCard()
	{
		int card;
		do
		{
			card = (int) (Math.random()*52);
		}while(!this.deck[card]);
		
		this.deck[card] = false;
		this.cardsDealt++;
		return card;
	}
	
	public static String cardToString(int card)
	{
		String Suit[] = {"C","S","H","D"};
		int suit = card/13;
		int num = card%13;
		String Num[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		String newString = Num[num]+Suit[suit];
		System.out.print(newString + " ");
		return newString;
	}
	

}
