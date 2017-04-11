package fr.ambulR.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.ambulR.model.ConfirmPassword;
import fr.ambulR.model.Patient;

@Component
public class PatientValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return Patient.class.equals(cls);

	}
	

	@Override public void validate(Object obj, Errors e) {
        Patient cust = (Patient)obj;
        ConfirmPassword custi = (ConfirmPassword)obj;

        if(!(cust.getPassword().equals(custi.getPassword2()))){
            e.rejectValue("password2", "notmatch.password", "les deux password ne sont pas identiques");
        }
        }
	}


