package lab_6;

public class LuckyTicket {

	public static void main(String[] args)
	{
		printLuckyTickets();
		printSuperLuckyTickets();
	}
	
	private static void printLuckyTickets()
	{
		int count = 0;
		
		for (int ticket = 0; ticket < 1000000; ticket++)
		{
			if (isLuckyTicket(ticket))
			{
				System.out.println(String.format("%06d", ticket));
				count++;
			}
		}
	
		System.out.println("\nКоличество счастливых билетов: " + count + "\n");
	}

	private static void printSuperLuckyTickets()
	{
		int count = 0;
		
		for (int ticket = 0; ticket < 1000000; ticket++)
		{
			if (isLuckyTicket(ticket) && isSuperLuckyTicket(ticket))
			{
				
				System.out.println(String.format("%06d", ticket));
				count++;
			}
		}
	
		System.out.println("\nКоличество супер-счастливых билетов: " + count);
	}
	
	private static boolean isLuckyTicket(int ticket)
	{
		int a = ticket / 100000;
		int b = ticket % 100000 / 10000;
		int c = ticket % 10000 / 1000;
		int d = ticket % 1000 / 100;
		int e = ticket % 100 / 10;
		int f = ticket % 10 / 1;
		int firstSum = a + b + c;
		int secondSum = d + e + f;
		
		return firstSum == secondSum;
	}
	
	private static boolean isSuperLuckyTicket(int ticket)
	{
		int a = ticket / 100000;
		int b = ticket % 100000 / 10000;
		int c = ticket % 10000 / 1000;
		int d = ticket % 1000 / 100;
		int e = ticket % 100 / 10;
		int f = ticket % 10 / 1;
		int firstSum = a + b + c;
		int secondSum = d + e + f;
		
		for (int power = 0; power < 100; power++)
		{
			if (Math.pow(firstSum, power) > ticket || Math.pow(secondSum, power) > ticket)
			{
				return false;

			} else if (Math.pow(firstSum, power) == ticket || Math.pow(secondSum, power) == ticket)
			{
				System.out.print("Степень: " + power + ", число: ");
				return true;
			} else
			{
				continue;
			}
		}

		return false;
	}
}
