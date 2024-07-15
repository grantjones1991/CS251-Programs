package program8;

public class Driver
{
	
	public static void main(String[] args)
	{
		Binary n1 = new Binary();
		Binary n2 = new Binary(10);
		Binary n3 = n2.clone();
		System.out.println("n1 = " + n1);
		System.out.println("n1.length() = " + n1.length());
		System.out.println("n2 = " + n2);
		System.out.println("n2.length() = " + n2.length());
		System.out.println("n3 = " + n3);
		System.out.println("n3.length() = " + n3.length());
		System.out.println("n3.bitAt(1) = " + n3.bitAt(1));
		System.out.println();
		System.out.println("n1 equals n1 ? " + n1.equals(n1));
		System.out.println("n1 equals n2 ? " + n1.equals(n2));
		System.out.println("n2 equals n3 ? " + n2.equals(n3));
		System.out.println();
		Binary n4 = n2.addition(n2);
		System.out.println("n4 = " + n4);
		for (int i = 0; i <= 10; ++i)
		{
			n4 = n4.addition(n4);
			n4 = n4.addition(n2);
			System.out.println("n4 = " + n4);
		}
	}
}


