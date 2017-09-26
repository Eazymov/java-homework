package lab_2;

import java.util.Arrays;

public class p_sort {

	public static void main(String[] args)
	{
		double[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		String[] strings = { "d", "c", "b", "a" };
		String[] sortedArray = sortStrings(strings);
		
		System.out.println(Arrays.toString(sortedArray));
	}
	
	public static double[] sort(double[] array)
	{
		double temp;
		int length = array.length;

		for (int supIndex = 0; supIndex < length; supIndex++)
		{
			for (int subIndex = 0; subIndex < length - 1; subIndex++)
			{
				if (array[subIndex] > array[subIndex + 1])
				{
					temp = array[subIndex];
					array[subIndex] = array[subIndex + 1];
					array[subIndex + 1] = temp;
				}
			}
		}

		return array;
	}
	
	public static String[] sortStrings(String[] array)
	{
		String temp;
		int length = array.length;

		for (int supIndex = 0; supIndex < length; supIndex++)
		{
			for (int subIndex = 0; subIndex < length - 1; subIndex++)
			{
				if (array[subIndex].compareTo(array[subIndex + 1]) > 0)
				{
					temp = array[subIndex];
					array[subIndex] = array[subIndex + 1];
					array[subIndex + 1] = temp;
				}
			}
		}

		return array;
	}
}
