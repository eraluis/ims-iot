package edu.fup.ims.sensors.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import edu.fup.ims.sensors.bo.VariableTypeBO;
import edu.fup.ims.sensors.dm.VariableType;

@ManagedBean
@ViewScoped
public class VariableTypeBean {
	
	private List<VariableType> variableTypeList;
	private VariableType newItem;
	private VariableType selectedItem;
		
	@Inject
	private VariableTypeBO variableTypeBO;
	
	public VariableTypeBean(){
		
	}
	
	@PostConstruct
	public void init(){
		variableTypeList = variableTypeBO.findAll();
		newItem = new VariableType();
		selectedItem = new VariableType();
	}

	// Getters and setters...
	public List<VariableType> getVariableTypeList() {
		return variableTypeList;
	}

	public void setVariableTypeList(List<VariableType> variableTypeList) {
		this.variableTypeList = variableTypeList;
	}

	public VariableType getNewItem() {
		return newItem;
	}

	public void setNewItem(VariableType newItem) {
		this.newItem = newItem;
	}

	public VariableType getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(VariableType selectedItem) {
		this.selectedItem = selectedItem;
	}

}
