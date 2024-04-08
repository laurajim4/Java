package com.app.ioc;

public class UserOracle implements IUser{

	@Override
	public void InsertaUsuario() {
		System.out.println("Insertando Usuario en Oracle");
		
	}

	@Override
	public void EliminarUsuarioByID(int id) {
		System.out.println("Eliminando Usuario en Oracle: " + id);
		
		
	}

}
