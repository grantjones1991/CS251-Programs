/***********************
 * DynArray.java
 * Grant Jones
 * Computer Science 251
 * Section 401/807
 * 
 * DynArray Class
 *************************/

package program5;

public class DynArray 
{
	private double[] array;
	private int size;
	private int nextIndex;
	
	public DynArray()// constructor
	{
		this.array = new double[1];
		this.size = 1;
		this.nextIndex = 0;
	}
	
	public int arraySize() // accessor
	{
		return this.size;
	}
	
	public int elements() // accessor
	{
		return this.nextIndex;
	}
	
	public double at(int index) // accessor
	{
		if(0 <= index && index < this.elements())
		{
			return this.array[index];
		}
		else return Double.NaN;
	}
	
	private void grow()
	{
		if(elements() >= arraySize())
		{
			this.size *= 2;
			double[] nextArray = new double[this.arraySize()];
			System.arraycopy(this.array, 0, nextArray, 0, this.nextIndex);
			this.array = nextArray;
		}
	}
	
	private void shrink()
	{
		if(this.elements() < this.arraySize() / 2 && (this.arraySize() >= 1))
		{
			this.size /= 2;
			double[] nextArray = new double[this.arraySize()];
			System.arraycopy(this.array, 0, nextArray, 0, this.nextIndex);
			this.array = nextArray;
		}	
	}
	
	public void insertAt(int index, double value) // mutator
	{		
		if (0 <= index && index <= this.nextIndex) 
		{
			grow();
			for (int i = this.nextIndex; i > index; i--) 
			{
				this.array[i] = this.array[i - 1];
			}
			this.array[index] = value;
			this.nextIndex++;
		}
	}
	
	public void insert(double value) // mutator
	{

		insertAt(this.nextIndex,value);
	}
	
	public double removeAt(int index) // mutator
	{
		if (0 <= index - 1 && index - 1 <= this.nextIndex) 
		{
			System.out.println(this.nextIndex);
			double remove = this.array[index - 1];
			for (int i = index; i < this.nextIndex - 1; i++) 
			{
				this.array[i] = this.array[i+1];
			}
//			double remove = this.array[index];
			this.nextIndex--;
			shrink();
			return remove;
		}
		else 
		{
			return Double.NaN;
		}
	}
	
	public double remove() // mutator
	{
		
		return removeAt(this.nextIndex);
//		return this.array[this.nextIndex];
	}
	
	public void printArray() //accessor
	{
		// prints the values of all occupied locations of the array to
		// the screen
		for(int i = 0; i < this.nextIndex; i++)
		{
			System.out.println("The value at array.at(" + i + ") = " + array[i]);
		}
	}
}
