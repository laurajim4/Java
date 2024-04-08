package com.app.ioc;

public class App {

	public static void main(String[] args) {
		User obj = new User(new UserMongo());
		obj.getInsertaUsuario();
		obj.getEliminarUsuarioByID(1);
	}
}
