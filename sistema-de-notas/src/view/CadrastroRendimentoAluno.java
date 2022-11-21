package view;

import java.util.Scanner;

import controller.MateriaDB;
import controller.RendimentoAlunoDB;
import model.Discente;
import model.RendimentoAluno;

public class CadrastroRendimentoAluno {
	public CadrastroRendimentoAluno(RendimentoAlunoDB redimentoDB, MateriaDB materiaDB, Discente dicente) {
		Scanner s = new Scanner(System.in);
		RendimentoAluno rendimentoAluno = new RendimentoAluno();
		
		System.out.println("Digite o id da materia:");
		rendimentoAluno.setMateria(materiaDB.buscar(Integer.valueOf(s.nextLine())));
		
		rendimentoAluno.setDiscente(dicente);
	}

}
