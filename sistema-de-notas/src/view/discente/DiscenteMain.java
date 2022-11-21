package view.discente;

import java.util.Scanner;

import controller.MateriaDB;
import controller.RendimentoAlunoDB;
import model.Discente;
import model.Materia;
import model.RendimentoAluno;
import view.CadrastroRendimentoAluno;

public class DiscenteMain {
	public DiscenteMain(Discente dicente, MateriaDB materiaDB, RendimentoAlunoDB redimentoDB) {
		int opicao;
		
			do {
				Scanner s = new Scanner(System.in);
				
				System.out.println("0- Voltar, 1- Listar Materias Disponiveis, 2 -Se Matricular Em Uma Materia, 3- Ver Seus redimentos");
				opicao = s.nextInt();
				switch (opicao) {
				case 1: {
					for(Materia m : materiaDB.listar()) {
						System.out.println(m);
						System.out.println("\n");
					}
					break;
				}
				
				case 2:{
					CadrastroRendimentoAluno cdRendimentoAluno = new CadrastroRendimentoAluno(redimentoDB, materiaDB, dicente);
					break;
				}
				
				case 3:{
					for(RendimentoAluno r: redimentoDB.listar()) {
						System.out.println(r);
						System.out.println("\n");
					}
					break;
				}
	
				default:
					System.out.println("numero digitado invalido");
				}

		} while (opicao != 0);
	}
}
