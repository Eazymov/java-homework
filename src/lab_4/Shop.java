package lab_4;

interface Wares {
	void price();
}

class Carp implements Wares {
	public void price() {
		System.out.println("Цена карпа за килограмм = 60 рублей");
	}
}

class Pike implements Wares {
	public void price() {
		System.out.println("Цена щуки за килограмм = 40 рублей");
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
