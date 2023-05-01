package in.ineuron.main;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a String : ");
		String str = scan.next();
		boolean flag=false;
		
		
		for(int i=1;i<str.length();i++) {
			
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=true;
					break;
				}
			}
			
			if(flag==true) {
				System.out.println("String contains some duplicate characters");
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("String contains all unique characters");
		}
		
		

	}

}
