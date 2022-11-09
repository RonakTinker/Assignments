//Problem3 - WAP to sort an array using Bubble sort algorithm

package in.ineuron.main;
public class Problem3 
{
	public static void main(String[] args) 
	{
		int[] ar= {9,8,7,6,5,4,3,2,1,0};
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
			}
		}
		
		System.out.println("Sorted array is :");
		
		for(int elem:ar)
		{
			System.out.print(elem+" ");
		}
	}
}
