import java.util.List;
 
public interface Player {
	public List<Movie> getMovies();
	public void addMovie(Movie movie);
	public void removeMovie(Movie movie);
	public Iterator createIterator(String iteratorType);
}