package day02;

public class Movie {
    private String title;
    private int yearOfBirth;
    private String director;

    public Movie(String title, int yearOfBirth, String director) {
        this.title = title;
        this.yearOfBirth = yearOfBirth;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getDirector() {
        return director;
    }
}
