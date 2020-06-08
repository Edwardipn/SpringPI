package com.pi.app.camposProperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadosMain {
	public static void main(String[] args) {
		//Cargando en ApplicationContextXXX.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext12camposProperties.xml");
		SecretarioEmpleado Eduardo = context.getBean("empleadoBean", SecretarioEmpleado.class);
		System.out.println(Eduardo.getNomEmpresa());
		System.out.println(Eduardo.getEmail());
		System.out.println(Eduardo.getTareas());
		System.out.println(Eduardo.getInformeFinanciero());
		context.close();
	}
}