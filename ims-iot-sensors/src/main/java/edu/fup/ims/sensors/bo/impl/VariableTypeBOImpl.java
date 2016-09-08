package edu.fup.ims.sensors.bo.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;

import edu.fup.ims.sensors.bo.VariableTypeBO;
import edu.fup.ims.sensors.dm.VariableType;

@Stateless
@WebService
public class VariableTypeBOImpl extends CrudBOImpl<VariableType> implements VariableTypeBO {
	
    public VariableTypeBOImpl() {
        this(VariableType.class);
    }

    public VariableTypeBOImpl(Class<VariableType> entityClass) {
        super(entityClass);
    }

}
