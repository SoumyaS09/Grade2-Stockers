package com.gl.stockers.service;

public class MergeSortStock {
	void merge(double arr[], int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];

		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sort(double arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}

	}

	public void printAscOrder(double[] array) {
		System.out.println("Stock prices in ascending order are :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public void printDscOrder(double[] array) {
		System.out.println("Stock prices in descending order are :");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}
