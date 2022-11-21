package controller;

import java.util.ArrayList;

import model.Materia;

public class MateriaDB implements IMateriaDB{
	private ArrayList<Materia> dbMateria;
	
	public MateriaDB() {
		this.dbMateria = new ArrayList<>();
	}
	
	@Override
	public boolean incluir(Materia m) {

		if (m != null) {
			if(this.dbMateria.size() == 0) {
				m.setId(0);
			}
			else {
				int idMaior = dbMateria.stream().map(n -> n.getId())
						.max(Integer::compareTo)
						.get();
				m.setId(idMaior + 1);
			}
			
			this.dbMateria.add(m);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public ArrayList<Materia> listar() {
		return this.dbMateria;
	}

	@Override
	public boolean atualizar(Materia m, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Materia m, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Materia buscar(int id) {
		for (Materia m : this.listar()) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}

}
