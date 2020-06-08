package com.pi.app.singleton_prototype;

public class SecretarioEmpleado implements IEmpleados {

	private CreacionInformesFinanciero informe;
	private String email;
	private String nomEmpresa;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

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
