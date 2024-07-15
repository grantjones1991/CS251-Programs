package program7;

public class Leader extends Member
{
	private int year;
	
	public Leader()
	{
		super();
		this.year = 0;
	}
	
	public Leader(String og, int id, int series)
	{
		super(og, id);
		this.year = series;
	}
	
	private void setYear(int num)
	{
		this.year = num;
	}
	  
	public int getYear()
	{
		return this.year;
	}
	
	public void printLeader(Member og)
	{
		System.out.print("\n");
		og.printStatus();
		System.out.println( "In Series:  " + getYear() + "\n");
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", Their year in office is: " + this.getYear();
	}

}
