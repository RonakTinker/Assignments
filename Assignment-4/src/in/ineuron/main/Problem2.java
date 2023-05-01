package in.ineuron.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a String : ");
		String str = scan.next();
		
		
		ArrayList<Character> ar = new ArrayList<Character>();
		
		for(int i=1;i<str.length();i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=true;
					break;
				}
			}
			
			if(flag==true) {
				boolean flag2=false;
				for (Object elem : ar) {
					Character ch=(Character) elem;
					if(str.charAt(i)==ch) {
						flag2=true;
						break;
					}
				}
				if(flag2==false) {
					ar.add(str.charAt(i));
				}

			}
		}
		
		System.out.println("Duplicate characters are : "+ar);

	}

}


