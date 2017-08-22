package edu.fup.ims.sensors.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import edu.fup.ims.sensors.bo.SensorMobileBO;
import edu.fup.ims.sensors.bo.SensorStaticBO;
import edu.fup.ims.sensors.bo.VariableTypeBO;
import edu.fup.ims.sensors.dm.Sensor;
import edu.fup.ims.sensors.dm.SensorStatic;
import edu.fup.ims.sensors.dm.VariableType;

@ManagedBean
@ViewScoped
public class SensorBean {
	
	private List<VariableType> variableTypes;
	private VariableType selectedVariableType;
	
	private List<SensorStatic> sensors;
	private Sensor selectedSensor;
	private Sensor newSensor;
			
	@Inject
	private VariableTypeBO variableTypeBO;
	@Inject
	private SensorStaticBO sensorStaticBO;
	@Inject
	private SensorMobileBO sensorMobileBO;
	
	public SensorBean(){
		
	}
	
	@PostConstruct
	public void init(){
		variableTypes = variableTypeBO.findAll();
		sensors = sensorStaticBO.findAll();
		
		
	}

	// Getters and setters...
	public List<VariableType> getVariableTypes() {
		return variableTypes;
	}

	public void setVariableTypes(List<VariableType> variableTypes) {
		this.variableTypes = variableTypes;
	}

	public VariableType getSelectedVariableType() {
		return selectedVariableType;
	}

	public void setSelectedVariableType(VariableType selectedVariableType) {
		this.selectedVariableType = selectedVariableType;
	}

	public List<SensorStatic> getSensors() {
		if(sensors == null){
			sensors = new ArrayList<>();
		}
		return sensors;
	}

	public Sensor getSelectedSensor() {
		return selectedSensor;
	}

	public void setSelectedSensor(Sensor selectedSensor) {
		this.selectedSensor = selectedSensor;
	}

	public Sensor getNewSensor() {
		return newSensor;
	}

	public void setNewSensor(Sensor newSensor) {
		this.newSensor = newSensor;
	}

}
