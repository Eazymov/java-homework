package lab_6;

import java.util.HashSet;

public class Decoder {

	public static void main(String[] args) {
		decode();
	}

	static void decode() {

		int count = 0;

		for (int number = 102345; number < 1000000; number++) {
			if (isValid(number))
			{
				count++;
			}
		}
		
		System.out.println("Количество совпадений: " + count);
	}

	private static boolean isValid(int number) {
		HashSet<Integer> set = new HashSet<Integer>();

		int a = number / 100000;
		int b = number % 100000 / 10000;
		int c = number % 10000 / 1000;
		int d = number % 1000 / 100;
		int e = number % 100 / 10;
		int f = number % 10 / 1;
		int firstSum = number % 1000;
		int secondSum = number / 1000;
		int sum = firstSum + secondSum;
		
		if (sum < 1000) return false;

		int g = sum / 1000;
		int h = sum % 1000 / 100;
		int i = sum % 100 / 10;
		int j = sum % 10 / 1;
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		set.add(f);
		set.add(g);
		set.add(h);
		set.add(i);
		set.add(j);
		
		if (set.size() == 9 && a == i)
		{
			System.out.println(firstSum + " + " + secondSum + " = " + sum);
			return true;
		}
		
		return false;
	}
}