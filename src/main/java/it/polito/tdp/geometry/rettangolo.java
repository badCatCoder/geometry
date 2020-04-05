package it.polito.tdp.geometry;

public class rettangolo {
	private float base;
	private float altezza;

	public float calcolaPerimetro() {
		return 2 * (base + altezza);
	}

	public float calcolaArea() {
		return base * altezza;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
}
