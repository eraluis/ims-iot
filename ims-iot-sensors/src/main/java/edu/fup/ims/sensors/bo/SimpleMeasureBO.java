package edu.fup.ims.sensors.bo;

import java.util.List;

import javax.ejb.Local;

import edu.fup.ims.sensors.dm.SimpleMeasure;

@Local
public interface SimpleMeasureBO extends CrudBO<SimpleMeasure>{

	public List<SimpleMeasure> lookAtVariable(String type, String location);

}
