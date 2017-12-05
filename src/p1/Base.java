package p1;

public class Base {
	private int priv = 0;
	int pack = 0;
	protected int prot = 0;
	public int publ = 0;
}

class Inp1 {
	public void f() {
		Base b = new Base();
		// b.priv = 1; // "priv has private access in p1.Base"
		b.pack = 1;
		b.prot = 1;
		b.publ = 1;
	}
}

class Derivedp1 extends Base {
	public void f(Base a) {
		// a.priv = 1; // "priv has private access in p1.Base"
		a.pack = 1;
		a.prot = 1;
		a.publ = 1;
		// priv = 1; // "priv has private access in p1.Base"
		pack = 1;
		prot = 1;
		publ = 1;
	}
}