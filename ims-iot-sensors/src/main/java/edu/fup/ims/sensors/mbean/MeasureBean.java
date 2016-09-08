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
public class MeasureBean {
	
	private List<Measure> measureleList;
	
	@Inject
	private MeasureBO measureBO;
	
	public MeasureBean(){
		
	}
	
	@PostConstruct
	public void init(){
		measureleList = measureBO.findAll();
	}

	public List<Measure> getMeasureList() {
		return measureleList;
	}

	public void setMeasureList(List<Measure> measureList) {
		this.measureleList = measureList;
	}

}
