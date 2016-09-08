package edu.fup.ims.sensors.bo;

import java.util.List;

import javax.ejb.Local;

import edu.fup.ims.sensors.dm.Measure;

@Local
public interface MeasureBO extends CrudBO<Measure>{

	public List<Measure> lookAtVariable(String type, String location);

}
