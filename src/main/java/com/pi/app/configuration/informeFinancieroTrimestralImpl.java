package com.pi.app.configuration;
import org.springframework.stereotype.Component;
@Component
public class informeFinancieroTrimestralImpl implements icrearInformeFinanciero{

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero trimestral";
	}

}