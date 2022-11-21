package controller;

import java.util.ArrayList;

import model.Discente;
import model.Materia;
import model.RendimentoAluno;

public class DiscenteDB implements IDiscenteDB {
	
	private ArrayList<Discente> dbDiscente;

	public DiscenteDB() {
		this.dbDiscente = new ArrayList<>();
	}
	
	@Override
	public boolean incluir(Discente d) {
		if (d != null) {
			if(this.dbDiscente.size() == 0) {
				d.setId(0);
			}
			else {
				int idMaior = dbDiscente.stream().map(n -> n.getId())
						.max(Integer::compareTo)
						.get();
				d.setId(idMaior + 1);
			}
			
			this.dbDiscente.add(d);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public ArrayList<Discente> listar() {
		return this.dbDiscente;
	}

	@Override
	public boolean atualizar(Discente d, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Discente d, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Discente buscar(int id) {
		for (Discente d : this.listar()) {
			if (d.getId() == id) {
				return d;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Discente> AlunoMateria(RendimentoAlunoDB rDB, Materia m) {

		ArrayList<Discente> listaAluno = new ArrayList<>();
		for(RendimentoAluno r : rDB.listar()) {
			
			if(r.getMateria() == m) {
				listaAluno.add(r.getDiscente());
			}
		}
		return listaAluno;
	}
}
