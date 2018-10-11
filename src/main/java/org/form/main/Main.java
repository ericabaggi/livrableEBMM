package org.form.main;

import org.form.modele.Acteur;
import org.form.modele.Film;
import org.form.persistence.Dao;
import org.form.persistence.DaoImp;

public class Main {

	public static void main(String[] args) {
		Dao dao = new DaoImp();
		Acteur a = new Acteur();
		a.setNom("Emmanuelle Béart");

		Film f1 = new Film();
		f1.setNom("Jean de Florette");
		f1.getActeurs().add(a);
		dao.create(f1);

	}

}
