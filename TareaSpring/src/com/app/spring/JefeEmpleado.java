package com.app.spring;

public class JefeEmpleado implements Empleados {
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		return "Gestiono las cuentas relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presetnado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}
