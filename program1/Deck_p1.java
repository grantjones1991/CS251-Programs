//package program1;
//import java.util.Random;
//public class Deck_p1
//{
//	public static void initDeck(boolean[] deck)
//	{
//		for(int i = 0; i < 52; i++)
//		{
//			deck[i] = true;
//		}
//	}
//
//	public static boolean emptyDeck(boolean[] deck)
//	{
//		for(int i = 0; i < 52; i++)
//		{
//			if(deck[i] == true)
//			{
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static int dealCard(boolean[] deck)
//	{
//		Random rand = new Random();
//
//		int upperbound = 52;
//		int card = rand.nextInt(upperbound);
//
//		do
//		{
//			card = rand.nextInt(upperbound);
//		}while(deck[card] == false);
//
//		return card;
//
//	}
//
//	public static void printCard(int card)
//	{
//
//	}
//
//
//}
