package sieveOfEratosthenes;

import java.math.*;
import java.util.Arrays;
import java.util.Scanner;



public class SieveOfEratosthenes {

	public static void main(String[] args) {
		SieveOfEratosthenes soe = new SieveOfEratosthenes();
		System.out.println("Lütfen Pozitif bir tam sayý girin:  ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		soe.countNumberOfPrimeNumbers(n);
		

	}
	
	void countNumberOfPrimeNumbers(int n) {
		long start =System.currentTimeMillis();
		boolean[] list = new boolean[n+1];
		Arrays.fill(list, true);
		
		int upperbound = (int) (Math.sqrt(n) + 1);
		
		for(int i =2;i<= upperbound;i++) {
			if(list[i]==true) 
				for (int j = 2; i * j <= n; j++)
					list[i * j] = false;
			
		}
		int numberOfPrimes = 0;
		for(boolean b: list) {
			if(b)
				numberOfPrimes++;
			
		}
		long end =System.currentTimeMillis();
		long time = end - start;
		System.out.println(n+ " sayýsýna kadar "+ (numberOfPrimes - 2)+ " tane asal sayý vardýr.");
		System.out.println("Time: "+ time+ "ms.");
			
	}

}
