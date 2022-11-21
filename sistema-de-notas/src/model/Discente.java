package model;

import java.time.LocalDate;

public class Discente extends Pessoa{
	private long matricula;
	
	public Discente (){
	
	}
	
	public Discente(String nome, LocalDate dtNascimento, long cpf, String nomeUsuario, String senha, long matricula) {
		this.setNome(nome);
		this.setDtNascimento(dtNascimento);
		this.setCpf(cpf);
		this.setNomeUsuario(nomeUsuario);
		this.setSenha(senha);
		this.setMatricula(matricula);
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
	return "Nome:" + this.getNomeUsuario() + " Data Nascimento:" + this.getDtNascimento() + " CPF" + this.getCpf() + " Nome Usuario:" + this.getNomeUsuario() +" Matricula:" + this.getMatricula();
	}
}
