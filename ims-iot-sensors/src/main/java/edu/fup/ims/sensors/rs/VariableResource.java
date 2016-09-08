package edu.fup.ims.sensors.rs;

import java.util.Date;
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

import edu.fup.ims.sensors.bo.MeasureBO;
import edu.fup.ims.sensors.dm.Measure;

@Path("/variables")
public class VariableResource {
	
	@Inject MeasureBO variableBO;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Measure> list() {		
		return variableBO.findAll();
	}	
	
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Measure find(@PathParam("id") Long pId ) {
        System.out.println("buscando pelicula con id: "+pId);
        return variableBO.find(pId);
    }
        
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Measure add(Measure variable) {
    	variable.setTimestamp(new Date());
    	variableBO.add(variable);
        return variable;
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long pId ) {
        System.out.println("Delete variable with id:"+ pId);
        Measure v = variableBO.find(pId);
        variableBO.remove(v);
        return Response.noContent().build();
    }
}
