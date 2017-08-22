package edu.fup.ims.sensors.dm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
@Table(name="tbl_simple_mesure")
@NamedQuery(name = SimpleMeasure.FIND_ALL, query = "SELECT m FROM SimpleMeasure m")
@XmlRootElement
public class SimpleMeasure extends Measure {	
	
	public static final String FIND_ALL = "SimpleMeasure.findAll";
		
	private String type;
	private String location;
	private Float latitud;
	private Float longitud;
	
	public SimpleMeasure(){
	}
	
	public SimpleMeasure(String type, String location, float value){
		this.setType(type);
		this.setLocation(location);
		this.setTimestamp(new Date());
		this.setValue(value);		
	}	
	
	public SimpleMeasure(String type, String location, Date timestamp, float value){
		this.setType(type);
		this.setLocation(location);
		this.setTimestamp(timestamp);
		this.setValue(value);		
	}	

	//Getters and setters...
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


	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SimpleMeasure{")
          .append("id=").append(this.getId()).append(",")
          .append("type='").append(type).append("\',")
          .append("location='").append(location).append("\',")
          .append("timestamp='").append(this.getTimestamp()).append("\',")
          .append("value='").append(this.getTimestamp())
          .append('}');
        
        return sb.toString();
    }

}
