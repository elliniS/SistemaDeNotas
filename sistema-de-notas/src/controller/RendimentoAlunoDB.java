package controller;

import java.util.ArrayList;

import model.RendimentoAluno;

public class RendimentoAlunoDB implements IRendimentoAlunoDB{

private ArrayList<RendimentoAluno> dbRendimentoAluno;
	
	public RendimentoAlunoDB() {
		this.dbRendimentoAluno = new ArrayList<>();
	}

	@Override
	public boolean incluir(RendimentoAluno r) {
		if (r != null) {
			if(this.dbRendimentoAluno.size() == 0) {
				r.setId(0);
			}
			else {
				int idMaior = dbRendimentoAluno.stream().map(n -> n.getId())
						.max(Integer::compareTo)
						.get();
				r.setId(idMaior + 1);
			}
			
			this.dbRendimentoAluno.add(r);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public ArrayList<RendimentoAluno> listar() {
		return this.dbRendimentoAluno;
	}

	@Override
	public boolean atualizar(RendimentoAluno d, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(RendimentoAluno d, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
