package edu.fup.ims.sensors.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.fup.ims.sensors.bo.VariableBO;
import edu.fup.ims.sensors.model.Variable;

@Path("/variables")
@Produces({ "application/json", "application/xml"})
public class VariableResource {
	
	@Inject VariableBO variableBO;
	
	@GET
	public List<Variable> listVariables() {		
		return variableBO.listVariables();
	}
	
}
