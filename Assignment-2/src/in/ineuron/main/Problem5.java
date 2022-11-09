//Problem 5 - WAP to sort an array using Selection Sort Algorithm.

package in.ineuron.main;
public class Problem5 
{
	public static void main(String[] args) 
	{
		int[] ar= {9,8,7,6,5,4,3,2,1,0};
		
		for(int i=0;i<ar.length-1;i++)
		{
			int minIndex=i;
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j+i]<ar[j+i-1])
				{
					minIndex=j+i;
				}
			}

			int temp=ar[i];
			ar[i]=ar[minIndex];
			ar[minIndex]=temp;
		}
		
		System.out.println("Sorted array is :");
		
		for(int elem:ar)
		{
			System.out.print(elem + " ");
		}	
	}
}
