package com.company;

import java.util.Scanner;

public class Circle extends Figure implements Printable{
    private double r;
    private boolean shouldContinue = true;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    Scanner scanner = new Scanner(System.in);

    void Data(){
        System.out.println("Wpisz dane Koła:");

        System.out.print("r: ");
        r = scanner.nextInt();
    }

    @Override
    public void print() {
        System.out.println("Promien: " + r);
    }

    @Override
    double calculateArea() {
        System.out.println("Pole:" + 3.14*r*r);
        return 3.14*r*r;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Obwód: " + 2*3.14*r);
        return 2*3.14*r;
    }


    public void addCircle() {
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



