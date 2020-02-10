package com.epam.Calculator1;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws Exception
	    {
	        System.out.println( "Calculator is running!" );
	        @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	        while(true) {
	        System.out.println("Enter the First number:\n");
		    int a = sc.nextInt();
		    System.out.println("Enter the Second number:\n");
		    int b = sc.nextInt();
		    System.out.println("Enter your choice:\n1.Addition\n2.Subtraction\n3.Multiply\n4.Divide\n5.Modulus\n");
		    int ch = sc.nextInt();
		    ch=ch-1;
	        if(ch<0 || ch>5) throw new Exception("Invalid!Enter a valid Choice.");
	        	int[] x = new int[5];
				@SuppressWarnings("unused")
				int[] operations = {
						x[0] = Calaction.addition(a,b),
	        			x[1] = Calaction.subtraction(a,b),
	        			x[2] = Calaction.multiplication(a,b),
	        			x[3] = Calaction.division(a,b),
	        			x[4] = Calaction.modulodivision(a,b),
	        	};
				System.out.println(x[ch]);
				System.out.println("If you want to exit!Enter 0 Otherwise enter any number");
				 int cho= sc.nextInt();	
				 if(cho==0) {
					    System.out.println("Exit(0)");
						break;
					}
					
	        }
	       
	        
	    }
}
