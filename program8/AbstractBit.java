package program8;

public abstract class AbstractBit 
{
	private boolean bit;
	
	public abstract AbstractBit clone();
	public abstract AbstractBit addBits(AbstractBit guest);
	public abstract AbstractBit addBits(AbstractBit guest1, AbstractBit guest2);
	public abstract AbstractBit carryBit(AbstractBit guest);
	public abstract AbstractBit carryBit(AbstractBit guest1, AbstractBit guest2);
	
	protected void setBit(boolean value)
	{
		
	}
	
	public boolean getBit()
	{
		
	}
	
	public AbstractBit()
	{
		
	}
	
	public AbstractBit(boolean value)
	{
		
	}
	
	public AbstractBit(AbstractBit guest)
	{
		
	}
	
	public boolean equals(AbstractBit guest)
	{
		
	}
	
	public String toString()
	{
		
	}

}
