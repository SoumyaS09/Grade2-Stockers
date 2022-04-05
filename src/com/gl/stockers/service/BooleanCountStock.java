package com.gl.stockers.service;

public class BooleanCountStock {
	public int countTrueElements(boolean[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i]) {
				count++;
			}
		}

		return count;
	}
}
