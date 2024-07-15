package program7;

import java.util.ArrayList;

public class Org 
{
	private String orgName;
	private Leader orgLeader;
	private ArrayList<Member> orgMembers;
	
	public Org()//default
	{
		this.orgName = " ";
		this.orgLeader = null;
	}
	
	public Org(String name, Leader og)//specifying
	{
		this.orgName = name;
		this.orgLeader = og;
		this.orgMembers = new ArrayList<>();
	}
	
	public String getOrgName()//accesor
	{
		return this.orgName;
	}
	
//	private void setOrgName(String name)//mutator
//	{
//		this.orgName = name;
//	}
	
	public void addMember(Member og)
	{
		this.orgMembers.add(og);
	}
	
	public void printOrg()
	{
		System.out.println("\nThe series is " + getOrgName() + ".");
		System.out.println("The Leader of this org is " + this.orgLeader.toString());
		for(Member og: orgMembers)
		{
			System.out.println("The actor is " + og.toString());
		}
	}
	
	
	//
	
	

}
