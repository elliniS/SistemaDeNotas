package model;

import java.time.LocalDate;

public class Adiministrador extends Pessoa{
	
	public Adiministrador() {
		
	}
	
	public Adiministrador(String nome, LocalDate dtNascimento, long cpf, String nomeUsuario, String senha) {
		this.setNome(nome);
		this.setDtNascimento(dtNascimento);
		this.setCpf(cpf);
		this.setNomeUsuario(nomeUsuario);
		this.setSenha(senha);
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNomeUsuario() + "\n Data Nascimento:" + this.getDtNascimento() + "\n CPF:{2}\n Nome Usuario:" + this.getNomeUsuario();
	}
}
