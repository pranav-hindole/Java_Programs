package basicPrograms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number1");
		int num1=sc.nextInt();
		System.out.println(num1+" number1 before swapping");
		System.out.println("Enter a number2");
		int num2=sc.nextInt();
		System.out.println(num2+" number2 before swapping");
        //swapping numbers without using third variable//
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+" is num1 after swapping");
		System.out.println(num2+" is num2 after swapping");
	}

}
