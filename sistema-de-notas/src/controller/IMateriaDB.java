package controller;

import java.util.ArrayList;

import model.Materia;

public interface IMateriaDB {
	public boolean incluir(Materia m);

	public ArrayList<Materia> listar();

	public boolean atualizar(Materia m, int id);

	public boolean remover(Materia m, int id);
	
	public Materia buscar(int id);

}