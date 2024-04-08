package com.app.ioc;

public class User {
	
	IUser user;
	
	public User(IUser user) {
		this.user = user;
	}

	public void getInsertaUsuario() {
		user.InsertaUsuario();
	}
	
	public void getEliminarUsuarioByID(int id) {
		user.EliminarUsuarioByID(id);
	}
}
