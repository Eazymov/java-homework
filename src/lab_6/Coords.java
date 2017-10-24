package lab_6;

import java.util.HashMap;

class CustomException extends Exception {
	private String msg;

	CustomException() {
		msg = null;
	}

	CustomException(String s) {
		msg = s;
	}

	public String toString() {
		return "Исключение CustomException(" + msg + "):";
	}
}

public class Coords {
	
	public static void main(String[] args)
	{
		HashMap<String, Integer> firstLine = new HashMap<String, Integer>();
		HashMap<String, Integer> secondLine = new HashMap<String, Integer>();
		
		firstLine.put("k", Integer.parseInt(args[0]));
		firstLine.put("b", Integer.parseInt(args[1]));
		
		secondLine.put("k", Integer.parseInt(args[2]));
		secondLine.put("b", Integer.parseInt(args[3]));
		
		System.out.print(find(firstLine, secondLine));
	}

	public static String find(
		HashMap<String, Integer> firstLine,
		HashMap<String, Integer> secondLine
	)
	{
		double k1 = firstLine.get("k"), k2 = secondLine.get("k");
		double b1 = firstLine.get("b"), b2 = secondLine.get("b");
		
		try {
			if (k1 == k2) {
				throw new CustomException("Division by zero error");
			}

			double x = (-b1 + b2) / (k1 - k2);
			double y = k1 * x + b1;
			
			if (k1 == k2 && b1 == b2) {
				return "Lines are the same";
			}
			
			if (k1 * b1 == k2 * b2) {
				return "Parallel straight lines";
			}
			
			return "Intersection point is (" + x + ", " + y + ")";

		} catch (CustomException exc)
		{
			System.out.println(exc);
			return "";
		}
	}
}
