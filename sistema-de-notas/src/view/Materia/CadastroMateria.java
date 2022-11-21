package view.Materia;

import java.util.Scanner;

import controller.DocenteDB;
import controller.MateriaDB;
import model.Materia;

public class CadastroMateria {
	public CadastroMateria(MateriaDB materiaDB, DocenteDB docenteDB) {
		Scanner s = new Scanner(System.in);
		Materia materia = new Materia();
		
		System.out.println("Nome da materia:");
		materia.setNome(s.nextLine());
		
		System.out.println("Carga Horaria:");
		materia.setCargagaHoraria(Integer.valueOf(s.nextLine()));
		
		System.out.println("Dias de Alulas");
		materia.setQuantDiasAula(Integer.valueOf(s.nextLine()));
		
		System.out.println("Digite o codigo siape do profersor");
		materia.setDocente(docenteDB.buscar(Integer.valueOf(s.nextLine())));
		
		materiaDB.incluir(materia);
	}
}
