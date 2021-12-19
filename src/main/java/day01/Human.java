package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int dateOfBirth;

    public Human(String name, int dateOfBirth) {
        if ((LocalDate.now().getYear() - dateOfBirth) <= 120 && name != null && name.trim().indexOf(" ") > 0) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new IllegalArgumentException("A megadott adatok nem megfelelőek!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static void main(String[] args) {
        Human human = new Human("Kis Virág", 1900);
        //System.out.println(human);
    }
}
