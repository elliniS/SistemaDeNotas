package controller;

import java.util.ArrayList;

import model.Adiministrador;

public interface IAdiministradorDB {
	public boolean incluir(Adiministrador m);

	public ArrayList<Adiministrador> listar();

	public boolean atualizar(Adiministrador m, int id);

	public boolean remover(Adiministrador m, int id);
	
	public Adiministrador buscar(int id);
}
