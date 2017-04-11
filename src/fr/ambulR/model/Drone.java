package fr.ambulR.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="drone")
public class Drone {

	
	@Id
	@Column (name="drone_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int drone_id;
	
	
	@Column (name="drone_latitude")
	private String latitude;

	@Column (name="drone_longitude")
	private String longitude;
	
	@Column (name="drone_disponibility")
	private boolean disponibility;
	
	@Column (name="drone_module")
	private String module;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public boolean getDisponibility() {
		return disponibility;
	}

	public void setDisponibility(boolean disponibility) {
		this.disponibility = disponibility;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
	
	
	

	
}
