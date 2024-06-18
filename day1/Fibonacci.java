package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
	
		int range = 8;
		int n1 = 0;
		int n2 = 1;
		System.out.println("Printing Fibonacci series till " + range + "........");
		for(int i=0;i<range;i++)
		{
			System.out.print(n1 + ",");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
