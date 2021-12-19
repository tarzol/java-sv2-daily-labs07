package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    List<Movie> movies = new ArrayList<>();
    java.nio.file.Path Path;

    public MovieService() {

    }

    public List<Movie> readAllLines(java.nio.file.Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
            movies = changeToMovie(lines);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File is not available!");
        }
        return  movies;
    }

    private List<Movie> changeToMovie(List<String > lines) {
        for ( String item : lines) {
            String[] movieElements = item.split(";");
            movies.add(new Movie(movieElements[0], Integer.valueOf(movieElements[1]), movieElements[2] ));
        }
        return movies;
    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        List<Movie> movies = movieService.readAllLines(Paths.get("src/main/resources/movies.csv"));
        for (Movie movie : movies) {
            System.out.println(movie.getTitle().trim()+" "+movie.getDirector()+" "+movie.getYearOfBirth());
        }
    }
}
