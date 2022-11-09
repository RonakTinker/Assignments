//Problem-1- WAP to find the duplicates present in an array.

package in.ineuron.main;
public class Problem1 
{
	public static void main(String[] args) 
	{
		int[] ar= {0,1,2,3,3,2,1,4,5,0,6,2,3,4,9,8};
		for(int i=0;i<ar.length-1;i++)
		{
			int num=0;
			boolean flag=false;
			int temp;
			for(int k=0;k<i;k++)
			{
				if(ar[i]==ar[k])
				{
					flag=true;
					break;
				}
			}
			
			if (flag==true)
			{
				continue;
			}
			else
			{
				temp=ar[i];
			}
			
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[j]==temp)
				{
					num+=1;
				}
			}
			
			System.out.println("There are "+num+" Duplicates of "+temp);
		}
	}
}

