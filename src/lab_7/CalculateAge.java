package lab_7;

import java.util.Calendar;
import java.util.Scanner;

public class CalculateAge {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String birthdate, name;
		int age;

		System.out.println("Введите свое имя или дату рождения: ");
		String value = sc.nextLine();
		
		if (isNumber(value)) {
			birthdate = value;
			age = getAgeFromBirthday(birthdate);

			System.out.println("Вам " + age + " лет. Введите свое имя: ");
			name = sc.nextLine();
			System.out.println("Здравствуйте, " + name + ".");
		} else {
			name = value;

			System.out.println("Здравствуйте, " + name + ". Введите свою дату рождения: ");
			birthdate = sc.nextLine();
			age = getAgeFromBirthday(birthdate);
			System.out.println("Вам " + age + " лет.");
		}
	}
	
	private static int getAgeFromBirthday(String birthdate) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int birthYear = Integer.parseInt(birthdate);
		
		return currentYear - birthYear;
	}
	
	private static boolean isNumber(String value) {
		try {
			int number = Integer.parseInt(value);
			
			return true;

		} catch (Throwable t) {
			return false;
		}
	}
}
