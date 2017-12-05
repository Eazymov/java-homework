package lab_4;

public class Main {

	public static void main(String[] args)
	{

		System.out.println("������� �������� PLUS:");
		printTable("PLUS");
		System.out.println();
		System.out.println("������� �������� MINUS:");
		printTable("MINUS");
		System.out.println();
		System.out.println("������� �������� MULTIPLY:");
		printTable("MULTIPLY");
	}
	
	private static void printTable(String type)
	{
		double result;

		System.out.println("         1  |   2  |   3  |   4  |   5  |   6  |   7  |   8  |   9  |  10  |");
		System.out.println("----------------------------------------------------------------------------");
		
		for (int i = 1; i < 11; i++)
		{
			System.out.print(" " + String.format("%2s", i) + "  |");
			
			for (int j = 1; j < 11; j++)
			{
				result = Operation.valueOf(type).eval(i,  j);

				System.out.print(" " + String.format("%4s", result) + " |");
			}

			System.out.println();
		}

		System.out.println("----------------------------------------------------------------------------");
	}
}
