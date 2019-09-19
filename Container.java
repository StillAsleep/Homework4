import java.util.ArrayList;
import java.util.List;

public class Container implements Player {
	List<Movie> movieList;

	public Container() {
		movieList = new ArrayList<Movie>();
	}

	@Override
	public List<Movie> getMovies() {

		return movieList;
	}

	@Override
	public void addMovie(Movie movie) {
		movieList.add(movie);
	}

	@Override
	public void removeMovie(Movie movie) {
		movieList.remove(movie);
	}

	@Override
	public Iterator createIterator(String iteratorType) {
		if ("10".equals(iteratorType)) {
			return new TenIterator(movieList);
        } 
        if ("9".equals(iteratorType)) {
			return new NineIterator(movieList);
        }else {
			return new EightIterator(movieList);
		}
	}
}