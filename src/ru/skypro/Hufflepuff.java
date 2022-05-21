package ru.skypro;

public class Hufflepuff {

        private int diligence;
        private int loyalty;
        private int honesty;

        public Hufflepuff (int diligence, int loyalty, int honesty) {
            this.diligence = diligence;
            this.loyalty = loyalty;
            this.honesty = honesty;
        }

        public int getNobility() {
            return diligence;
        }

        public int getHonor() {
            return loyalty;
        }

        public int getCourage() {
            return honesty;
        }

    }

