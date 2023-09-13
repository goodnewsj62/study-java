public class Store {

    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10]; 
    }

    public Movie getMovie(int index) {
        Movie movie =  this.movies[index];
        return new Movie(movie);
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
