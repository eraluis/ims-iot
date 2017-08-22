package edu.fup.ims.sensors.bo.impl;

import edu.fup.ims.sensors.bo.SensorStaticBO;
import edu.fup.ims.sensors.dm.SensorStatic;

public class SensorStaticBOImpl extends CrudBOImpl<SensorStatic> implements SensorStaticBO {
	
    public SensorStaticBOImpl() {
        this(SensorStatic.class);
    }

    public SensorStaticBOImpl(Class<SensorStatic> entityClass) {
        super(entityClass);
    }

}
