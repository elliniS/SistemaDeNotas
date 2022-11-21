package controller;

import java.util.ArrayList;

import model.Docente;

public class DocenteDB implements IDocenteDB{

	private ArrayList<Docente> dbDocente;
	
	public  DocenteDB() {
		this.dbDocente = new ArrayList<>();
	}
	
	@Override
	public boolean incluir(Docente d) {
		if (d != null) {
			if(this.dbDocente.size() == 0) {
				d.setId(0);
			}
			else {
				int idMaior = dbDocente.stream().map(n -> n.getId())
						.max(Integer::compareTo)
						.get();
				d.setId(idMaior + 1);
			}
			
			this.dbDocente.add(d);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<Docente> listar() {
		return this.dbDocente;
	}

	@Override
	public boolean atualizar(Docente d, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Docente d, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Docente buscar(int id) {
		for (Docente d : this.listar()) {
			if (d.getId() == id) {
				return d;
			}
		}
		return null;
	}

}
