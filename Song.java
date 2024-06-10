package Songs;

import Iplay.Iplay;

public class Song implements Iplay {

    private String title;
    private String artist;
    private String release;
    private double songLength;

    public Song(String title, String artist, String release, double songLength) {
        this.title = title;
        this.artist = artist;
        this.release = release;
        this.songLength = songLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    @Override
    public String toString() {
        return  "Songtitel: " + this.title + '\'' +
                ", Künstler: '" + this.artist + '\'' +
                ", Veröffentlichung: " + this.release + '\'' +
                ", Liedlänge: " + this.songLength;
    }


    @Override
    public void IplayMedium() {
        System.out.println("Es wird " + this.title + " von " + this.artist + " abgespielt");
    }

    @Override
    public void IstopMedium() {
        System.out.println(this.title + " von " + this.artist + " wurde gestoppt.");
    }
}
