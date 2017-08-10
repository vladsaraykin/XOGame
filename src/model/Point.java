package model;

import java.util.Random;

/**
 * Created by Vladislav on 11.07.2017.
 */
public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point) obj;
        if (this.x == point.x && this.y == point.y) {
            return true;
        }
        return false;
    }

    public Point() {}


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Point getRandomPoint() {
        return new Point(new Random().nextInt(3), new Random().nextInt(3));
    }
}
