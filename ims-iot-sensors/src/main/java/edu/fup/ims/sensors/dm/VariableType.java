package edu.fup.ims.sensors.dm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name = VariableType.FIND_ALL, query = "SELECT v FROM VariableType v")
@XmlRootElement
public class VariableType {
	
	public static final String FIND_ALL = "VariableType.findAll";
	
	@Id 
	//@GeneratedValue(strategy=GenerationType.SEQUENCE) Use this in postgres
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String baseUnit;
	private String symbol;
	private boolean internationalStandard;
	
	public VariableType(){
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBaseUnit() {
		return baseUnit;
	}
	
	public void setBaseUnit(String baseUnit) {
		this.baseUnit = baseUnit;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public boolean isInternationalStandard() {
		return internationalStandard;
	}
	
	public void setInternationalStandard(boolean internationalStandard) {
		this.internationalStandard = internationalStandard;
	}

}
