/**
 * IMDBdemo
 */
public class IMDBdemo {

    public static void main(String[] args) {
        Container container = new Container();
        container.addMovie(new Movie("The Godfather", "10"));
        container.addMovie(new Movie("The Shawshank Redemption", "10"));
        container.addMovie(new Movie("The Dark Knight", "10"));
        container.addMovie(new Movie("The Godfather: Part II ", "10"));
        container.addMovie(new Movie("Schindler's List", "10"));
        container.addMovie(new Movie("Pulp Fiction", "9"));
        container.addMovie(new Movie("Goodfellas", "9"));
        container.addMovie(new Movie("12 Angry Men", "9"));
        container.addMovie(new Movie("The Lord of the Rings: The Fellowship of the Ring ", "9"));
        container.addMovie(new Movie("Inception", "8"));
        container.addMovie(new Movie("Fight Club", "8"));
        container.addMovie(new Movie("Forrest Gump", "8"));
        container.addMovie(new Movie("Star Wars: Episode V - The Empire Strikes Back (", "8"));

        Iterator teniIterator = container.createIterator("10");
        while (teniIterator.isLastMovie()== false){
            System.out.println("Movie: " + teniIterator.nextMovie().getMovie()+" is Rated 10/10 on IMDB");
        }

        Iterator nineiIterator = container.createIterator("9");
        while (nineiIterator.isLastMovie()== false){
            System.out.println("Movie: " + nineiIterator.nextMovie().getMovie()+" is Rated 9/10 on IMDB");
        }

        Iterator eightiIterator = container.createIterator("8");
        while (eightiIterator.isLastMovie()== false){
            System.out.println("Movie: " + eightiIterator.nextMovie().getMovie()+" is Rated 8/10 on IMDB");
        }
    }
}