package program8;

public class BinaryBit extends AbstractBit
{
	public static final BinaryBit zero = new BinaryBit(false);
	public static final BinaryBit one = new BinaryBit(true);
	
	public BinaryBit()
	{
		
	}
	
	// allows construction with a boolean - false->0, true->1
	public BinaryBit(boolean bit)
	{
		
	}
	
	// allows construction with an int - should be 0 or 1
	public BinaryBit(int bit)
	{
		
	}
	
	public BinaryBit(BinaryBit guest)
	{
		
	}
	
	public BinaryBit clone()
	{
		
	}
	
	public boolean equals(BinaryBit guest)
	{
		
	}
	
	public String toString()
	{
		
	}
	
	// returns the low order bit of adding the host bit to the guest bit
	public AbstractBit addBits(AbstractBit guest)
	{
		
	}
	
	// returns the low order bit of adding the host bit, the guest1 bit, and the guest2 bit
	public AbstractBit addBits(AbstractBit guest1, AbstractBit guest2)
	{
		
	}
	
	// returns the high order bit of adding the host bit to the guest bit
	public AbstractBit carryBit(AbstractBit guest)
	{
		
	}
	
	// returns the high order bit of adding the host bit to the guest bit
	public AbstractBit carryBit(AbstractBit guest1, AbstractBit guest2)
	{
		
	}


}
