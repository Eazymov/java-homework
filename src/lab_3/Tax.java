package lab_3;

public class Tax {

	public static void main(String[] args)
	{
		double income = 85;
		double percent = 18;
		double limit = 25000;

		System.out.println(calculateTaxAmount(income, percent, limit));
	}
	
	private static double calculateTaxAmount(
			double income,
			double percent,
			double limit
	)
	{
		return income < 20 ? income * 0.12 : (income < 40 ? income * 0.15 : (income < 60 ? income * 0.2 : (income < 80 ? income * 0.25 : (income * 0.3))));
	}
}
