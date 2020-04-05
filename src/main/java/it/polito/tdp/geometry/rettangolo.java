package it.polito.tdp.geometry;

public class rettangolo {
	private float base;
	private float altezza;
	public float calcolaPerimetro() {
		return 2*(base+altezza);
	}
	public float calcolaArea() {
		return base*altezza;
	}
	
	public rettangolo(float base, float altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	public rettangolo() {
		this.base = 0;
		this.altezza = 0;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}	
}
