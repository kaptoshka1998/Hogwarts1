package ru.skypro;

public class Gryffindor extends Hogwarts {

        private int nobility;
        private int honor;
        private int courage;

        public Gryffindor (String firstName, String secondName, int magic, int transgress, int nobility, int honor, int courage) {
            super(firstName, secondName, magic, transgress);
            this.nobility = nobility;
            this.honor = honor;
            this.courage = courage;
        }

        public int getNobility() {
            return nobility;
        }

        public int getHonor() {
            return honor;
        }

        public int getCourage() {
            return courage;
        }

    @Override
    public String toString() {
        return "Гриффиндор " + super.toString() + this.getNobility() + ", " + this.getHonor() + ", " + this.getCourage();
    }

    public static void comparison (Gryffindor first, Gryffindor second) {
            int a = first.getNobility() + first.getHonor() + first.getCourage();
            int b = second.getNobility() + second.getHonor() + second.getCourage();
        if (a > b) {
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " - гриффиндорец лучше, чем " + second.getFirstName() + " " + second.getSecondName());
        } else if (b > a) {
            System.out.println(second.getFirstName() + " " + second.getSecondName()
                    + " - гриффиндорец лучше, чем " + first.getFirstName() + " " + first.getSecondName());
        } else if (a == b && !(first.equals(second))){
            System.out.println(first.getFirstName() + " " + first.getSecondName()
                    + " и " + second.getFirstName() + " " + second.getSecondName()
                    + " - одинаково способные гриффиндорцы!");
        } else {
            System.out.println("Упс, это один и тот же волшебник XD");
        }
    }

}

