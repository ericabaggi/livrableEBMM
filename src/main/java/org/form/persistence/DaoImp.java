package org.form.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.form.modele.Acteur;
import org.form.modele.Film;

public class DaoImp implements Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	@Override
	public void create(Film f) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.persist(f);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();

		}
	}

	@Override
	public void findMovieByActor(int idActeur) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
	}

}
