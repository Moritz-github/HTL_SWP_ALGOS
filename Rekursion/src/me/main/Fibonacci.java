package me.main;

import java.util.Arrays;
import java.util.Random;

public class Fibonacci {
	public static void main(String[] args){
			System.out.println(fibonacci_recursive(26));
			System.out.println(fibonacci_endrecrusive(15, 1, 1));
	}

	public static int fibonacci_recursive(int n){
		if(n == 1 || n == 2){
			return 1;
		} else { 
		return fib(n-1)+fib(n-2);
		}
	}
	
	public static int fibonacci_endrecrusive(int count, int n1, int n2){
		if(count < 0) {
			return n1 + n2;
		}
		return fibonacci_endrecrusive(count-1, n2, n1+n2);
	}
}
