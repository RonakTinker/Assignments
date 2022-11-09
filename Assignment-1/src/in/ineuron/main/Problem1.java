//Problem: Write a program(WAP) to print INEURON using pattern programming logic.

//Key Points:
//	- 'i' is the variable used for outer loop and 'j' is for inner loop.
//	- Every letter is coded in the range of n/4 to (3*n)/4 for i as well as j.
//	- Outer loop is used to print all the letters in a single line and multiple inner loops 
//	  are used to print all the different letters of "INEURON".


package in.ineuron.main;
public class Problem1 {

	public static void main(String[] args) 
	{
		int n=11;
		for(int i=1;i<=n;i++) 
		{
			
//			Loop for the letter 'I':
			for(int j=1;j<=n;j++) 
			{
				if(i==n/4 && j>=n/4 && j<=(3*n)/4 || i==(3*n)/4 && j>=n/4 && j<=(3*n)/4 || j==(n-1)/2 && i>=n/4 && i<=(3*n)/4) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
//			Loop for the letter 'N':
			for(int j=1;j<=n;j++) 
			{
				if(j==n/4 && i>=n/4 && i<=(3*n)/4 || j==(3*n)/4 && i>=n/4 && i<=(3*n)/4 || i==j && i>=n/4 && i<=(3*n)/4 ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
//			Loop for the letter 'E':			
			for(int j=1;j<=n;j++) 
			{
				if(i==n/4 && j>=n/4 && j<=(3*n)/4 || i==(n-1)/2 && j>=n/4 && j<=(3*n)/4 || i==(3*n)/4 && j>=n/4 && j<=(3*n)/4 || j==n/4 && i>=n/4 && i<=(3*n)/4 ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
//			Loop for the letter 'U':			
			for(int j=1;j<=n;j++) 
			{
				if(j==n/4 && i>=n/4 && i<(3*n)/4 || j==(3*n)/4 && i>=n/4 && i<(3*n)/4 || i==(3*n)/4 && j>n/4 && j<(3*n)/4 ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
//			Loop for the letter 'R':			
			for(int j=1;j<=n;j++) 
			{
				if(j==n/4 && i>=n/4 && i<=(3*n)/4 || i==n/4 && j>=n/4 && j<(3*n)/4 || j==(3*n)/4 && i>n/4 && i<(n-1)/2 || i==(n-1)/2 && j>=n/4 && j<(3*n)/4 || i==j && i>=(n-1)/2 && i<=(3*n)/4 ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
//			Loop for the letter 'O':
			for(int j=1;j<=n;j++) 
			{
				if(i==n/4 && j>n/4 && j<(3*n)/4 || i==(3*n)/4 && j>n/4 && j<(3*n)/4 || j==n/4 && i>n/4 && i<(3*n)/4 || j==(3*n)/4 && i>n/4 && i<(3*n)/4) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
//			Loop for the letter 'N':			
			for(int j=1;j<=n;j++) 
			{
				if(j==n/4 && i>=n/4 && i<=(3*n)/4 || j==(3*n)/4 && i>=n/4 && i<=(3*n)/4 || i==j && i>=n/4 && i<=(3*n)/4 ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}
}
