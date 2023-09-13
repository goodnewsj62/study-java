import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        movies =  new ArrayList<>();
    }

    public Movie getMovie(int index) {
        Movie movie =  this.movies.get(index);

        return new Movie(movie);
    }

    public void setMovie(int index, Movie movie) {
        movies.add(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        movies.add(new Movie(movie));
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}