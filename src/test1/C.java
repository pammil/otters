package test1;

public class C {
	public int c1() { 
		return 1;
	}
	
	private void c2() {
		int hello = c3();
		int hai = c1();
		int bra = hello + hai;
	}
	
	private int c3() {
		return 1;
	}
}
