/*
 * Grant Jones , Program 03
 */
package program3;
import java.util.Random;
public class CardDriver
{
	public static void main(String[]args)
	{
		Card deck[] = new Card[52];
		
		int card;
		String num[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String suit[] = {"C","S","H","D"};

//		System.out.println("Here is the list of cards.");

		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = new Card(num[i%13],suit[i/13]);
//			System.out.println(deck[i].toString());
		}

		int index1, index2;
		Card copy = new Card();

		for(int i = 0; i < 100; i++)
		{
			index1 = (int) (Math.random() * 52);
			index2 = (int) (Math.random() * 52);

			copy = deck[index2].clone();
			deck[index2] = deck[index1];
			deck[index1] = copy;
		}

		int index = 0;
		System.out.println("\n\nHere is the deck, shuffled 100 times:\n");

		for(int i = 0; i < 13; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(j == 3){
					System.out.println(deck[index].toString() + " ");
					index++;
				}
				else{
					System.out.print(deck[index].toString() + " ");
					index++;
				}
			}
		}

		index=0;
		Card QueenClubs = new Card("Q","C");

		while(!QueenClubs.equals(deck[index]))
		{
			index++;
		}

		System.out.println("\nThe location of the Queen of Clubs is at index " + ++index + ".");
	
	}

}
