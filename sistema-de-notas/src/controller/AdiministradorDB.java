package controller;

import java.util.ArrayList;

import model.Adiministrador;

public class AdiministradorDB implements IAdiministradorDB{
	private ArrayList<Adiministrador> dbAdiministrador;
	
	public  AdiministradorDB() {
		this.dbAdiministrador = new ArrayList<>();
	}
	
	@Override
	public boolean incluir(Adiministrador m) {
		if (m != null) {
			if(this.dbAdiministrador.size() == 0) {
				m.setId(0);
			}
			else {
				int idMaior = dbAdiministrador.stream().map(n -> n.getId())
						.max(Integer::compareTo)
						.get();
				m.setId(idMaior + 1);
			}
			
			this.dbAdiministrador.add(m);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<Adiministrador> listar() {
		return this.dbAdiministrador;
	}

	@Override
	public boolean atualizar(Adiministrador m, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Adiministrador m, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Adiministrador buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
