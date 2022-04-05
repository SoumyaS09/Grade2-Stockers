package com.gl.stockers.main;

import java.util.Scanner;

import com.gl.stockers.service.BinarySearchStock;
import com.gl.stockers.service.BooleanCountStock;
import com.gl.stockers.service.MergeSortStock;

public class Processing {
	public static void main(String[] args) {
		int Companies;
		int option;

		System.out.println("Enter the no of companies");
		Scanner sc = new Scanner(System.in);
		Companies = sc.nextInt();
		double sharePrice[] = new double[Companies];
		boolean shareProfit[] = new boolean[Companies];

		for (int i = 0; i < Companies; i++) {
			System.out.println("Enter current stock price of the company " + (i + 1));
			sharePrice[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			shareProfit[i] = sc.nextBoolean();
		}

		MergeSortStock mergeSortStock = new MergeSortStock();
		mergeSortStock.sort(sharePrice, 0, shareProfit.length - 1);

		BooleanCountStock booleanCountStock = new BooleanCountStock();

		BinarySearchStock binarySearchStock = new BinarySearchStock();

		do {

			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total  no of companies  for which stock prices rose today");
			System.out.println("4. Display the total  no of companies  for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			option = sc.nextInt();
			switch (option) {

			case 0:
				option = 0;
				break;
			case 1: {
				mergeSortStock.printAscOrder(sharePrice);

			}
				break;
			case 2: {
				mergeSortStock.printDscOrder(sharePrice);

			}
				break;
			case 3: {
				System.out.println("Total no of companies whose stock price rose today : "
						+ booleanCountStock.countTrueElements(shareProfit));

			}
				break;
			case 4: {
				System.out.println("Total no of companies whose stock price declined today : "
						+ (Companies - booleanCountStock.countTrueElements(shareProfit)));

			}
				break;
			case 5: {
				double key;
				System.out.println("enter the key value");
				key = sc.nextDouble();
				binarySearchStock.searchValue(sharePrice, key);

			}

				break;
			default:
				System.out.println("enter valid option");
			}

		} while (option != 0);
		System.out.println("Exited successfully");
		sc.close();
	}

}
