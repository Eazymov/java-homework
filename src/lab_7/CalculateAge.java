package lab_7;

import java.util.Calendar;
import java.util.Scanner;
import java.io.File;
import java.util.Formatter;

public class CalculateAge {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String birthdate, name;
		int age;
		
		readFile();

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
		
		saveToFile(name, age);
	}
	
	private static void readFile()
	{
		File file = new File("file.txt");
		
		try {
			Scanner sc = new Scanner(file);
			
			if (!sc.hasNext()) return;
			
			String string = sc.nextLine();
			String[] parts = string.split("&");
			String name = parts[0].split("=")[1];
			String age = parts[1].split("=")[1];
			System.out.println("Last saved data: name = " + name + ", age = " + age);
			
		} catch (Exception exc)
		{
			System.out.print(exc);
		}
	}
	
	private static void saveToFile(String name, int age)
	{
		try {
			Formatter f = new Formatter("file.txt");
			
			f.format("name=" + name + "&age=" + age);
			f.close();

		} catch (Exception exc)
		{
			System.out.print(exc);
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
