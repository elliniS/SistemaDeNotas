package view.discente;

import java.time.LocalDate;
import java.util.Scanner;

import controller.DiscenteDB;
import model.Discente;

public class CadastroDiscente {
	public CadastroDiscente(DiscenteDB dDB) {
		Scanner s = new Scanner(System.in);
		Discente discente = new Discente();
		
		System.out.println("Nome:");
		discente.setNome(s.nextLine());
		
		System.out.println("Data de Nascimento:");
		discente.setDtNascimento(LocalDate.parse(s.nextLine()));
		
		System.out.println("CPF");
		discente.setCpf(Long.valueOf(s.nextLine()));
		
		System.out.println("Nome Usuario:");
		discente.setNomeUsuario(s.nextLine());
		
		System.out.println("Senha:");
		discente.setSenha(s.nextLine());
		
		System.out.println("Matricula:");
		discente.setMatricula(Long.valueOf(s.nextLine()));
		
		dDB.incluir(discente);
	}
}