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
        firstA.printClass();
        firstB.printClass();
        firstC .printClass();
        secondA.printClass();
        secondB.printClass();
        secondC.printClass();
    }
}
