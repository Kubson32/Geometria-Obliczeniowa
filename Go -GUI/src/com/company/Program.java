package com.company;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Program extends JFrame {

    Random l = new Random();
    Random k = new Random();


    public Program(){
        setTitle("Układ współrzędnych");
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        g.drawLine(0,500,1000,500);
        g.drawLine(500,0,500,1000);
//         ZAD 1
        /*int x = l.nextInt(-10, 10);
        int y = k.nextInt(-10, 10);

        Point rand = new Point(x, y);
        System.out.println("losowy punkt: " + rand);
        g.drawLine(0, 600, 1000, 300);

        Point.whichSide(-10,-6,10,4,rand);*/

//         ZAD 2
    /*    int x1 = l.nextInt(-10, 10);
        int y1 = k.nextInt(-10, 10);
        int x2 = l.nextInt(-10, 10);
        int y2 = k.nextInt(-10, 10);
        int x3= l.nextInt(-10, 10);
        int y3 = k.nextInt(-10, 10);
        int r1 = k.nextInt(-10, 10);
        int r2 = k.nextInt(-10, 10);

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Point rand2 = new Point(0,0);
        System.out.println(rand2);

        g.drawPolygon(new int[]{500-(50*x1),500-(50*x2),500-(50*x3)},new int[]{500-(50*y1),500-(50*y2),500-(50*y3)},3);

        Point.whichSideToTriangle(x1,y1,x2,y2,x3,y3,rand2);
    */         //ZAD 3








        //               ZAD 4

        int r = l.nextInt(1,10);
        int x1 = l.nextInt(-10, 10);
        int y1 = k.nextInt(-10, 10);
        int x2 = l.nextInt(-10, 10);
        int y2 = k.nextInt(-10, 10);

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("r = 2,5");
        g.drawOval(375, 375, 250, 250);
        g.drawLine(500+(x1*50),500-(y1*50),500+(x2*50),500-(y2*50));
        Point.cutEllipse(x1,y1,x2,y2,r);

    }








}
