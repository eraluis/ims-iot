package edu.fup.ims.sensors.dm;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tbl_sensor_mobile")
@NamedQuery(name = SensorMobile.FIND_ALL, query = "SELECT s FROM SensorMobile s")
@XmlRootElement
public class SensorMobile extends Sensor {
	
	public static final String FIND_ALL = "MobileSensor.findAll";	
	
	public SensorMobile() {
		
	}

	
}
