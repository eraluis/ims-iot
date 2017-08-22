package edu.fup.ims.sensors.dm;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "tbl_measure_mobile")
@NamedQuery(name = MeasureMobile.FIND_ALL, query = "SELECT m FROM MeasureMobile m")
@XmlRootElement
public class MeasureMobile extends Measure {

	public static final String FIND_ALL = "MeasureMobile.findAll";

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_sensor", nullable = false)
	private SensorMobile sensor;
	
	private String location;
	private Float latitud;
	private Float longitud;

	public MeasureMobile() {

	}

	public SensorMobile getSensor() {
		return sensor;
	}

	public void setSensor(SensorMobile sensor) {
		this.sensor = sensor;
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
