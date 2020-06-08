package com.pi.app.autowired;

import org.springframework.stereotype.Component;
@Component
public class informeFinancieroSemestralImpl implements icrearInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Entrega de informe semestral";
	}

}
