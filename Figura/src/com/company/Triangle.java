package com.company;

import java.util.Scanner;

public class Triangle extends Figure implements Printable{
    double a;
    double b;
    double c;
    double h;

    Scanner scanner = new Scanner(System.in);
    private boolean shouldContinue = true;


    public Triangle() {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    void Data(){
        System.out.println("Wpisz dane trójkąta:");

        System.out.print("a: ");
        a = scanner.nextInt();

        System.out.print("b: ");
        b = scanner.nextInt();

        System.out.print("c: ");
        c= scanner.nextInt();

        System.out.print("h: ");
        h = scanner.nextInt();
    }

    @Override
    public void print() {
        System.out.println("Bok a: " + a + ", bok b: " + b + ", bok c: " + c + ", wysokosc: " + h);
    }

    @Override
    public double calculateArea() {
        System.out.println("Pole: " + 0.5*a*h);
        return 0.5*a*h;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód: " + (a+b+c));
        return a + b + c;
    }

    public void addTriangle() {

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
