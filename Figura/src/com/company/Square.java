package com.company;

import java.util.Scanner;

public class Square extends Figure implements Printable{
    private double a;
    private boolean shouldContinue = true;
    Scanner scanner = new Scanner(System.in);

    public Square() {
        this.a = a;
    }

    public Square(double a) {
        this.a = a;
    }

    void Data(){
        System.out.println("Wpisz dane kwadratu:");

        System.out.print("a: ");
        a = scanner.nextInt();
    }

    public void print() {
        System.out.println("Bok a: " + a);
    }

    public double calculateArea() {
        System.out.println("Pole: " + a*a);
        return a*a;
    }

    public double calculatePerimeter() {
        System.out.println("Obwód: " + 4*a);
        return 4*a;
    }

    public void addSquare(){
        while (shouldContinue) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Wpisz dane");
            System.out.println("2. Wyświetl dane");
            System.out.println("3. Wyjście");


            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    Data();
                    break;
                case 2:
                    print();
                    calculateArea();
                    calculatePerimeter();
                    break;
                case 3:
                    shouldContinue = false;
                    break;
            }
        }
    }
}
