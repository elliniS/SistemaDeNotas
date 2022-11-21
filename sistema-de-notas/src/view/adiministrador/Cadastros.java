package view.adiministrador;

import java.util.Scanner;

import controller.DiscenteDB;
import controller.DocenteDB;
import controller.MateriaDB;
import view.Materia.CadastroMateria;
import view.discente.CadastroDiscente;
import view.docente.CadastroDocente;

public class Cadastros {
	
	public Cadastros(MateriaDB materiaDB, DiscenteDB discenteDB, DocenteDB  docenteDB) {
		int opicao;
		
		do {
			Scanner s = new Scanner(System.in);

			System.out.println("0 - Sair, 1 - Cadastrar Materia, 2 - Cadastrar Discente, 3 - Cadastrar docente");
			opicao = s.nextInt();

			switch (opicao) {
			case 1: {
				CadastroMateria cdMateria = new CadastroMateria(materiaDB, docenteDB);
				break;
			}

			case 2: {
				CadastroDiscente cdDiscente = new CadastroDiscente(discenteDB);
				break;
			}

			case 3: {
				CadastroDocente cdDocente = new CadastroDocente(docenteDB);
				break;
			}

			default:
				System.out.println("numero digitado invalido");
			}

		} while (opicao != 0);
	}

}
