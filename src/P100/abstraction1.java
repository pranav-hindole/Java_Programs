package P100;

import java.util.Scanner;

public class abstraction1 implements Bank {
	
         Scanner sc=new Scanner(System.in);
         int balance=sc.nextInt();
         public void deposit(int a)
         {
        	 System.out.println("Deposit Successfull");
        	 balance += a;
        	 System.out.println(balance+"Balance");
        	}
         public void withdraw(int a)
         {
        	 System.out.println("Withraw Successfull");
        	 balance -= a;
        	 System.out.println(balance+"Balance");
        	}
         public void checkbalance()
         {
        	 System.out.println(balance);
         }
         }
