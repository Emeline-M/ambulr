package fr.ambulR.model;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
 

public class ConfirmPassword extends Patient{

	
	@NotEmpty(message="rentrer le password2")
	private String password2;

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
}
