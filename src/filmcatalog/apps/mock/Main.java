package filmcatalog.apps.mock;

import filmcatalog.control.Command;
import filmcatalog.control.ShowFilmCatalogCommand;
import filmcatalog.model.Film;
import filmcatalog.model.FilmCatalog;
import filmcatalog.model.Image;
import filmcatalog.view.FilmLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    public Main(){
        ShowFilmCatalogCommand init = new ShowFilmCatalogCommand(new MockFilmCatalogDisplay(), new FilmCatalog());
        init.execute();
    }

    private void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class MockFilmLoader implements FilmLoader{

        @Override
        public Collection<Film> load() {
                Collection<Film> catalogFilm = new HashSet<Film>();
        
        List<String> actor = new ArrayList<String>();
        actor.add("Paco");
        actor.add("Elisa");
        
        List<String> actor2 = new ArrayList<String>();
        actor2.add("Juan");
        actor2.add("María");  
        
        catalogFilm.add(new Film("Forrest Gump", 2000, "Pedro", actor, "Comedia", 8, 120, 420, new Image("FORREST GUMP")));
        catalogFilm.add(new Film("Los Miserables", 1980, "Raúl", actor2, "Músical", 7, 80, 200, new Image("LOS MISERABLES")));
        catalogFilm.add(new Film("buscando a Nemo", 2005, "Jessica", actor2, "Dibujos", 10, 132, 1000, new Image("BUSCANDO A NEMO")));
        return catalogFilm;
        }
    }
}
