package model;

public class Materia {
	private int id;
	private String nome;
	private Docente docente;
	private int cargagaHoraria;
	private int quantDiasAula;
	
	public Materia() {
		
	}
	
	public Materia(String nome, int cargagaHoraria) {
		this.setNome(nome);
		this.setCargagaHoraria(cargagaHoraria);
		this.setQuantDiasAula(quantDiasAula);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargagaHoraria() {
		return cargagaHoraria;
	}
	public void setCargagaHoraria(int cargagaHoraria) {
		this.cargagaHoraria = cargagaHoraria;
	}

	public int getQuantDiasAula() {
		return quantDiasAula;
	}

	public void setQuantDiasAula(int quantDiasAula) {
		this.quantDiasAula = quantDiasAula;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNome() + "Carcga Horaria:" + this.getCargagaHoraria() + "Quantidade de Dias:" + this.getQuantDiasAula() + "Doncente:" + this.getDocente();
	}
}
