package in.ineuron.main;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a String : ");
		String str1 = scan.next();
		
		System.out.print("Give another String : ");
		String str2 = scan.next();
		
		str1.toLowerCase();
		str2.toLowerCase();
		

		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not Anagram");
		}
		else {
			char[] ch1=new char[str1.length()];
			char[] ch2=new char[str1.length()];
			
			for(int i=0;i<str1.length();i++) {
				ch1[i]=str1.charAt(i);
				ch2[i]=str2.charAt(i);
			}
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean flag=true;
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
					
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==false) {
				System.out.println("Strings are not Anagram");
			}
			else {
				System.out.println("Strings are Anagram");
			}
				
		}
	}

}
