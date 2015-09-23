package edu.fup.ims.sensors.bo;

import java.util.List;

import javax.ejb.Local;

import edu.fup.ims.sensors.model.Variable;

@Local
public interface VariableBO {

	public void addVariable(Variable variable);
	public Variable lookAtVariableById(Integer id);
	public List<Variable> lookAtVariable(String type, String location);
	public List<Variable> listVariables();

}
