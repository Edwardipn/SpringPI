package com.pi.app.DIConstruc;

public class SecretarioEmpleado implements IEmpleados {

	private CreacionInformesFinanciero informe;
	
	//inyección de dependencia por constructor
	public SecretarioEmpleado(CreacionInformesFinanciero informe) {
		this.informe = informe;
	}

	@Override 
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Realizo apoyo administrativo al gerente";
	}

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "informe del secretario: "+informe.getInformeFinanciero();
	}

}
