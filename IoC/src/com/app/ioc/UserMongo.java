package com.app.ioc;

public class UserMongo implements IUser {

	@Override
	public void InsertaUsuario() {
		System.out.println("Isnertando usuario en Mongo");

	}

	@Override
	public void EliminarUsuarioByID(int id) {
		System.out.println("Eliminando usuario en Mongo:" + id);

	}

}
