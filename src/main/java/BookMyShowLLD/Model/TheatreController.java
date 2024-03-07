package BookMyShowLLD.Model;

import BookMyShowLLD.Model.Theatre.City;
import BookMyShowLLD.Model.Theatre.Movie;
import BookMyShowLLD.Model.Theatre.Show;
import BookMyShowLLD.Model.Theatre.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;

    public TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, City city) {

        allTheatre.add(theatre);

        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }


    public Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {


        // Storing all shows in theatres in given city which are displaying given movie
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        //get all the theater of this city
        List<Theatre> theatres = cityVsTheatre.get(city);

        //filter the theatres which run this movie

        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.getMovie().getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }

}
