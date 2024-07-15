package program6;

public class Queue 
{
	DynArray_p6 newQueue = new DynArray_p6();
	public int size()
	{
		int size = newQueue.elements();
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
	
	public void que(double value)
	{
		newQueue.insert(value);
	}
	
	public double deQue()
	{
		int position = size();
		if(position > 0)
		{
			double number = newQueue.removeAt(position);
			return number;
		}
		else
		{
			return Double.NaN;
		}
		
	}
	
	public void queueDump()
	{
		int position = 0;
		int spot = size();
		for(int i = 0; i < spot; i++)
		{
			System.out.println("array.at(" + i + ") = " + newQueue.at(position));
			position++;
		}
	}
}
