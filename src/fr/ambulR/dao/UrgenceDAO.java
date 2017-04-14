package fr.ambulR.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.ambulR.model.Urgence_patient;

@Repository
@Transactional
public class UrgenceDAO extends DAO<Urgence_patient>{
	
	
	@Override
	public Urgence_patient find(int id) {
		return this.em.find(Urgence_patient.class, id);
	}

	@Override
	public List<Urgence_patient> findAll() {
		return this.em.createQuery("SELECT p.* FROM patient p", Urgence_patient.class).getResultList();
	}

	@Override
	public Urgence_patient save(Urgence_patient object) {
		Urgence_patient result = this.em.merge(object);
		
		return result;
		
	}

	@Override
	public boolean delete(Urgence_patient object) {
		try {
			this.em.remove(this.em.merge(object));
			return true;
		}
		
		catch (Exception ex) {
			return false;
		}
	}
	
	
	@Override
    public List<Urgence_patient> findByLogin(String username, String password) {
        return this.em.createQuery("FROM Urgence_patient where connexion_identifiant='"+ username + "' and connexion_password='" + password + "'", Urgence_patient.class)
                .getResultList();
    }

}

