package com.pi.app.DISetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de los objetos de tipo empleado
		
		//Uso de los objetos de tipo empleado

		//Cargando el AplicationContext9.xml, la DI se realiza en la clase que se indico para obtener el Bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext10DISetter.xml");
		IEmpleados Javier = context.getBean("empleadoBean9", IEmpleados.class);
		System.out.println(Javier.getTareas());
		System.out.println(Javier.getInformeFinanciero());
		context.close();
	}
}
