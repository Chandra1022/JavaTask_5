package task5;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scr.nextInt();
		
		if(marks ==100) {
			System.out.println("Grade is= S");
		}else if(marks >=90 && marks<=99){
			System.out.println("Grade is= A");
		}else if(marks >=80 && marks<=89){
			System.out.println("Grade is= B");
		}else if(marks >=70 && marks<=79){
			System.out.println("Grade is= C");
		}else if(marks >=60 && marks<=69){
			System.out.println("Grade is= D");
		}else if(marks >=50 && marks<=59){
			System.out.println("Grade is= E");
		}else if(marks <50 && marks >=0){
			System.out.println("Grade is= F");
		}else
		{
			System.out.println("Invalid input");
		}
	}
}
