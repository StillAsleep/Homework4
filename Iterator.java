/*
Base Interface thats lets iteration happen
 */
public interface Iterator {
	public Movie nextMovie ();
	public boolean isLastMovie();
	public Movie currentMovie();
}