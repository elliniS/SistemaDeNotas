package view.docente;

import java.util.Scanner;

import controller.DiscenteDB;
import controller.MateriaDB;
import controller.RendimentoAlunoDB;
import model.Discente;
import model.Docente;
import model.Materia;

public class DocenteMain {
	public DocenteMain(Docente docente, MateriaDB materiaDB, RendimentoAlunoDB rendimentoDB, DiscenteDB discenteDB) {
		int opicao;
		
		do {
			Scanner s = new Scanner(System.in);
			
			System.out.println("0- Voltar, 1- Listar Sua materias Materias/aluno, 2- Cadastrar Frequencia, 3- Cadastrar Notas");
			opicao = s.nextInt();
			switch (opicao) {
			case 1: {
				for(Materia m : materiaDB.listar()) {
					if(m.getDocente() == docente)
					System.out.println(m);
					
					for(Discente d : discenteDB.AlunoMateria(rendimentoDB, m)) {
						System.out.println(d);
						System.out.println("\n");
					}
					
					System.out.println("\n");
				}
				break;
			}
			
			case 2:{
			}

			default:
				System.out.println("numero digitado invalido");
			}

	} while (opicao != 0);
	}
}
