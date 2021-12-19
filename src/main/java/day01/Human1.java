package day01;

import java.time.LocalDateTime;

public class Human1 {
    private String name;
    private  int yearOfBirth;

    public Human1(String name, int yearOfBirth) {
        if ((LocalDateTime.now().getYear()-yearOfBirth) >120 || name.trim().indexOf(" ") == -1) {
            throw new IllegalArgumentException("Túl öreg vagy csak egy név");
        } else {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }

    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        //Human1 human1 = new Human1("Peti bá", 1900);
        //Human1 human2 = new Human1("Peti bá", 1980);
        Human1 human3 = new Human1("Petibá", 1900);

    }

}
