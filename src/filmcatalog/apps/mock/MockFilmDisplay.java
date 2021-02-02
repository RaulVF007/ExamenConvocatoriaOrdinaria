package filmcatalog.apps.mock;

import filmcatalog.model.Film;
import filmcatalog.view.FilmDisplay;

public class MockFilmDisplay implements FilmDisplay {

    private Film film;

    @Override
    public void display(Film film) {
        this.film = film;
        System.out.println(film.toString());       
    }
}
