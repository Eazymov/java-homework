package lab_3;

public class Main {

	public static void main(String[] args)
	{
		printBinaryOperations(5, 6);
	}
	
	private static void printBinaryOperations(int firstum, int secondNum)
	{
		String NOT = Integer.toBinaryString(~firstum);
		String AND = Integer.toBinaryString(firstum & secondNum);	
		String OR = Integer.toBinaryString(firstum | secondNum);
		String XOR = Integer.toBinaryString(firstum ^ secondNum);
		String SHIFT_RIGHT = Integer.toBinaryString(firstum >> secondNum);
		String SHIFT_LEFT = Integer.toBinaryString(firstum << secondNum);

		printResult("Результат побитового NOT: ", NOT);
		printResult("Результат побитового AND: ", AND);
		printResult("Результат побитового OR: ", OR);
		printResult("Результат побитового исключающего OR: ", XOR);
		printResult("Результат побитового сдвига вправоѕ: ", SHIFT_RIGHT);
		printResult("Результат побитового сдвига влево: ", SHIFT_LEFT);
	}
	
	private static void printResult(String desc, String result)
	{
		System.out.println(desc + String.format("%32s", result).replace(' ', '0'));
	}
}
