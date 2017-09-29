package lab_3;

public class Tax {

	public static void main(String[] args)
	{
		double income = 25000;
		double percent = 18;
		double limit = 25000;

		System.out.println(calculateTaxAmount(income, percent, limit));
	}
	
	private static double calculateTaxAmount(double income, double percent, double limit)
	{
		return income > limit ? income * percent / 100 : 0;
	}
}
