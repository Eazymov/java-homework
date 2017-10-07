package lab_7;

import java.util.Calendar;
import java.util.Scanner;

public class CalculateAge {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String birthdate, name;
		int age;

		System.out.println("������� ���� ��� ��� ���� ��������: ");
		String value = sc.nextLine();
		
		if (isNumber(value)) {
			birthdate = value;
			age = getAgeFromBirthday(birthdate);

			System.out.println("��� " + age + " ���. ������� ���� ���: ");
			name = sc.nextLine();
			System.out.println("������������, " + name + ".");
		} else {
			name = value;

			System.out.println("������������, " + name + ". ������� ���� ���� ��������: ");
			birthdate = sc.nextLine();
			age = getAgeFromBirthday(birthdate);
			System.out.println("��� " + age + " ���.");
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
