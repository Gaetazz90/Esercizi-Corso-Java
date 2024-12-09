import java.util.Arrays;

public class Main {

    public static void palinsesto(Film[] arrayFilm){
        for(Film film : arrayFilm){
            film.infoFilm();
        }
    }
    public static void infoPerGenere(Film[] arrayFilm, Genere genere){
        for( Film film : arrayFilm){
            if(film.getGenere().equals(genere)){
                film.infoFilm();
            }
        }
    }
    public static void infoPerRegista(Film[] arrayFilm, String regista){
        for( Film film : arrayFilm){
            if(film.getRegista().equals(regista)){
                film.infoFilm();
            }
        }
    }


    public static void main(String[] args) {

        Film[] listaFilm = new Film[8];

        Film film1 = new Film("Seven", 1995, "THRILLER", "David Fincher");
        Film film2 = new Film("Il seme della follia", 1994, "HORROR", "John Carpenter");
        Film film3 = new Film("Blade Runner", 1982, "CYBERPUNK", "Ridley Scott");
        Film film4 = new Film("Snatch", 2000, "AZIONE", "Guy Ritchie");
        Film film5 = new Film("Inglorious Bastards", 2010, "STORICO", "Quentin Tarantino");
        Film film6 = new Film("How High", 2000, "COMMEDIA", "MethodMan&RedMan");
        Film film7 = new Film("Il buono, il brutto e il cattivo", 1966, "WESTERN", "Sergio Leone");
        Film film8 = new Film("Parnassus", 2008, "FANTASY", "Terry Gilliam");

        listaFilm[0] = film1;
        listaFilm[1] = film2;
        listaFilm[2] = film3;
        listaFilm[3] = film4;
        listaFilm[4] = film5;
        listaFilm[5] = film6;
        listaFilm[6] = film7;
        listaFilm[7] = film8;

        palinsesto(listaFilm);
        infoPerGenere(listaFilm, Genere.valueOf("AZIONE"));
        infoPerRegista(listaFilm, "Ridley Scott");

        System.out.println(film2.isVisionando());
        film2.visionaFilm();
        System.out.println(film2.isVisionando());
        film2.terminaVisione();
        System.out.println(film2.isVisionando());

        film3.terminaVisione();
        film3.setDisponibile(false);
        film3.visionaFilm();
        film3.infoFilm();

    }


}