package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Hogwarts[] hogwarts = new Hogwarts[] {
                new Gryffindor("Harry", "Potter", 76, 88, 85, 74, 95),
                new Gryffindor("Ron", "Weasley", 66, 78, 75, 64, 85),
                new Gryffindor("Hermione", "Granger", 90, 90, 75, 74, 75),
                new Slytherin("Draco", "Malfoy", 76, 88, 85, 75, 90, 68, 79),
                new Slytherin("Graham", "Montague", 75, 76, 79, 64, 97, 88, 78),
                new Slytherin("Gregory", "Goyle", 65, 87, 65, 86, 76, 68, 80),
                new Hufflepuff("Zacharias", "Smith", 64, 75, 57, 87, 88),
                new Hufflepuff("Cedric", "Diggory", 65, 88, 76, 68, 81),
                new Hufflepuff("Justin", "Finch-Fletchley", 54, 67, 78, 87, 68),
                new Ravenclaw("Cho", "Chang", 69, 75, 89, 67, 70),
                new Ravenclaw("Padma", "Patil", 60, 87, 89, 76, 75),
                new Ravenclaw("Marcus", "Belby", 68, 80, 87, 65, 69),
        };

        Gryffindor[] gryffindors = new Gryffindor[] {
                new Gryffindor("Harry", "Potter", 76, 88, 85, 74, 95),
                new Gryffindor("Ron", "Weasley", 66, 78, 75, 64, 85),
                new Gryffindor("Hermione", "Granger", 90, 90, 75, 74, 75),
        };

        Slytherin[] slytherins = new Slytherin[] {
                new Slytherin("Draco", "Malfoy", 76, 88, 85, 75, 90, 68, 79),
                new Slytherin("Graham", "Montague", 75, 76, 79, 64, 97, 88, 78),
                new Slytherin("Gregory", "Goyle", 65, 87, 65, 86, 76, 68, 80),
        };

        Hufflepuff[] hufflepuffs = new Hufflepuff[] {
                new Hufflepuff("Zacharias", "Smith", 64, 75, 57, 87, 88),
                new Hufflepuff("Cedric", "Diggory", 65, 88, 76, 68, 81),
                new Hufflepuff("Justin", "Finch-Fletchley", 54, 67, 78, 87, 68),
        };

        Ravenclaw[] ravenclaws = new Ravenclaw[] {
                new Ravenclaw("Cho", "Chang", 69, 75, 89, 67, 70),
                new Ravenclaw("Padma", "Patil", 60, 87, 89, 76, 75),
                new Ravenclaw("Marcus", "Belby", 68, 80, 87, 65, 69),
        };

        System.out.println(hogwarts[1].toString());
        Gryffindor.comparison(gryffindors[0], gryffindors[2]);
        Slytherin.comparison(slytherins[1], slytherins[2]);
        Ravenclaw.comparison(ravenclaws[0], ravenclaws[1]);
        Hufflepuff.comparison(hufflepuffs[2],hufflepuffs[0]);
        Hogwarts.comparison(hogwarts[5], hogwarts[5]);
    }
}
