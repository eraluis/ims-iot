package edu.fup.ims.sensors.bo.impl;

import edu.fup.ims.sensors.bo.SensorMobileBO;
import edu.fup.ims.sensors.dm.SensorMobile;

public class SensorMobileBOImpl extends CrudBOImpl<SensorMobile> implements SensorMobileBO {
	
    public SensorMobileBOImpl() {
        this(SensorMobile.class);
    }

    public SensorMobileBOImpl(Class<SensorMobile> entityClass) {
        super(entityClass);
    }

}
