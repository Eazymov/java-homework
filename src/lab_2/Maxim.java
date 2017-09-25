package lab_2;

public class Maxim {
	public static void main(String[] args) {
		int[] array = { 8, 3, 5, 1, 9 };

		System.out.println("Max = " + getMax(array));
	}
	
	public static int getMax(int[] array)
	{
		int result = array[0];
		
		for (int element: array)
		{
			if (element > result)
				result = element;
		}
		
		return result;
	}
}
