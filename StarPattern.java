package task5;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter input number");
		int row = scr.nextInt();
		
		for(int i=1;i<=row;i++) { // number of rows for i
			
			for(int j=1;j<=row;j++) {// number of rows for j
				
				if(i==j || i+j == row+1) { 
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
	}
}
