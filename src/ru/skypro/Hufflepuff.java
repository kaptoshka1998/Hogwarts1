package ru.skypro;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String secondName, int magic, int transgress, int diligence, int loyalty, int honesty) {
        super(firstName, secondName, magic, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй " + super.toString() + this.getDiligence() + ", " + this.getLoyalty() + ", " + this.getHonesty();
    }

    public static void comparison (Hufflepuff first, Hufflepuff second) {
        int a = first.getDiligence() + first.getLoyalty() + first.getHonesty();
        int b = second.getDiligence() + second.getLoyalty() + second.getHonesty();
        if (a > b) {
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " - пуффендуец лучше, чем " + second.getFirstName() + " " + second.getSecondName());
        } else if (b > a) {
            System.out.println(second.getFirstName() + " " + second.getSecondName()
                    + " - пуффендуец лучше, чем " + first.getFirstName() + " " + first.getSecondName());
        } else if (a == b && !(first.equals(second))){
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " и " + second.getFirstName() + " " + second.getSecondName()
                    + " - одинаково способные пуффендуйцы!");
        } else {
            System.out.println("Упс, это один и тот же волшебник XD");
        }

    }
}

