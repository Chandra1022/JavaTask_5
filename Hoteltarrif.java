package task5;

import java.util.Scanner;

public class Hoteltarrif {

	public static void main(String[] args) {
		
		float num,num6,num5;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number of the month");
		int num1 = scr.nextInt();
		System.out.println("Enter the rent");
		float num2 = scr.nextFloat();
		System.out.println("Enter number of days");
		int num3 = scr.nextInt();
		
		switch(num1) {
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.printf("%.2f",num2*(float)num3);
			break;
		
			
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			num=num2*num3;
			num5=num+(num/100)*20;
			//num6=num+num5;
			System.out.printf("%.2f",num5);
			break;		
		default:
				System.out.println("invalid input");
		}
	}
}
