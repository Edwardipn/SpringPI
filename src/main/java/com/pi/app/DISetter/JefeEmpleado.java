package com.pi.app.DISetter;

public class JefeEmpleado implements IEmpleados {
	
	private CreacionInformesFinanciero informe;
	
	//inyección de dependencia por setter


	public JefeEmpleado(CreacionInformesFinanciero informe) {
		this.informe = informe;
	}

	public void setInforme(CreacionInformesFinanciero informe) {
		this.informe = informe;
	}

	public String getTareas() {
		return "Coordino las actividades de los desarrolladores";
	}

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "informe del jefe: "+informe.getInformeFinanciero();
	}
}
