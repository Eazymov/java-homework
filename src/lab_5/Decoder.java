package lab_5;

import java.util.HashMap;
import java.util.Arrays;

public class Decoder {
	
	public static void decode(String word, String result)
	{
		int sum;
		int count = 0;

		for (int index = 1000; index < 10000; index ++)
		{
			sum = index * 2;
			
			if (sum >= 10000) {
				continue;
			}
			
			if (isRepeated(Integer.toString(index), Integer.toString(sum)))
			{
				continue;
			}
			
			count++;

			System.out.println(index + " " + sum);
		}

		System.out.println("—четчик: " + count);
	}
	
	private static boolean isRepeated(String firstString, String secondString)
	{
		String[] firstStringArray = firstString.split("");
		
		for (String firstLetter: firstStringArray)
		{
			if (!stringIsValid(firstString))
			{
				return true;
			}

			if (!stringIsValid(secondString))
			{
				return true;
			}
			
			if (secondString.indexOf(firstLetter) != -1)
			{
				return true;
			}
		}

		return false;
	}
	
	private static boolean stringIsValid(String string)
	{
		String[] letters = string.split("");
		String substring;
		int index = 0;

		while (index < letters.length - 1)
		{
			substring = string.substring(index);
			
			if (string.substring(index + 1).indexOf(letters[index]) != -1)
			{
				return false;
			}
			
			index++;
		}
		
		return true;
	}
}
