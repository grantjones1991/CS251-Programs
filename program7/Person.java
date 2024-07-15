package program7;

public class Person 
{
	private String name;

	public Person()
	{
		this(" ");
	}
	
	public Person(String name)
	{
		this.setName(name);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	private void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "The actor's name is: " + this.getName();
	}
	
}
//	public static final String name = "name";
//	private boolean set;
	
//	public Person()//default
//	{
//		this.setSet(false);
//	}
//	
//	protected final void setSet(boolean actor)
//	{
//		this.set = actor;
//	}
//	
//	public final boolean isSet()
//	 {
//	    return this.set;
//	 }
//	  
//	 public boolean equals(Person guest)
//	 {
//		 return this == guest;
//	 }
//
//	 public String toString()
//	 {
//	    if (this.isSet())
//	      return "";
//	    else
//	      return Person.name;
//	  }
//
//	  public abstract Person division(Person guest);
//}
