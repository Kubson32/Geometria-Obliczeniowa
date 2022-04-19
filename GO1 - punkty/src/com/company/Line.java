package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.*;

public class Line extends Point{
    final double piConst = 3.1415926535897932383279502884;
    List w = new ArrayList<>();
    private Point head = new Point();
    private Point tail = new Point();

    public Line(Point head, Point tail) {
        this.head = head;
        this.tail = tail;
    }

    public String functionY(){
        int a;
        int b;
        a = (head.y-tail.y)/(head.x-tail.x);
        b = head.y - a*head.x;
        String k =  "y= " + a + "*x + " + b;
        return k;
    }

    public String toString(){
        return "head: (" + head + "), tail: (" + tail + ")";
    }

    public String membership() {
        int a;
        int b;
        a = (head.y-tail.y)/(head.x-tail.x);
        b = head.y - a*head.x;
        x = ThreadLocalRandom.current().nextInt(0,100);
        y = ThreadLocalRandom.current().nextInt(0,100);

        Point rand = new Point(x, y);

        System.out.println("losowy punkt: " + rand);

        if(y==a*x + b && head.x<=x && x<=tail.x && head.y<=y && y<=tail.y){
            System.out.println("Punkt należy do prostej i odcinka");
        } else if (y==a*x + b){
            System.out.println("Punkt należy do prostej");
        }else {
            System.out.println("Punkt nie należy do prostej");
        }
        return " ";
    }

    Point vec = new Point(x,y);

    public String vector(Point vec){
        head.x += vec.x;
        head.y += vec.y;
        tail.x += vec.x;
        tail.y += vec.y;
        return "Po translakcji: ";
    }

    public String rotation(double degree){
        System.out.println("Po rotacji: ");
        Line a = new Line(new Point(head.x, head.y), new Point((int) (head.x*cos(degree*piConst/180)- head.y*sin(degree*piConst/180)), (int) (head.y*cos(degree*piConst/180)+head.x*sin(degree*piConst/180))));
        return a.toString();
    }

    public String ReflectionOX(){
        System.out.println("Odbicie względem osi OX:");
        Line a=new Line(new Point(head.x,-head.y),new Point(tail.x,-tail.y));
        return a.toString();
    }

    public String ReflectionOY(){
        System.out.println("Odbicie względem osi OY:");
        Line a=new Line(new Point(-head.x,head.y),new Point(-tail.x,tail.y));
        return a.toString();
    }

    public void calcFunc(Point p1, Point p2, List w)
    {
        int a;
        int b;
        a = (p1.y-p2.y)/(p1.x-p2.x);
        b = p1.y - a*p1.x;
        w.add(a);
        w.add(b);
    }

    public void whichSide(Line l1, Point p3)
    {
        double a,b,A,B,C;
        a = (head.y-tail.y)/(head.x-tail.x);
        b = head.y - a*head.x;
        A = -a;
        B = 1;
        C = -b;

        if((A*p3.x+B*p3.y+C)<0){
            System.out.println("Punkt jest z lewej strony!");
        } else if(A*p3.x+B*p3.y+C>0) {
            System.out.println("Punkt jest z prawej strony!");
        } else {
            System.out.println("Punkt jest na prostej!");
        }
    }

    public void crossingPointCramer(double A1, double B1, double C1, double A2, double B2, double C2)
    {
        double W, WX, WY, x, y;

        W = (A1*B2)-(B1*A2);
        WX = ((-C1)*B2)-(B1*(-C2));
        WY = (A1*(-C2)-((-C1)*(A2)));

        x=WX/W;
        y=WY/W;

        System.out.println("Punkt przecięcia: (" + x + "," + y + ")");
    }

    double fieldTriangle(Point p1, Point p2, Point p3){
        double aA, bA, aB, bB;

        return abs(0.5 * ((p2.getX()-p1.getX())-(p3.getY()-p1.getY())-((p3.getX()-p1.getX())*(p2.getY()-p1.getY()))));
    }
}
