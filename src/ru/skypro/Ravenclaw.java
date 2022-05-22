package ru.skypro;

public class Ravenclaw extends Hogwarts {

    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String secondName, int magic, int transgress, int wisdom, int wit, int creativity) {
        super(firstName, secondName, magic, transgress);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Когтевран " + super.toString() + this.getWisdom() + ", " + this.getWit() + ", " + this.getCreativity();
    }

    public static void comparison(Ravenclaw first, Ravenclaw second) {
        int a = first.getWisdom() + first.getWit() + first.getCreativity();
        int b = second.getWisdom() + second.getWit() + second.getCreativity();
        if (a > b) {
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " - когтевранец лучше, чем " + second.getFirstName() + " " + second.getSecondName());
        } else if (b > a) {
            System.out.println(second.getFirstName() + " " + second.getSecondName()
                    + " - когтевранец лучше, чем " + first.getFirstName() + " " + first.getSecondName());
        } else if (a == b && !(first.equals(second))){
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " и " + second.getFirstName() + " " + second.getSecondName()
                    + " - одинаково способные когтевранцы!");
        } else {
            System.out.println("Упс, это один и тот же волшебник XD");
        }

    }
}

