package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testReadAllLines() {
        MovieService movieService = new MovieService();
        //List<Movie> movies = movieService.readAllLines(Paths.get("src/main/resources/movies.csv"));
        IllegalStateException ise = assertThrows(IllegalStateException.class, ()->movieService.readAllLines(Paths.get("src/main/resources/movies_.csv")));
        assertEquals("File is not available!", ise.getMessage());
    }

}