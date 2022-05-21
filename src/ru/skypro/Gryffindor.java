package ru.skypro;

public class Gryffindor extends Hogwarts {

        private int nobility;
        private int honor;
        private int courage;

        public Gryffindor (String firstName, String secondName, int magic, int transgress, int nobility, int honor, int courage) {
            super(String firstName, String secondName, int magic, int transgress);
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

    }

