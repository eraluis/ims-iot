package edu.fup.ims.sensors.bo.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.fup.ims.sensors.bo.VariableBO;
import edu.fup.ims.sensors.model.Variable;

@Stateless @WebService
public class VariableBoImpl implements VariableBO {
	
	@PersistenceContext(unitName = "sensors-pu")
	private EntityManager em;
	
	public void addVariable(Variable variable) {		
		System.out.println("Adding variable");
		em.persist(variable);		
	}

	public Variable lookAtVariableById(Integer id) {
		//Variable lookAtId = new Variable();
		//lookAtId.setId(id);
		Variable result = em.find(Variable.class, id);
		return result;
	}
	
	@SuppressWarnings("unchecked")	
	public List<Variable> lookAtVariable(String type, String location) {
		String jpql = "SELECT v FROM Variable v WHERE v.type = :type AND v.location = :location";
		Query query  = em.createQuery(jpql,Variable.class);
		query.setParameter("type", type);
		query.setParameter("location", location);
		List<Variable> variables = query.getResultList();
		return variables;
	}
	
	@SuppressWarnings("unchecked")	
	public List<Variable> listVariables() {
		Query query = em.createNamedQuery(Variable.FIND_ALL);
		List<Variable> variables = query.getResultList();
		return variables;
	}

}
