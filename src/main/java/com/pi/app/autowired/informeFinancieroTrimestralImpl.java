package com.pi.app.autowired;
import org.springframework.stereotype.Component;
@Component
public class informeFinancieroTrimestralImpl implements icrearInformeFinanciero{

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero trimestral";
	}

}