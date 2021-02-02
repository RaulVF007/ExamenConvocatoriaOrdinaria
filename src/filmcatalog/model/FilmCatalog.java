package filmcatalog.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FilmCatalog {
    
    public static class CompareGenre implements Comparator<Film>{
        public int compare(Film film1, Film film2){
            //ord = 0: Por género
            String genre1 = film1.getGenre();
            String genre2 = film2.getGenre();
            return genre1.compareTo(genre2);
        }
    }
    
    public static class CompareNews implements Comparator<Film>{
        public int compare(Film film1, Film film2){
            //ord=1: Por novedades; ordenamos de peliculas más recientes a más antiguas:
            Integer year1 = film1.getYear();
            Integer year2 = film2.getYear();
            return year1.compareTo(year2);
        }
    }
    
    public static class CompareViews implements Comparator<Film>{
        public int compare(Film film1, Film film2){
            //ord=2: Por más vistas
            Integer views1 = film1.getViewNumber();
            Integer views2 = film2.getViewNumber();
            return views1.compareTo(views2);
        }
    }
    
    public static class CompareBestMark implements Comparator<Film>{
        public int compare(Film film1, Film film2){
            //ord=3: Por mejor valoración
            Integer mark1 = film1.getMark();
            Integer mark2 = film2.getMark();
            return mark1.compareTo(mark2);
        }
    }
    
    private Collection<Film> filmCatalog;
    private int desiredOrder;
    
    public FilmCatalog(){
        filmCatalog = new HashSet<Film>();
        desiredOrder = 0;
    }
    
    public void setDesiredOrder(int ord){
          if(ord == 0 || ord == 1 || ord == 2 || ord == 3){
            desiredOrder = ord;
        }
    }
    
    public Set<Film> getFilms(){
        TreeSet<Film> films;
        
        if(filmCatalog.isEmpty()){
            return null;
        }
        if(desiredOrder == 0){
            films = new TreeSet<>(new CompareGenre());
        }
        if(desiredOrder == 1){
            films = new TreeSet<>(new CompareNews());
        }
        if(desiredOrder == 2){
            films = new TreeSet<>(new CompareViews());
        }else{
            films = new TreeSet<>(new CompareBestMark());
        }
        
        films.addAll(filmCatalog);
        return films;
    }   
    
    @Override
    public String toString() {
        
        String res = "";
        int i = 1;
        
        if(getFilms() != null){
            for(Film tempFilm : getFilms()){
                res += i + ") " + tempFilm.toString() + "\n";
                i++;
            }
        }
        return res;
    }
}
