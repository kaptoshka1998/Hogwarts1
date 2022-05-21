package ru.skypro;

public class Ravenclaw {

        private int wisdom;
        private int wit;
        private int creativity;

        public Ravenclaw (int wisdom, int wit, int creativity) {
            this.wisdom = wisdom;
            this.wit = wit;
            this.creativity = creativity;
        }

        public int getNobility() {
            return wisdom;
        }

        public int getHonor() {
            return wit;
        }

        public int getCourage() {
            return creativity;
        }

    }

