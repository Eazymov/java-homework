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

		System.out.println("Enter your name or age: ");
		String value = sc.nextLine();
		
		if (isNumber(value)) {
			birthdate = value;
			age = getAgeFromBirthday(birthdate);

			System.out.println("You are " + age + " years old. Enter your name: ");
			name = sc.nextLine();
			System.out.println("Hello, " + name + ".");
		} else {
			name = value;

			System.out.println("Hello, " + name + ". Enter your age: ");
			birthdate = sc.nextLine();
			age = getAgeFromBirthday(birthdate);
			System.out.println("You are " + age + " years old.");
		}
		
		saveToFile(name, age);
	}
	
	private static void readFile()
	{
		File file = new File("file.txt");
		
		try {
			Scanner sc = new Scanner(file);
			
			if (!sc.hasNext()) {
				sc.close();
				return;
			}
			
			String string = sc.nextLine();
			String[] parts = string.split("&");
			String name = parts[0].split("=")[1];
			String age = parts[1].split("=")[1];
			System.out.println("Last saved data: name = " + name + ", age = " + age);
			
			sc.close();
			
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
