package edu.fup.ims.sensors.dm;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que registra una variable sensada por un dispositivo.
 * 
 * </br>
 * <b>Entradas:</b>
 * <ul>
 *	<li> type: tipo de variable (Temperatura, Presión, etc).
 *	<li> location: localiazción donde se realiza la medida (Popayan, Bogota, etc).
 *	<li> timestamp: momento exacto en que se realiza la medida (06/05/2015 10:38:65.985).
 *	<li> value: valor sensado.
 * </ul>
 *
 * @author Luis Eraso
 *
 */
@Entity
@NamedQuery(name = Measure.FIND_ALL, query = "SELECT m FROM Measure m")
@XmlRootElement
public class Measure {	
	
	public static final String FIND_ALL = "Measure.findAll";
		
	@Id 
	//@GeneratedValue(strategy=GenerationType.SEQUENCE) Use this in postgres
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String location;
	private Float latitud;
	private Float longitud;
	private Date timestamp;
	private float value;
	
	public Measure(){
	}
	
	public Measure(String type, String location, float value){
		this.setType(type);
		this.setLocation(location);
		this.setTimestamp(new Date());
		this.setValue(value);		
	}	
	
	public Measure(String type, String location, Date timestamp, float value){
		this.setType(type);
		this.setLocation(location);
		this.setTimestamp(timestamp);
		this.setValue(value);		
	}	

	//Getters and setters...	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Activity");
        sb.append(", id='").append(id).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", location='").append(location);
        sb.append(", timestamp='").append(timestamp).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
