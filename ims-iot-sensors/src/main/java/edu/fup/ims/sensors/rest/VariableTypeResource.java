package edu.fup.ims.sensors.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.fup.ims.sensors.bo.VariableTypeBO;
import edu.fup.ims.sensors.dm.VariableType;

@Path("/variable_types")
public class VariableTypeResource implements Resource<VariableType> {
	
	@Inject VariableTypeBO variableTypeBO;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<VariableType> list() {		
		return variableTypeBO.findAll();
	}	
	
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public VariableType find(@PathParam("id") Long pId ) {
        System.out.println("find with id: "+pId);
        return variableTypeBO.find(pId);
    }
        
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public VariableType add(VariableType variableType) {
    	variableTypeBO.add(variableType);
        return variableType;
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long pId ) {
        System.out.println("Delete variableType with id:"+ pId);
        VariableType v = variableTypeBO.find(pId);
        variableTypeBO.remove(v);
        return Response.noContent().build();
    }

}
