package edu.fup.ims.sensors.dm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name = Sensor.FIND_ALL, query = "SELECT s FROM Sensor s")
@XmlRootElement
public class Sensor {
	
	public static final String FIND_ALL = "Sensor.findAll";
	
	@Id 
	//@GeneratedValue(strategy=GenerationType.SEQUENCE) Use this in postgres
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_variable_type", nullable = false)
	private VariableType type;
	
	private boolean mobile;
	private Float latitud;
	private Float longitud;
	
	private boolean active;
	private Date initDate;
	private Date endDate;
	
	public Sensor() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public VariableType getType() {
		return type;
	}
	
	public void setType(VariableType type) {
		this.type = type;
	}
	
	public boolean isMobile() {
		return mobile;
	}
	
	public void setMobile(boolean mobile) {
		this.mobile = mobile;
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
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Date getInitDate() {
		return initDate;
	}
	
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}