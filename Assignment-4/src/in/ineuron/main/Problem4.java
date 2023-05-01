package in.ineuron.main;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a String : ");
		String str = scan.next();
		
		str.toLowerCase();
		
		int vowels=0;
		int consonents=0;
		int specialChar=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					vowels+=1;
				}
				else {
					consonents+=1;
				}
			}
			
		}
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=32 && str.charAt(i)<=47 || str.charAt(i)>=58 && str.charAt(i)<=64 || str.charAt(i)>=91 && str.charAt(i)<=96 || str.charAt(i)>=123 && str.charAt(i)<=126) {
				specialChar+=1;
			}
		}
		
		System.out.println("No. of Vowels are : "+vowels);
		System.out.println("No. of consonents are : "+consonents);
		System.out.println("No. of special characters are : "+specialChar);
	}

}
