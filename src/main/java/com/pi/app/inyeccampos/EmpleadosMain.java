package com.pi.app.inyeccampos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de los objetos de tipo empleado
		
		//Uso de los objetos de tipo empleado

		//Cargando el AplicationContextXXX.xml, la DI se realiza en la clase que se indico para obtener el Bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext11inyeccampos.xml");
		JefeEmpleado Javier = context.getBean("empleadoBean", JefeEmpleado.class);
		System.out.println(Javier.getTareas());
		System.out.println(Javier.getInformeFinanciero());
		System.out.println(Javier.getNombreEmpresa());
		System.out.println(Javier.getEmail());
		context.close();
	}
}
