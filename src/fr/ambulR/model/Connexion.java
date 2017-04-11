package fr.ambulR.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name="connexion")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Connexion
{
	
@Id
@Column (name="connexion_id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int connexion_id;
	
public int getConnexion_id() {
	return connexion_id;
}
public void setConnexion_id(int connexion_id) {
	this.connexion_id = connexion_id;
}
@Column (name="connexion_identifiant")
@NotEmpty(message="Identifiant obligatoire")
private  String identifiant;

@Column (name="connexion_password")
@NotEmpty(message="Mot de passe obligatoire")
private String password;

public String getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(String identifiant) {
	this.identifiant = identifiant;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
