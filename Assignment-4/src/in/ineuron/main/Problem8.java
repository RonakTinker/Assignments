package in.ineuron.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a String : ");
		String str = scan.next();
		
		String newStr="";
		
		ArrayList<Character> ch = new ArrayList<Character>();
		int occurence=0;
		
		
		if(str.length()>=0)
			newStr+=str.charAt(0);
		
		for(int i=1;i<str.length();i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=true;
					break;
				}
			}
			
			if(flag==false) {
				newStr+=str.charAt(i);
			}
		}
		
		
		int[] ar=new int[newStr.length()];
		
		for(int i=0;i<newStr.length();i++) {
			int occur=0;
			for(int j=0;j<str.length();j++) {
				if(newStr.charAt(i)==str.charAt(j)) {
					occur+=1;
				}
			}
			
			ar[i]=occur;
			
			System.out.println("No of occurence of "+newStr.charAt(i)+" is "+occur);
			
			if(occur>occurence) {
				occurence=occur;

			}
		}
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==occurence) {
				ch.add(newStr.charAt(i));
			}
		}
		
		System.out.println("Maximum occuring characters are : "+ch+" with "+occurence+" no. of occurence");
		

	}

}
