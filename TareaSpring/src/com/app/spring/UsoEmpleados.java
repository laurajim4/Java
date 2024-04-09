package com.app.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
	
	public static void main (String[]args) {
	/*	
	// crea objeto tipo empleado
	Empleados Empleado1 = new DirectorEmpleado();
	
	// uso objeto 
	System.out.println(Empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		/*SecretarioEmpleado Laura = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Laura.getTareas());
		
		System.out.println(Laura.getInforme());
		
		System.out.println("Email: " + Laura.getEmail());
		
		System.out.println("Nombre empresa : " + Laura.getNombreEmpresa());*/
		
		
		
		contexto.close();
	}
}
