package fr.ambulR.model;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="urgences_en_cours")
public class Urgence_patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="id_patient")
    private int id_patient;
	
	@Column (name="nom_patient")
    private String nom;
	
	@Column (name="prenom_patient")
    private String prenom_patient;
	
	@Column (name="tel_patient")
    private String tel_patient;
	
	@Column (name="date_urgence")
    private Date date_urgence;
	
	@Column (name="lat_patient")
    private double lat_patient;
	
	@Column (name="long_patient")
    private double long_patient;

	public int getId_patient() {
		return id_patient;
	}

	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom_patient() {
		return prenom_patient;
	}

	public void setPrenom_patient(String prenom_patient) {
		this.prenom_patient = prenom_patient;
	}

	public String getTel_patient() {
		return tel_patient;
	}

	public void setTel_patient(String tel_patient) {
		this.tel_patient = tel_patient;
	}

	public Date getDate_urgence() {
		return date_urgence;
	}

	public void setDate_urgence(Date date_urgence) {
		this.date_urgence = date_urgence;
	}

	public double getLat_patient() {
		return lat_patient;
	}

	public void setLat_patient(double lat_patient) {
		this.lat_patient = lat_patient;
	}

	public double getLong_patient() {
		return long_patient;
	}

	public void setLong_patient(double long_patient) {
		this.long_patient = long_patient;
	}
	
	
	
	

}
