package model;

import java.time.LocalDate;

class Frequencia {
	private boolean presensa;
	private LocalDate data;
	
	public Frequencia() {
		
	}
	
	public Frequencia(boolean presensa, LocalDate data) {
		this.setPresensa(presensa);
		this.setData(data);
	}
	
	public boolean getPresensa() {
		return presensa;
	}
	public void setPresensa(boolean presensa) {
		this.presensa = presensa;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return (presensa) ? "Presente" : "Faltante";
	}
}
