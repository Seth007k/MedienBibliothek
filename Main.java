package Main;
import Movies.Movie;
import Songs.Song;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> filmListe = new ArrayList<>();

        filmListe.add(new Movie("Krieg der Welten", "Steven Spielberg", "2005", 112.0));
        filmListe.add(new Movie("Joker","Todd Phillips","2019",122.0));
        filmListe.add(new Movie("Martyrs","Pascal Laugier","2008",95.0));

        ArrayList<Song> songListe = new ArrayList<>();

        songListe.add(new Song("To the Hellfire","Lorna Shore", "2021",6.06));
        songListe.add(new Song("Cloud Connected","In Flames", "2002",3.44));
        songListe.add(new Song("Angst","Rammstein", "2022",3.45));


        songListe.get(0).IplayMedium();
        songListe.get(1).IplayMedium();
        songListe.get(2).IplayMedium();

        songListe.get(0).IstopMedium();
        songListe.get(1).IstopMedium();
        songListe.get(2).IstopMedium();

        filmListe.get(0).IplayMedium();
        filmListe.get(1).IplayMedium();
        filmListe.get(2).IplayMedium();

        filmListe.get(0).IstopMedium();
        filmListe.get(1).IstopMedium();
        filmListe.get(2).IstopMedium();

    }
}