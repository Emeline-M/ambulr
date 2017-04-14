package fr.ambulR.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.ambulR.model.Drone;
import fr.ambulR.model.Urgence_patient;

@Repository
@Transactional
public class DroneDAO extends DAO<Drone>{



	@Override
	public Drone find(int id) {
		Drone result = this.em.find(Drone.class, id);
		return result;
	}

	@Override
	public List<Drone> findAll() {
		return this.em.createQuery("SELECT d.* FROM drone d", Drone.class).getResultList();
	}

	@Override
	public Drone save(Drone object) {
		Drone result = this.em.merge(object);
		return result;
	}

	@Override
	public boolean delete(Drone object) {
		try {
			this.em.remove(this.em.merge(object));
			return true;
		}
		
		catch (Exception ex) {
			return false;
		}
	}
	
	
	@Override
    public List<Drone> findByLogin(String username, String password) {
        return this.em.createQuery("FROM Drone where connexion_identifiant='"+ username + "' and connexion_password='" + password + "'", Drone.class)
                .getResultList();
    }

	

}
