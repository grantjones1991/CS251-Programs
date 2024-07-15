package program7;

public class Driver 
{
	public static void main(String[] args)
	{
		//establishing actors
//		Member William = new Member();
//		Member Patrick = new Member();
//		Member Jon = new Member();
//		Member Tom = new Member();
//		Member Paul = new Member();
		
			
//		Member William = new Member("William Hartnell", 1);
		Member Patrick = new Member("Patrick Troughton", 2);
		Member Jon = new Member("Jon Pertwee", 3);
		Member Tom = new Member("Tom Baker", 4);
		Member Paul = new Member("Paul McGann", 8);
		
		//Establish William as leader
//		Leader Will = new Leader("William Hartnell", 1, 1);
		
		//Establish the org
		Org Classic = new Org("Classic Series", new Leader("William Hartnell", 1, 1));
	
		
		//add actors to the classic series
		Classic.addMember(Patrick);
		Classic.addMember(Jon);
		Classic.addMember(Tom);
		Classic.addMember(Paul);
		
		//print actors
		Classic.printOrg();
	
		
		/*****************************/
		
		//establishing new actors
//		Member David = new Member("David Tennant", 10);
		Member Matt = new Member("Matt Smith", 11);
		Member Peter = new Member("Peter Capaldi", 12);
		
		//Make David the leader
//		Leader David = new Leader("David Tennant", 10, 2);

		
		//Establish New as the org and put David, matt, and peter as well as paul in
		
		Org nu = new Org("New Series", new Leader("David Tennant", 10, 2));
		
		//add actors to the new series
		nu.addMember(Paul);
		nu.addMember(Matt);
		nu.addMember(Peter);
		
		nu.printOrg();
		
	}

}
