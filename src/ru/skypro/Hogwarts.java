package ru.skypro;

public class Hogwarts {

    private String firstName;
    private String secondName;
    private int magic;
    private int transgress;

    public Hogwarts(String firstName, String secondName, int magic, int transgress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getTransgress() {
        return this.transgress;
    }

    @Override
    public String toString() {
        return "Студент: " + this.getFirstName() + " " + this.getSecondName() + ". Характеристики: " +
                this.getMagic() + ", " + this.getTransgress() + ", ";
    }

    public static void comparison(Hogwarts first, Hogwarts second) {
        int a = first.getMagic() + first.getTransgress();
        int b = second.getMagic() + second.getTransgress();
        if (a > b) {
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " - студент способнее, чем " + second.getFirstName() + " " + second.getSecondName());
        } else if (b > a) {
            System.out.println(second.getFirstName() + " " + second.getSecondName()
                    + " - студент спомобнее, чем " + first.getFirstName() + " " + first.getSecondName());
        } else if (a == b && !(first.equals(second))) {
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " и " + second.getFirstName() + " " + second.getSecondName()
                    + " - одинаково способные волшебники!");
        } else {
            System.out.println("Упс, это один и тот же волшебник XD");
        }
        }

    }
