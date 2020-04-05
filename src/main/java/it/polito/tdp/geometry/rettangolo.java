package it.polito.tdp.geometry;

public class rettangolo {
	private int base;
	private int altezza;

	public int calcolaPerimetro() {
		return 2 * (base + altezza);
	}

	public int calcolaArea() {
		return base * altezza;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
}
