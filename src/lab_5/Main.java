package lab_5;

public class Main {
	
	public static void main(String[] args)
	{
		String word = "лсую";
		String result = "якнм";

		try {
			Decoder.decode(word, result);

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
