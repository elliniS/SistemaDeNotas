package model;

import java.time.LocalDate;

public class Docente extends Pessoa{
	private long siape;
	
	public Docente(){
		
	}
	
	public Docente(String nome, LocalDate dtNascimento, long cpf, String nomeUsuario, String senha, long siape) {
		this.setNome(nome);
		this.setDtNascimento(dtNascimento);
		this.setCpf(cpf);
		this.setNomeUsuario(nomeUsuario);
		this.setSenha(senha);
		this.setSiape(siape);
	}

	public long getSiape() {
		return siape;
	}

	public void setSiape(long siape) {
		this.siape = siape;
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNomeUsuario() + "\nData Nascimento:" + this.getDtNascimento() + "\nCPF:" + this.getSiape() + "\nNome Usuario:" + this.getNomeUsuario() +"\nSiape:" + this.getSiape();
	}
	
}
