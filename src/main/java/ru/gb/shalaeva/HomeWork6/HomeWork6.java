package ru.gb.shalaeva.HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(Animal.getCount());
        Cat cat = new Cat();
        cat.run(202);
        cat.swim(1);

        Dog dog = new Dog();
        dog.run(400);
        dog.swim(10);
        System.out.println(Animal.getCount());
    }
}
