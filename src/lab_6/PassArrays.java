package lab_6;

class PassArrays {
	static void vaTest(int... v) {
		System.out.print("vaTest(int ...): " + v.length + " ����������: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void vaTest(boolean... v) {
		System.out.print("vaTest(boolean ...): " + v.length + " ����������: ");
		for (boolean x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void anotherOne(double... numbers) {
		System.out.println("It worked!");
	}

	static void anotherOne(String... strings) {
		System.out.println("It worked!");
	}

	public static void main(String args[]) {
		vaTest(1, 2, 3); // ��� � �������
		vaTest(true, false, true); // ��� � �������
		vaTest(); // ������: ���������������
		anotherOne();
	}
}
