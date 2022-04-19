package com.company;

import java.util.ArrayList;
import java.util.List;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "x= " + x + ", y= " + y;
    }
}
