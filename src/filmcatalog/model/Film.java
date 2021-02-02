package filmcatalog.model;

import java.util.List;

public class Film {
    private String title;
    private int year;
    private String director;
    private List<String> actor;
    private String genre;
    private int mark;
    private int duration;
    private int viewsNumber;
    private Image cover;

    public Film(String title, int year, String director, List<String> actor, String genre, int mark, int duration, int viewNumber, Image cover) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actor = actor;
        this.genre = genre;
        this.mark = mark;
        this.duration = duration;
        this.viewsNumber = viewNumber;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActor() {
        return actor;
    }

    public String getGenre() {
        return genre;
    }

    public int getMark() {
        return mark;
    }

    public int getDuration() {
        return duration;
    }

    public int getViewNumber() {
        return viewsNumber;
    }
    
    public Image getCover() {
        return cover;
    }
    
    @Override
    public String toString() {
        return getCover() + " | " +getTitle() + " | " + getDirector() + " | " + getGenre() + " | " + getYear() + " | " + getViewNumber() + " | " + getMark();
    }
    
    @Override
    public boolean equals (Object film) {
        if(film == null){
           return false; 
        }
        if(film == this){
           return true; 
        }
        if(!(film instanceof Film)){
            return false;
        }
        Film f1 = (Film) film;
        return (this.title == f1.getTitle() && this.year == f1.getYear());
    }
    
    @Override
    public int hashCode(){
        int resultado = 23;
        resultado = 6 * resultado + title.hashCode();
        resultado = 6 * resultado + year;
        return resultado;
    }
}
