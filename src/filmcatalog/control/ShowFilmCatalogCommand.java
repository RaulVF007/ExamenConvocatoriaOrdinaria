package filmcatalog.control;

import filmcatalog.model.FilmCatalog;
import filmcatalog.view.FilmCatalogDisplay;

public class ShowFilmCatalogCommand implements Command{
    private final FilmCatalogDisplay filmCatalogDisplay;
    private FilmCatalog filmCatalog;

    public ShowFilmCatalogCommand(FilmCatalogDisplay filmCatalogDisplay, FilmCatalog filmCatalog) {
        this.filmCatalogDisplay = filmCatalogDisplay;
        this.filmCatalog = filmCatalog;
    }
    
    @Override
    public void execute() {
        filmCatalogDisplay.display(filmCatalog);
    }
}
