package filmcatalog.apps.mock;

import filmcatalog.model.FilmCatalog;
import filmcatalog.view.FilmCatalogDisplay;

public class MockFilmCatalogDisplay implements FilmCatalogDisplay{

    private FilmCatalog filmCatalog;
    
    @Override
    public void display(FilmCatalog filmCatalog) {
        this.filmCatalog = filmCatalog;
        System.out.println(filmCatalog.toString());
    }
    
}
