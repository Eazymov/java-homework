package lab_6;

import java.util.HashMap;

public class Coords {
	
	public static void main(String[] args)
	{
		HashMap<String, Double> firstLine = new HashMap<String, Double>();
		HashMap<String, Double> secondLine = new HashMap<String, Double>();
		
		firstLine.put("a", 3.0);
		firstLine.put("b", 1.0);
		
		secondLine.put("a", 2.0);
		secondLine.put("b", 4.0);
		
		System.out.print(find(firstLine, secondLine));
	}

	public static int[] find(
		HashMap<String, Double> firstLine,
		HashMap<String, Double> secondLine
	)
	{
		return null;
	}
}
