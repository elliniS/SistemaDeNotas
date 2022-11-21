package controller;

import java.util.ArrayList;

import model.Docente;

public interface IDocenteDB {
	public boolean incluir(Docente d);

	public ArrayList<Docente> listar();

	public boolean atualizar(Docente d, int id);

	public boolean remover(Docente d, int id);
	
	public Docente buscar(int id);
}
