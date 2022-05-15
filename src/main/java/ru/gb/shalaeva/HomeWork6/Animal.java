package ru.gb.shalaeva.HomeWork6;

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private static int count;

    abstract void run(int length);

    abstract void swim(int length);

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    }

    class Cat extends Animal {

        private final int MAX_RUN_LENGTH = 200;

        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Cat has run" + length + "m.");
            else System.out.println("Cat has run 0 m.");
        }

        @Override
        void swim(int length) {
            System.out.println("Cat has swim 0 m.");
        }

    }

    class Dog extends Animal {


        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;

        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Dog has run "  +  length + " m.");
            else System.out.println("Dog has run 0 m.");
        }

        @Override
        void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Dog has swim "  +  length + " m.");
            else System.out.println("Dog has swim 0 m.");
        }

    }

