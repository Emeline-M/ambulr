package fr.ambulR.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.ambulR.model.Drone;
import fr.ambulR.model.Patient;

@Repository
@Transactional
public class patientDAO extends DAO<Patient> {
 

	
	@Override
	public Patient find(int id) {
		return this.em.find(Patient.class, id);
	}

	@Override
	public List<Patient> findAll() {
		return this.em.createQuery("SELECT p.* FROM patient p", Patient.class).getResultList();
	}

	@Override
	public Patient save(Patient object) {
		Patient result = this.em.merge(object);
		
		return result;
		
	}

	@Override
	public boolean delete(Patient object) {
		try {
			this.em.remove(this.em.merge(object));
			return true;
		}
		
		catch (Exception ex) {
			return false;
		}
	}
	
	@Override
    public Patient findByLogin(String username, String password) {
        return this.em.createQuery("FROM Patient where connexion_identifiant='"+ username + "' and connexion_password='" + password + "'", Patient.class)
                .getSingleResult();
    }

}
