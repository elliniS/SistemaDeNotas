package model;

import java.util.ArrayList;

public class RendimentoAluno {
	private int id;
	private Discente discente;
	private Materia materia;
	private ArrayList<Frequencia> frequencia;
	private ArrayList<Integer> notas;
	
	public RendimentoAluno() {
		
	}
	
	public RendimentoAluno(Discente discente, Materia materia, ArrayList<Frequencia> frequencia, ArrayList<Integer> notas, int quntDiasAula) {
		this.setDiscente(discente);
		this.setMateria(materia);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Discente getDiscente() {
		return discente;
	}
	public void setDiscente(Discente discente) {
		this.discente = discente;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public ArrayList<Frequencia> getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(Frequencia frequencia) {
		this.frequencia.add(frequencia);
	}
	public ArrayList<Integer> getNotas() {
		return notas;
	}
	public void setNotas(int notas) {
		this.notas.add(notas);
	}
	
	public String calculaNota () {
		int notaSoma = 0;
		
		if(this.notas.size() > 0) {
			for(int nota : notas) {
				notaSoma =+ nota; 
			}

			return String.valueOf(notaSoma/notas.size());
		}
		else {
			return "Nenhuma nota foi cadrastrada";
		}
	}
	
	
	public String calculaFrequencia() {
		if(this.frequencia.size() > 0) {
			int falta = 0;
			int presensa = 0;
			
			for(Frequencia f: frequencia) {
				if(f.getPresensa()) {
					presensa++;
				}
				else {
					falta++;
				}
			}
			
			return "Presensa:" + presensa + "Falta:" + falta + "Posentagem Presensa:" + ((double)presensa/(presensa + falta));
		}
		return "Nenhuma pesensa cadastrada";
	}
	@Override
	
	public String toString() {
		return "Materia:" + this.getMateria() + " Discente:" + this.getDiscente().getNome() + " Nota Geral:" + this.calculaNota();
				
	}

}
