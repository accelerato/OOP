package com.company;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Ball firstA = new Ball(5);
        Ball firstB = new Ball(7, 4);
        Ball firstC = new Ball(7, 4, "red");
        Book secondA = new Book("blue");
        Book secondB = new Book("blue", 80);
        Book secondC = new Book("blue", 300, "Invisible man");
        System.out.println(firstC.getColor());
        System.out.println(firstC.getRadius());
        System.out.println(firstC.getWeight());
        System.out.println(secondC.getColor());
        System.out.println(secondC.getName());
        System.out.println(secondC.getCountPage());
        System.out.println(secondC.getClass());
    }
}
