package com.calculaion;
import com.addition.Addition;
import com.substraction.Substraction;
import com.multiplication.Multiplication;
import com.division.*;


import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		int choice = 0;
		Scanner input = new Scanner(System.in);
		float n1, n2;
		
		System.out.println("\nWelcome to Calculator Project!");
		
		
		try
		{
			while(choice != 5 )
			{
				System.out.println("\n1 - Addition");
				System.out.println("2 - Subtraction");
				System.out.println("3 - Multiplication");
				System.out.println("4 - Division");
				System.out.println("5 - Exit");
				System.out.println("\n Enter your Choice");
				
				choice = input.nextInt();
			
				if (choice >0 && choice <6)
				{
				   
				
				
				if(choice == 5)
				{
					
//					    System.out.println("Please Select The Avaliable Choice");

						System.out.print("\nThanks for using");
					    System.exit(0);
				}
				
				System.out.print("\nEnter First value");
				n1 = input.nextFloat();
				
				System.out.print("\nEnter Second value");
				n2 = input.nextFloat();
				
				if(choice == 1)
				{
					System.out.print("Sum: " + Addition.addition(n1, n2));
				}
				
				else if(choice == 2)
				{
				
				System.out.print("Substraction: " + Substraction.subtraction(n1,n2));
			
			    }
				
				else if(choice == 3)
				{
					System.out.print("Multiplication: " + Multiplication.multiplication(n1,n2));
				}
				else if(choice == 4)
				{
					System.out.print("Division: " + Division.division(n1,n2));
				}
				
				
			}
			else
			{
				System.out.println("please enter the available choice");
				System.out.println("select from the available options");
				

			
			}
			}
		}
		catch(Exception ex)
		{
			
				System.out.println("\nError: " + ex.toString() + "Occured");
						
		}
		
	}
}