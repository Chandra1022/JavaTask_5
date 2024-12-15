package task5;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
int temp,largest; 
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number num1");
		int num1 = scr.nextInt();
		System.out.println("Enter the number num2");
		int num2 = scr.nextInt();
		System.out.println("Enter the number num3");
		int num3 = scr.nextInt();
		
//		temp = num1>num2?num1:num2;
//		largest = num3 > temp? num3:temp;
//		System.out.println(largest);
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("num1 is largest "+num1);
		}else if(num2>=num3 && num2>=num3) {
			System.out.println("num2 is largest "+num2);
		}else
		{
			System.out.println("num3 is largest "+num3);
		}

	}

}
