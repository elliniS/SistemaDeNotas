package controller;

import java.util.ArrayList;

import model.Pessoa;

public interface IPessoaDB {

	public boolean incluir(Pessoa p);

	public ArrayList<Pessoa> listar();

	public boolean atualizar(Pessoa p, int id);

	public boolean remover(Pessoa p, int id);
}
