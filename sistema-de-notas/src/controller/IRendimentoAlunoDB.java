package controller;

import java.util.ArrayList;

import model.RendimentoAluno;

public interface IRendimentoAlunoDB {
	public boolean incluir(RendimentoAluno d);

	public ArrayList<RendimentoAluno> listar();

	public boolean atualizar(RendimentoAluno d, int id);

	public boolean remover(RendimentoAluno d, int id);

}
