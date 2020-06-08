package com.pi.app.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//con @Component estamos solicitando el bean que se llamara ComercialExperimentado
@Component//("ComercialExperimentado")//este es el bean                                                 
public class ComercialExpertoImpl implements IEmpleados{
	@Autowired
	@Qualifier("informeFinancieroAnualImpl")
	private icrearInformeFinanciero informe;
	
//	
//	@Autowired
//	public ComercialExpertoImpl(icrearInformeFinanciero informe) {
//		this.informe = informe;
//	}

//	
//	@Autowired	public void setInforme(icrearInformeFinanciero informe) {
//		this.informe = informe;
//	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial"+informe.getInformeFinanciero();
	}
}
