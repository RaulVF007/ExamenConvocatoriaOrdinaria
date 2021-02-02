package filmcatalog.view;

import filmcatalog.model.Film;
import java.util.Collection;

public interface FilmLoader {
    Collection<Film> load();
}
