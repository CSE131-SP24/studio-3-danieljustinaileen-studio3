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

		while (index < Math.sqrt(n)) {
			if (listOfNumbers[index] == 0) {
				index++;
			} else {
				for (int i = listOfNumbers[index]; i < listOfNumbers.length; i++) {
					if (listOfNumbers[i] == 0) {
						
					} else {
						if (listOfNumbers[i] % listOfNumbers[index] == 0) {
							listOfNumbers[i] = 0;

						}
					}
				}
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
