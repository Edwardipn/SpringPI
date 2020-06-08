package com.pi.app.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de los objetos de tipo empleado
		
//		Se contemplo el video 7 sobre IoC:
			//Aqui solo se crearon tres clases y se comprobo la abstraccion con interfaces
//		Empleados jefe= new JefeEmpleado();
//		Empleados secretario= new SecretarioEmpleado();
//		Empleados director= new DirectorEmpleado();
		
		//Uso de los objetos de tipo empleado
//		System.out.println("Tareas del jefe: "+jefe.getTareas());
//		System.out.println("Tareas del secretario: "+director.getTareas());

//		Se contemplo el video 8 sobre IoC:
		//Cargando el AplicationContext8.xml, la IoC se realiza en la clase que se indico para obtener el Bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext8IoC.xml");
		Empleados Javier = context.getBean("empleadoBean", Empleados.class);
		System.out.println(Javier.getTareas());
		context.close();
	}
}
