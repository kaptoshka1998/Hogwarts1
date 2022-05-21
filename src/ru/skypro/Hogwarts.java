package ru.skypro;

public class Hogwarts {

        private String firstName;
        private String secondName;
        private int magic;
        private int transgress;

        public Hogwarts (String firstName, String secondName, int magic, int transgress) {
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
    }
