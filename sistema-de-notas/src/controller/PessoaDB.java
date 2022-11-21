package controller;

import java.util.ArrayList;

import model.Pessoa;

public class PessoaDB implements IPessoaDB{

	private ArrayList<Pessoa> dbPessoa;

	public PessoaDB() {
		this.dbPessoa = new ArrayList<>();
	}

	@Override
	public boolean incluir(Pessoa p) {

		if (p != null) {
			if(this.dbPessoa.size() == 0) {
				p.setId(0);
			}
			else {
				int idMaior = dbPessoa.stream().map(n -> n.getId())
						.max(Integer::compareTo)
						.get();
				p.setId(idMaior + 1);
			}
			
			this.dbPessoa.add(p);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public ArrayList<Pessoa> listar() {
		return this.dbPessoa;
	}

	@Override
	public boolean atualizar(Pessoa p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Pessoa p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
