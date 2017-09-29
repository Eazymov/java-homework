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

		printResult("Побитовый NOT: ", NOT);
		printResult("Побитовый AND: ", AND);
		printResult("Побитовый OR: ", OR);
		printResult("Побитовый исключаещее OR: ", XOR);
		printResult("Побитовый сдвиг вправо: ", SHIFT_RIGHT);
		printResult("Побитовый сдвиг влево: ", SHIFT_LEFT);
	}
	
	private static void printResult(String desc, String result)
	{
		System.out.println(desc + String.format("%32s", result).replace(' ', '0'));
	}
}
