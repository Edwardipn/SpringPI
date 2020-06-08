package com.pi.app.configuration;
import org.springframework.stereotype.Component;
@Component
public class informeFinancieroAnualImpl implements icrearInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Informe financiero anual";
	}

}
