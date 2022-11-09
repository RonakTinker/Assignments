//Problem: Write a program to print - 

// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4

//Key Points:
//	- "num1" is the variable used for outer loop and "num2" is for inner loop.
	
	
package in.ineuron.main;
public class Problem2 {

	public static void main(String[] args) 
	{
		for(int num1=1;num1<5;num1++) 
		{
			for(int num2=1;num2<5;num2++) 
			{
				System.out.print(num1);
			}
			System.out.println("");
		}
	}
}
