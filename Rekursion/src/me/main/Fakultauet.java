package me.main;

import java.util.Arrays;
import java.util.Random;

public class Fakultauet {
	public static void main(String[] args){
			Scanner reader = new Scanner(System.in);
			int n = reader.nextInt();
			
			System.out.println(fibonacci_recursive(i));
	}

	public static int faculty(int n, int factor){
        if (n == 0) {
            return 1;
        } else {
            return base*getFactor(base,factor-1);
        }
	}
}
