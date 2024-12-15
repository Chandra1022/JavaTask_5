package task5;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scr.nextLine();
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println("Reverse string is= "+str1);

	}

}
