package com.pi.app.singleton_prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadosMain {
	public static void main(String[] args) {
		//Cargando en ApplicationContextXXX.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext13singleton_prototype.xml");
//		Singleton.
//		para prototype solo se agrega el scope="prototype" en el ApplicationContextXXX.xml 
		SecretarioEmpleado Eduardo = context.getBean("empleadoBean", SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = context.getBean("empleadoBean", SecretarioEmpleado.class);
		System.out.println(Eduardo);
		System.out.println(Pedro); 

		context.close();
	}
}