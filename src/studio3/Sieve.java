package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = in.nextInt();
		int[] listOfNumbers = new int[n];

		for (int i = 0; i < n; i++) {
			listOfNumbers[i] = i + 1;
		}
		listOfNumbers[0] = 0;

		int index = 0;
		int multiplier = 2;
		while (index < Math.sqrt(n)) {
			if (listOfNumbers[index] == 0) {
				index++;
			} else {
				while(multiplier*listOfNumbers[index]<=n) {
					listOfNumbers[multiplier*listOfNumbers[index]-1]=0;
					multiplier++;
				}
			multiplier = 2;
			index++;
			}
		}
		for(int num : listOfNumbers) {
			if(num != 0) {
				System.out.print(num + " ");
			}
		}
	}

}
