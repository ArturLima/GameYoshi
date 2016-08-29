package Trabalhojava;

public class CogumeloRepetidoException extends Exception {
	private Cogumelo c;
	
	
	public CogumeloRepetidoException(Cogumelo c1) {
		this.c = c1;
	}


	public Cogumelo getC(Cogumelo c1) {
		return c = c1;
	}
	
	
}
