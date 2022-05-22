package ru.skypro;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String firstName, String secondName, int magic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(firstName, secondName, magic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Слизерин " + super.toString() + this.getCunning() + ", " +
                this.getDetermination() + ", " + this.getAmbition() + ", " + this.getResourcefulness() +
                ", " + this.getPower();
    }

    public static void comparison(Slytherin first, Slytherin second) {
        int a = first.getCunning() + first.getDetermination() + first.getAmbition()
                + first.getResourcefulness() + first.getPower();
        int b = second.getCunning() + second.getDetermination() + second.getAmbition()
                + second.getResourcefulness() + second.getPower();
        if (a > b) {
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " - слизеринец лучше, чем " + second.getFirstName() + " " + second.getSecondName());
        } else if (b > a) {
            System.out.println(second.getFirstName() + " " + second.getSecondName()
                    + " - слизеринец лучше, чем " + first.getFirstName() + " " + first.getSecondName());
        } else if (a == b && !(first.equals(second))){
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " и " + second.getFirstName() + " " + second.getSecondName()
                    + " - одинаково способные слизеринцы!");
        } else {
            System.out.println("Упс, это один и тот же волшебник XD");
        }
    }
}


