/**
 * Base class with methods to add and subtract whats being iterated. In this case
 * its Movies.
 */
public class Movie {

    private String movieName;
    private String movieRating;

    public Movie(String movieName, String movieRating){
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public String getMovie(){
        return movieName;
    }

    public void setMovie(String movieName){
        this.movieName = movieName;
    }

    public String getRating(){
        return movieRating;
    }

    public void setRating(String movieRating){
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        
        return "Name: "+ movieName +"\n" +"This movie is rated: "+ movieRating + " on IMDB";
    }
}