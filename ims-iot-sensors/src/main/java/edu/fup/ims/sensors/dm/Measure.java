package edu.fup.ims.sensors.dm;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Measure {
	
	@Id 
	//@GeneratedValue(strategy=GenerationType.SEQUENCE) Use this in postgres
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	private Date timestamp;
	private float value;
	
	//Getters and setters...	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Measure{");
        sb.append("id=").append(id).append(",");               
        sb.append("timestamp='").append(timestamp);
        sb.append('}');
        return sb.toString();
    }

}
