package program6;

public class Stack 
{
	DynArray_p6 newStack = new DynArray_p6();
	
	public int size()
	{
		int size = newStack.elements();
		return size;
	}
	
	public boolean isEmpty()
	{
		int proof = size();
		if(proof == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(double value)
	{
		newStack.insert(value);
	}
	
	public double pop()
	{
		int position = size();
		if(position > 0)
		{
			double number = newStack.removeAt(position);
			return number;
		}
		else
		{
			return Double.NaN;
		}
	}	
	
	public void stackDump()
	{
		newStack.printArray();
	}
}
