package Movies;

import Iplay.Iplay;

public class Movie implements Iplay {

    private String title;
    private String director;
    private String release;
    private double movieLength;

    public Movie(String title, String director, String release, double movieLength) {
        this.title = title;
        this.director = director;
        this.release = release;
        this.movieLength = movieLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public double getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(double movieLength) {
        this.movieLength = movieLength;
    }

    @Override
    public String toString() {
        return  "Filmtitel: " + this.title + '\'' +
                ", Regisseur: " + this.director + '\'' +
                ", Veröffentlichung: " + this.release + '\'' +
                ", Filmlänge: " + this.movieLength;
    }

    @Override
    public void IplayMedium() {
        System.out.println("Es wird gerade " + this.title + " von " + this.director + " aus dem Jahre: " + this.release + " abgespielt.");
    }

    @Override
    public void IstopMedium() {
        System.out.println(this.title + " von " + this.director + " wurde gestoppt.");
    }
}
