//Problem-6- WAP to find whether an array is subset of another array. 

package in.ineuron.main;
public class Problem6 
{
	public static void main(String[] args) 
	{
		int[] ar= {1,2,3,4,5,6,7,8};
		int [] a= {3,4,5};
		boolean flag=false;
		for(int i=0;i<=ar.length-a.length ;i++)
		{
			if(ar[i]==a[0])
			{
				for(int j=0;j<=a.length-1;j++)
				{
					if(a[j]==ar[i+j])
					{
						flag=true;
					}
					else
					{
						flag=false;
						break;
					}
				}	
			}
			
			if (flag==true)
			{
				System.out.println("Array 'a' is a subset of array 'ar'");
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Array 'a' is not a subset of array 'ar'");
		}
	}
}

