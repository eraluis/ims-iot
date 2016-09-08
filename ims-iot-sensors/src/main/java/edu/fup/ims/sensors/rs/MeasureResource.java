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

@Path("/measures")
public class MeasureResource implements Resource<Measure> {
	
	@Inject MeasureBO measureBO;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Measure> list() {		
		return measureBO.findAll();
	}	
	
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Measure find(@PathParam("id") Long pId ) {
        System.out.println("find measure with id: "+pId);
        return measureBO.find(pId);
    }
        
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Measure add(Measure measure) {
    	measure.setTimestamp(new Date());
    	measureBO.add(measure);
        return measure;
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long pId ) {
        System.out.println("Delete measure with id:"+ pId);
        Measure m = measureBO.find(pId);
        measureBO.remove(m);
        return Response.noContent().build();
    }
    
}
