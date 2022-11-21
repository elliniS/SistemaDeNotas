package view.adiministrador;

import java.time.LocalDate;
import java.util.Scanner;

import model.Adiministrador;

public class CadastroAdiministrador {
	public CadastroAdiministrador() {
		Scanner s = new Scanner(System.in);
		Adiministrador adiministrador = new Adiministrador();
		
		System.out.println("Nome:");
		adiministrador.setNome(s.nextLine());
		
		System.out.println("Data de Nascimento:");
		adiministrador.setDtNascimento(LocalDate.parse(s.nextLine()));
		
		System.out.println("CPF");
		adiministrador.setCpf(Long.valueOf(s.nextLine()));
		
		System.out.println("Nome Usuario:");
		adiministrador.setNomeUsuario(s.nextLine());
		
		System.out.println("Senha:");
		adiministrador.setSenha(s.nextLine());
	}
}
