package com.company;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List wsp = new ArrayList<>();

        System.out.println("Podaj współrzędne punktów p1 i p2:");
        Point p1 = new Point(-10,0);
        Point p2 = new Point(10,0);
        Point p3 = new Point(5,5);
        Point p4 = new Point(5,6);
        Point p5 = new Point();
        Line line = new Line(p1, p2);
        Line line1 = new Line(p1,p2);

        System.out.println("Punkty p1, p2, p3: ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        //System.out.println("Funkcja: " + line.functionY());

        //System.out.println(line.membership());

        //System.out.println("Podaj współrzędne wektora x i y: ");
        //int v1 = scanner.nextInt();
        //int v2 = scanner.nextInt();
        //Point vector = new Point(v1, v2);
        //System.out.println(line.vector(vector));
        //System.out.println(line);

        //System.out.println("Podaj stopnie do rotacji punktu: ");
        //double degree = scanner.nextInt();
        //System.out.println(line1.rotation(degree));

        //System.out.println(line1.ReflectionOX());
        //System.out.println(line1.ReflectionOY());

        //line1.calcFunc(p1, p2, wsp);
        //line1.calcFunc(p3,p4,wsp);
        //System.out.println("Lista współczynników: " + wsp);

        line1.whichSide(line1, p3);

      /*  System.out.println("Podaj współczynniki A1, B1, C1 pierwszej linii:");
        double A1 = scanner.nextDouble();
        double B1 = scanner.nextDouble();
        double C1 = scanner.nextDouble();
        System.out.println("Podaj współczynniki A2, B2, C2 drugiej linii:");
        double A2 = scanner.nextDouble();
        double B2 = scanner.nextDouble();
        double C2 = scanner.nextDouble();
        line1.crossingPointCramer(A1, B1, C1, A2, B2, C2);*/

        //System.out.println("Pole trójkąta dla punktów p1, p2, p3 wynosi: " + line.fieldTriangle(p1, p2, p3));
    }
}
