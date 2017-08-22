package edu.fup.ims.sensors.dm;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tbl_measure_static")
@NamedQuery(name = MeasureStatic.FIND_ALL, query = "SELECT m FROM MeasureStatic m")
@XmlRootElement
public class MeasureStatic extends Measure {

	public static final String FIND_ALL = "MeasureStatic.findAll";

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_sensor", nullable = false)
	private SensorStatic sensor;

	public MeasureStatic() {

	}

	public SensorStatic getSensor() {
		return sensor;
	}

	public void setSensor(SensorStatic sensor) {
		this.sensor = sensor;
	}

}
