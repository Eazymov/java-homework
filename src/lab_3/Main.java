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

		printResult("��������� ���������� NOT: ", NOT);
		printResult("��������� ���������� AND: ", AND);
		printResult("��������� ���������� OR: ", OR);
		printResult("��������� ���������� ������������ OR: ", XOR);
		printResult("��������� ���������� ������ ������: ", SHIFT_RIGHT);
		printResult("��������� ���������� ������ �����: ", SHIFT_LEFT);
	}
	
	private static void printResult(String desc, String result)
	{
		System.out.println(desc + String.format("%32s", result).replace(' ', '0'));
	}
}
