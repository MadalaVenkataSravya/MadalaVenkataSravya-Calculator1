package com.epam.Calculator1;

public class Calaction{
	
		public static int addition(int a,int b) {
			return a+b;
		}
		
		public static int subtraction(int a,int b) {
			return a-b;
		}
		
		public static int multiplication(int a,int b) {
			return a*b;
		}
		
		public static int division(int a,int b) {
			try {
			return a/b;
		}
			catch(ArithmeticException e) {
				System.out.println(e);
				return -1;
			}
		}
		public static int modulodivision(int a,int b) {
			return a%b;
		}
	
	
}

