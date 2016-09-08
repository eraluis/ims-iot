package edu.fup.ims.sensors.bo.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.fup.ims.sensors.bo.CrudBO;


public abstract class CrudBOImpl<T> implements CrudBO<T> {

    @PersistenceContext(unitName = "sensors-pu")
    private EntityManager em;
    
    private Class<T> entityClass;
    
    private CrudBOImpl(){ }
        
    public CrudBOImpl(Class<T> entityClass) {
        this();
        this.entityClass = entityClass;
    }
    
    protected EntityManager getEm(){
    	return em;
    }
        
    @Override
    public T add(T entity){
        em.persist(entity);
        em.flush();
        return entity;
    }
        
    @Override
    public void edit(T entity) {
        em.merge(entity);
    }

    @Override
    public void remove(T entity) {
        em.remove(em.merge(entity));
    }

    @Override
    public T find(Object id) {
        return em.find(entityClass, id);
    }
    
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
