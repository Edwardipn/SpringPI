package com.pi.app.configuration;

import org.springframework.stereotype.Component;
@Component
public class informeFinancieroSemestralImpl implements icrearInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Entrega de informe semestral";
	}

}
