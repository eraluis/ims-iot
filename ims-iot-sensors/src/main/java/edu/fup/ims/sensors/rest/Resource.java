package edu.fup.ims.sensors.rest;

import java.util.List;

import javax.ws.rs.core.Response;

public interface Resource<T> {
	
	public List<T> list();
	public T find(Long pId );
	public T add(T resource);
	public Response delete(Long pId );

}
