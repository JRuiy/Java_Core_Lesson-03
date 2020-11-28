package ua.lviv.lgs;

public class Aplication_03 {

	public static void main(String[] args) {

		int[] array = { 45, 85, 20, 0, 105, -4, 74 };

		for (int i = 0; i < array.length; i++) {

			while (array[1] < array[i]) {
				array[1] = array[i];
			}

		}
		System.out.println("Найбільше значення масиву: " + array[1]);

		for (int i = 0; i < array.length; i++) {

			while (array[1] > array[i]) {
				array[1] = array[i];
			}

		}
		System.out.println("Найменше значення масиву: " + array[1]);

	}

}
