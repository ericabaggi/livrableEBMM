package org.form.persistence;

import org.form.modele.Film;

public interface Dao {
public void create(Film f);
public void findMovieByActor(int idActeur);
}
