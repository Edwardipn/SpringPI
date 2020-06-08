package com.pi.app.DISetter;

public class DirectorEmpleado implements IEmpleados {

	private CreacionInformesFinanciero informe;
	
	//inyección de dependencia por setter
	
	public void setInforme(CreacionInformesFinanciero informe) {
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Indica las actividades a los jefes";
	}

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "informe del director: "+informe.getInformeFinanciero();
	}

}
