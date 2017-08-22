package edu.fup.ims.sensors.bo.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.TypedQuery;

import edu.fup.ims.sensors.bo.SimpleMeasureBO;
import edu.fup.ims.sensors.dm.SimpleMeasure;

@Stateless
@WebService
public class SimpleMeasureBOImpl extends CrudBOImpl<SimpleMeasure> implements SimpleMeasureBO {
	
    public SimpleMeasureBOImpl() {
        this(SimpleMeasure.class);
    }

    public SimpleMeasureBOImpl(Class<SimpleMeasure> entityClass) {
        super(entityClass);
    }
	
   @Override
   public List<SimpleMeasure> lookAtVariable(String type, String location) {
		String jpql = "SELECT v FROM Variable v WHERE v.type = :type AND v.location = :location";
		TypedQuery<SimpleMeasure> query  = getEm().createQuery(jpql,SimpleMeasure.class);
		query.setParameter("type", type);
		query.setParameter("location", location);
		List<SimpleMeasure> variables = query.getResultList();
		return variables;
	}

}
