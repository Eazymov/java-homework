package lab_1;

public class Hypotenuse {

	static double a = 10.0, b = 4.0, c;

	public static double hyp() {
		return c = Math.sqrt(a * a + b * b);
	}
	
	public static double power(double a, double b)
	{
		return Math.exp(b * Math.log(a));
	}
	
	public static double anotherHyp(double a, double b)
	{
		return Math.sqrt(power(a, 2) + power(b, 2));
	}
	
	public static double pow()
	{
		return Math.pow(a,  b);
	}

	public static void main(String[] args) {
		System.out.println("Катет а = " + a);
		System.out.println("Катет b = " + b);
		System.out.println("Гипотенуза с = " + hyp());
		System.out.println(power(a, b));
	}
}