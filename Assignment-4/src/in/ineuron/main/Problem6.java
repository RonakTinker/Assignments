package in.ineuron.main;

public class Problem6 {

	public static void main(String[] args) {
		
		String s1="the quick brown fox jumps over the lazy dog";
		boolean flag=false;
		s1=s1.replace(" ","");
		s1=s1.toUpperCase();
		char[] ch=s1.toCharArray();
		
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65; 
			ar[index]++;
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{   
				System.out.println("String is not pangram");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("String is pangram");
		}

	}

}
