package in.ineuron.main;

public class Problem3 {

	public static void main(String[] args) {
		
		String s1 = "2552";
		
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		
		if(s1.equals(s2))
		{
			System.out.println(s1+" is palindrome");
		}
		else
		{
			System.out.println(s1+" is not palindrome");
		}

	}

}
