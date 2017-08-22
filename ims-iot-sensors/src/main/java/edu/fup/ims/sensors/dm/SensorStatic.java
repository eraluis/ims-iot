package edu.fup.ims.sensors.dm;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tbl_sensor_static")
@NamedQuery(name = SensorStatic.FIND_ALL, query = "SELECT s FROM SensorStatic s")
@XmlRootElement
public class SensorStatic extends Sensor {
	
	public static final String FIND_ALL = "StaticSensor.findAll";
	
	private String location;
	
	private Float latitud;
	private Float longitud;
	
	public SensorStatic() {
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Float getLatitud() {
		return latitud;
	}
	
	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}
	
	public Float getLongitud() {
		return longitud;
	}
	
	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}
	
}