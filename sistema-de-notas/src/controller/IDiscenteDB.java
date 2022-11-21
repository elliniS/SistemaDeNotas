package controller;

import java.util.ArrayList;

import model.Discente;
import model.Materia;

public interface IDiscenteDB {
	
	public boolean incluir(Discente d);

	public ArrayList<Discente> listar();

	public boolean atualizar(Discente d, int id);

	public boolean remover(Discente d, int id);
	
	public Discente buscar(int id);
	
	public ArrayList<Discente> AlunoMateria(RendimentoAlunoDB rDB, Materia m);

}
