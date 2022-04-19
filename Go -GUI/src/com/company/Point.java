package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Point{
    float x;
    float y;
    Random r = new Random();

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public String toString(){
        return "x= " + x + ", y= " + y;
    }

    public static Point randomPoint(){
        float x = (float)Math.random()*10;
        float y= (float)Math.random()*10;
        Point zad1 = new Point(x,y);
        return zad1;
    }

    public void calcFunc(Point p1, Point p2, List w)
    {
        float a;
        float b;
        a = (p1.y-p2.y)/(p1.x-p2.x);
        b = p1.y - a*p1.x;
        w.add(a);
        w.add(b);
    }

    public static void whichSide(float x1, float y1, float x2, float y2, Point p3){
        float a,b,A,B,C;
        a = (y1-y2)/(x1-x2);
        b = y1 - a*x1;
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

    public static void whichSideToTriangle(float xP, float yP, float xQ, float yQ, float xR, float yR, Point p3)
    {
        float aPR,bPR,APR,BPR,CPR,aQR,bQR,APQ,BPQ,CPQ,aPQ,bPQ,AQR,BQR,CQR;

        aPR = (yP-yR)/(xP-xR);
        bPR = yP - aPR*xP;
        APR = -aPR;
        BPR = 1;
        CPR = -bPR;

        aPQ = (yP-yQ)/(xP-xQ);
        bPQ = yP - aPQ*xP;
        APQ = -aPQ;
        BPQ = 1;
        CPQ = -bPQ;

        aQR = (yQ-yR)/(xQ-xR);
        bQR = yQ - aQR*xQ;
        AQR = -aQR;
        BQR = 1;
        CQR = -bQR;

        if((AQR*xP+BQR*yP+CQR)*((AQR* p3.x+BQR*p3.y+CQR))>0 && (APR*xQ+BPR*yQ+CPR)*((APR* p3.x+BPR*p3.y+CPR))>0 && (APQ*xR+BPQ*yR+CPQ)*((APQ* p3.x+BPQ*p3.y+CPQ))>0)
        {
            System.out.println("Punkt leży wewnatrz trojkata!");
        }
        else if ((AQR*xP+BQR*yP+CQR)*((AQR* p3.x+BQR*p3.y+CQR))==0 || (APR*xQ+BPR*yQ+CPR)*((APR* p3.x+BPR*p3.y+CPR))==0 || (APQ*xR+BPQ*yR+CPQ)*((APQ* p3.x+BPQ*p3.y+CPQ))==0)
        {
            System.out.println("Punkt leży na trójkącie!");
        } else {
            System.out.println("Punkt leży poza trójkątem!");
        }
        
    }

    public static void cutEllipse(float x1, float y1, float x2, float y2, int r)
    {
        float a,b,c,D;
         a = x1*x1+ y1*y1 + x2*x2 + y2*y2 - 2*(x1*x2 + y1*y2);
         b = 2 * (0 + 0 + x1*x2 + y1*y2 - x2*x2 - y2*y2);
         c = -(r*r) + x2*x2 + y2*y2 +0 +0 - 2*0;

         D = b*b - 4*a*c;

         if(D>0){
             System.out.println("Dwa punkty przeciecia!");
         } else if(D == 0){
             System.out.println("Jeden punkt przeciecia!");
         } else {
             System.out.println("Nie ma punktów przecięcia!");
         }

    }

    public static boolean contains(ArrayList<Point> points, Point test){
        boolean result = false;
        int j,i;
        for (i = 0, j = points.size() - 1; i < points.size(); j = i++){
            if(((points.get(i)).getY() > test.getY()) != (points.get(j)).getY() > test.getY() &&
                    (test.getX() < ((points.get(j)).getX() - points.get(i).getX()) * (test.getY() - points.get(i).getY()) /
                            (points.get(j).getY() - points.get(i).getY()) + points.get(i).getX())){
                result = !result;
            }
        }
        return result;
    }


}
