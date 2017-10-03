package lab_6;

public class LuckyTicket {

	public static void main(String[] args)
	{
		boolean isLucky = isLuckyTicket("123456", 225);
		
		System.out.println("Given ticket has " + (isLucky ? "" : "not ") + "lucky number!");
	}
	
	private static boolean isLuckyTicket(String ticket, int ticketNumber)
	{
		String[] substrings = ticket.split("(?<=\\G.{3})");
		int firstHalfValue = getAmountFromString(substrings[0]);
		int secondHalfValue = getAmountFromString(substrings[1]);

		return (firstHalfValue == ticketNumber) || (secondHalfValue == ticketNumber);
	}
	
	private static int getAmountFromString(String string)
	{
		String[] numbers = string.split("");
		int result = 0;
		
		for (String num: numbers)
		{
			result += Integer.parseInt(num);
		}
		
		return result;
	}
}
