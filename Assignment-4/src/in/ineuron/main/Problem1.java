package in.ineuron.main;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a String : ");
		String str = scan.next();
		
		String newStr="";
		
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
		
		System.out.println("Final String is : "+newStr);
		
	}

}
