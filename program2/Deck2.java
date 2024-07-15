package program2;
import java.util.Random;
public class Deck2
{
	private boolean[] deck = new boolean[52];
	
	public void initDeck()
	{
		for(int i = 0; i < deck.length; i++)
		{
			this.deck[i] = true;
		}
	}
	
	public boolean emptyDeck()
	{
		for(int i = 0; i < deck.length; i++)
		{
			if(this.deck[i] == true)
			{
				return false;
			}				
		}
		return true;
	}
	
	public int dealCard()
	{
		Random rand = new Random();
		
		int upperbound = 52;
		int card = rand.nextInt(upperbound);
		
		do
		{
			card = rand.nextInt(upperbound);
		}while(this.deck[card] == false);
		
		this.deck[card] = false;
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
	
//	public void print()
//	{
//		System.out.print(cardToString());
//	}
	

}
