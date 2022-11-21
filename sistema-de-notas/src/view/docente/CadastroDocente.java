package view.docente;

import java.time.LocalDate;
import java.util.Scanner;

import controller.DocenteDB;
import model.Docente;

public class CadastroDocente {
	public CadastroDocente(DocenteDB dDB) {
		Scanner s = new Scanner(System.in);
		Docente docente = new Docente();
		
		System.out.println("Nome:");
		docente.setNome(s.nextLine());
		
		System.out.println("Data de Nascimento:");
		docente.setDtNascimento(LocalDate.parse(s.nextLine()));
		
		System.out.println("CPF");
		docente.setCpf(Long.valueOf(s.nextLine()));
		
		System.out.println("Nome Usuario:");
		docente.setNomeUsuario(s.nextLine());
		
		System.out.println("Senha:");
		docente.setSenha(s.nextLine());
		
		System.out.println("Siape:");
		docente.setSiape(Long.valueOf(s.nextLine()));
		
		dDB.incluir(docente);
	}
}
