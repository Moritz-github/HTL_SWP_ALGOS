package me.main;

import java.util.Arrays;
import java.util.Random;

public class Fakultauet {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
			
		System.out.println(fibonacci_recursive(5));
	}

	public static int faculty(int n){
		if (n <= 2) {
			return n;
		}
		return n * faculty(n - 1);
	}
}
