package edu.fup.ims.sensors.mbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import edu.fup.ims.sensors.bo.MeasureBO;
import edu.fup.ims.sensors.dm.Measure;

@ManagedBean
@ViewScoped
public class VariableBean {
	
	private List<Measure> variableList;
	
	@Inject
	private MeasureBO variableBO;
	
	public VariableBean(){
		
	}
	
	@PostConstruct
	public void init(){
		variableList = variableBO.findAll();
	}

	public List<Measure> getVariableList() {
		return variableList;
	}

	public void setVariableList(List<Measure> variableList) {
		this.variableList = variableList;
	}

}
