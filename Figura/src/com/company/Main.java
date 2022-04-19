package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        Square square1 = new Square(4);

        Prism prism = new Prism( 7, square1);

        /*while(shouldContinue) {
            System.out.println("Wybierz figure:");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> triangle.addTriangle();
                case 2 -> square.addSquare();
                case 3 -> circle.addCircle();
                case 4 -> shouldContinue=false;
            }
        }*/

        System.out.println(prism.calculateArea());
        //triangle.print();
        //System.out.println(triangle.calculatePerimeter());
        //System.out.println(triangle.calculateArea());
    }
}
