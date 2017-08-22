package edu.fup.ims.sensors.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import edu.fup.ims.sensors.bo.SimpleMeasureBO;
import edu.fup.ims.sensors.dm.SimpleMeasure;

@ManagedBean
@ViewScoped
public class MeasureBean {
	
	private List<SimpleMeasure> measureleList;
	
	@Inject
	private SimpleMeasureBO measureBO;
	
	public MeasureBean(){
		
	}
	
	@PostConstruct
	public void init(){
		measureleList = measureBO.findAll();
	}

	public List<SimpleMeasure> getMeasureList() {
		return measureleList;
	}

	public void setMeasureList(List<SimpleMeasure> measureList) {
		this.measureleList = measureList;
	}

}
