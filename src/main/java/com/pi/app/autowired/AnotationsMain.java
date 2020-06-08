package com.pi.app.autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnotationsMain{

	public static void main(String[] args) {

		//Leer el XML de configuracion (Contenedor de Spring, ApplicationContext)
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext17Autowired.xml");
		//pedir un bean al contenedor invocandolo con su nombre. El nombre se asigno en la anotation @component "ComercialExperimentado"
		IEmpleados Eduardo=appContext.getBean("comercialExpertoImpl", IEmpleados.class);
		//usar el bean
		System.out.println(Eduardo.getTareas());
		System.out.println(Eduardo.getInformes());
		//Cerrar el contexto
		appContext.close();
	}

}
