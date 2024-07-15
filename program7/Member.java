package program7;

public class Member extends Person
{
	private int id;
//	private String name;
	  
	  public Member()//default
	  {
	    super();
	    this.id = 0;
	  }

	  public Member(String actor, int number)//specifying
	  {
	    super(actor);
	    this.id = number;
	  }
	  
//	  protected void setId(int num)
//	  {
//		 this.id = num;
//		 super.setSet(true);
//	  }
	  
	  public int getId()
	  {
		  return this.id;
	  }
	  
	  public void printStatus()
	  {
		System.out.println(getName() + ", " + getId());
	  }

	  	  
	  @Override	  
	  public String toString()
	  {
		  return super.toString() + ", Id number is: " + this.getId();
	  }
	  
//	  protected void setName(String actor)
//	  {
//	    this.name = actor;
//	    super.setSet(true);
//	  }
//	  
//	  public String getName()
//	  {
//	    return this.name;
//	  }
//	  
//	  public boolean nameEquals(Member guest)
//	  {
//		  return this.getName() == guest.getName(); 
//	  }
//	  
//	  public boolean idEquals(Member guest)
//	  {
//		  return this.getId() == guest.getId();
//	  }
//
//	  public String toString()
//	  {
//	    if (isSet())
//	      return super.toString() + this.getName();
//	    else
//	      return super.toString();
//	  }
	 

//
//	}


}
