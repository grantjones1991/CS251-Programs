/*
 * Grant Jones, Program 03
 */

package program3;

public class Card
{
	private String suit;
	private String rank;
	
	public Card()
	{
		this.suit = "C";
		this.rank = "A";
	}
	
	public Card(String r, String s)
	{
		this.rank = r;
		this.suit = s;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	public String getRank()
	{
		return this.rank;
	}
	
	private void setSuit(String suit)
	{
		this.suit = suit;
	}
	
	private void setRank(String rank)
	{
		this.rank = rank;
	}
	
	public Card clone()
	{
		Card clone = new Card();
		
		clone.setSuit(getSuit());
		clone.setRank(getRank());
		return clone;
	}
	
	public boolean equals(Card guest)
	{
		return this.getRank().equals(guest.getRank()) && this.getSuit().equals(guest.getSuit());
	}
	
	public String toString()
	{
		return this.suit + this.rank;
	}

}
