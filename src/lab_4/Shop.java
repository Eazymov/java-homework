package lab_4;

interface Wares {
	void price();
}

class Carp implements Wares {
	public void price() {
		System.out.println("���� ����� �� ��������� = 60 ������");
	}
}

class Pike implements Wares {
	public void price() {
		System.out.println("���� ���� �� ��������� = 40 ������");
	}
}

public class Shop {

	public static void main(String[] args) {
		Wares[] goods = new Wares[2];
		goods[0] = new Carp();
		goods[1] = new Pike();
		
		for(int i = 0; i < goods.length; i++)
			goods[i].price();
	}
}
