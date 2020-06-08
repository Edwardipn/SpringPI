package com.pi.app.component;
import org.springframework.stereotype.Component;

//con @Component estamos solicitando el bean que se llamara ComercialExperimentado
@Component//("ComercialExperimentado")//este es el bean                                                 
public class ComercialExpertoImpl implements IEmpleados{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial";
	}
}
