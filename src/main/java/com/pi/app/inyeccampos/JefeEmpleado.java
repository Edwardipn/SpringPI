package com.pi.app.inyeccampos;

public class JefeEmpleado implements IEmpleados {
	
	private CreacionInformesFinanciero informe;
	private String email;
	private String nombreEmpresa;
	
	//inyección de dependencia por setter


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
