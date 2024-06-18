package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=7;
		int count=0;
		if(n<2)
		{
			System.out.println("The entered numbered" + n + "is not a prime number");
			System.exit(0);
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			
				count=count+1;
		}
			
			if(count>2)
			
				System.out.println("The given number" + n + "is not prime ");
			
			else
			
				System.out.println("The given number " + n + " is  prime");
			
		}
		

	}



