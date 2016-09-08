package edu.fup.ims.sensors.bo.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.TypedQuery;

import edu.fup.ims.sensors.bo.MeasureBO;
import edu.fup.ims.sensors.dm.Measure;

@Stateless @WebService
public class MeasureBOImpl extends CrudBOImpl<Measure> implements MeasureBO {
	
    public MeasureBOImpl() {
        this(Measure.class);
    }

    public MeasureBOImpl(Class<Measure> entityClass) {
        super(entityClass);
    }
	
   @Override
   public List<Measure> lookAtVariable(String type, String location) {
		String jpql = "SELECT v FROM Variable v WHERE v.type = :type AND v.location = :location";
		TypedQuery<Measure> query  = getEm().createQuery(jpql,Measure.class);
		query.setParameter("type", type);
		query.setParameter("location", location);
		List<Measure> variables = query.getResultList();
		return variables;
	}


}
