import java.util.List;

public class NineIterator implements Iterator{
	private List<Movie> movieList;
	private int position;

	public NineIterator(List<Movie> movieList) {
		this.movieList = movieList;
	}
	@Override
	public Movie nextMovie() {
		Movie movie = null;
		for (; position < movieList.size(); position++) {
			if ("9".equals(movieList.get(position).getRating())) {
				movie = movieList.get(position);
				position++;
				break;
			}
		}
		return movie;
	}

	@Override
	public boolean isLastMovie() {
		for (int i = position; i < movieList.size(); i++) {
			if ("9".equals((movieList.get(i)).getRating())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Movie currentMovie() {
		if (position < movieList.size()) {
			return movieList.get(position);
		}
		return null;
	}
}