package task5;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		int k=1;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter input number");
		int row = scr.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}
