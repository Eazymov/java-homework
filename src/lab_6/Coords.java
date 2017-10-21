package lab_6;

import java.util.HashMap;

public class Coords {
	
	public static void main(String[] args)
	{
		HashMap<String, Double> firstLine = new HashMap<String, Double>();
		HashMap<String, Double> secondLine = new HashMap<String, Double>();
		
		firstLine.put("k", 3.0);
		firstLine.put("b", 1.0);
		
		secondLine.put("k", 2.0);
		secondLine.put("b", 4.0);
		
		System.out.print(find(firstLine, secondLine));
	}

	public static String find(
		HashMap<String, Double> firstLine,
		HashMap<String, Double> secondLine
	)
	{
		double k1 = firstLine.get("k"), k2 = secondLine.get("k");
		double b1 = firstLine.get("b"), b2 = secondLine.get("b");
		
		if (k1 == k2 && b1 == b2) {
			return "Lines are the same";
		}
		
		if (k1 * b1 == k2 * b2) {
			return "Parallel straight lines";
		}
		
		double x = (-b1 + b2) / (k1 - k2);
		double y = k1 * x + b1;
		
		return "Intersection point is (" + x + ", " + y + ")";
	}
}
