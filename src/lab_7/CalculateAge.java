package lab_7;

import java.util.Scanner;

public class CalculateAge {
	
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите свое имя: ");
			String name = sc.nextLine();
			System.out.println("Привет " + name + "! Укажи свой год рождения:");
			String age = sc.nextLine();

		} catch (Throwable t) {
			System.out.print(t.getMessage());
			t.printStackTrace();
		}
	}
}
