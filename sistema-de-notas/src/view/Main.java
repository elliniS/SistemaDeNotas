package view;

import java.util.Scanner;

import controller.DiscenteDB;
import controller.DocenteDB;
import controller.MateriaDB;
import controller.RendimentoAlunoDB;
import model.Discente;
import model.Docente;
import model.Materia;
import model.RendimentoAluno;
import view.adiministrador.Cadastros;

public class Main {

	public static void main(String[] args) {
		int opicao;
		MateriaDB materiaDB = new MateriaDB();
		DiscenteDB discenteDB = new DiscenteDB();
		DocenteDB  docenteDB = new DocenteDB();
		RendimentoAlunoDB redimentoDB = new RendimentoAlunoDB();
		

		Scanner s = new Scanner(System.in);
		
		//CadastroDiscente cdDiscente = new CadastroDiscente(discenteBD);
	    //CadastroMateria cdMateria = new CadastroMateria(mDB);
		
		//CadastroDocente cdDocente = new CadastroDocente(docenteDB);
		
		//CadrastroRendimentoAluno cdRendimentoAluno = new CadrastroRendimentoAluno(redimentoDB, discenteDB, docenteDB, materiaDB);
		
		
		do {
			System.out.println("0 - Sair, 1 - Cadrastar, 2 - Entar");
			opicao = s.nextInt();
			switch (opicao) {
			case 1: {
				Cadastros c = new Cadastros(materiaDB, discenteDB, docenteDB);
				break;
			}
			
			case 2:{
				System.out.println("long");
			}

			default:
				System.out.println("numero digitado invalido");
			}

		} while (opicao != 0);
		
		for (RendimentoAluno d : redimentoDB.listar()) {
			System.out.println(d);
		}
	}

}
