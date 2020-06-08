package com.pi.app.DIConstruc;

public class DirectorEmpleado implements IEmpleados {

	private CreacionInformesFinanciero informe;
	
	//inyección de dependencia por constructor
	
	public DirectorEmpleado(CreacionInformesFinanciero informe) {
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Indica las actividades de los jefes";
	}

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "informe del director: "+informe.getInformeFinanciero();
	}

}
