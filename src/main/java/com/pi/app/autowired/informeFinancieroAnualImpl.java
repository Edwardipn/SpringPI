package com.pi.app.autowired;
import org.springframework.stereotype.Component;
@Component
public class informeFinancieroAnualImpl implements icrearInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Informe financiero anual";
	}

}
