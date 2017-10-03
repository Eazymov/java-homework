package p2;

import p1.Base;

class Inp2 {
	public static void main(String[] args) {
		Base b = new Base();
		// b.priv = 1; // "priv has private access in p1.Base"
		// b.pack = 1; // "pack is not public in p1.Base;
		// cannot be accessed from outside package"
		// b.prot = 1; // "prot has protected access in p1.Base"
		b.publ = 1;
	}
}

class Derivedp2 extends Base {
	public void f(Base a) {
		// a.priv = 1; // "priv has private access in p1.Base"
		// a.pack = 1; // "pack is not public in p1.Base; cannot
		// be accessed from outside package"
		// a.prot = 1; // "prot has protected access in p1.Base"
		a.publ = 1;
		// priv = 1; // "priv has private access in p1.Base"
		// pack = 1; // "pack is not public in pi.Base; cannot
		// be accessed from outside package"
		prot = 1;
		publ = 1;
		super.prot = 1;
	}
}