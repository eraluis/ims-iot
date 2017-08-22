package edu.fup.ims.sensors.rest;

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

import edu.fup.ims.sensors.bo.SimpleMeasureBO;
import edu.fup.ims.sensors.dm.SimpleMeasure;

@Path("/measures")
public class MeasureResource implements Resource<SimpleMeasure> {
	
	@Inject SimpleMeasureBO measureBO;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<SimpleMeasure> list() {		
		return measureBO.findAll();
	}	
	
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public SimpleMeasure find(@PathParam("id") Long pId ) {
        System.out.println("find measure with id: "+pId);
        return measureBO.find(pId);
    }
        
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public SimpleMeasure add(SimpleMeasure measure) {
    	measure.setTimestamp(new Date());
    	measureBO.add(measure);
        return measure;
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long pId ) {
        System.out.println("Delete measure with id:"+ pId);
        SimpleMeasure m = measureBO.find(pId);
        measureBO.remove(m);
        return Response.noContent().build();
    }
    
}
