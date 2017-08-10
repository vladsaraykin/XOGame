package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Vladislav on 11.07.2017.
 */
public class Computer implements Shootable {


    @Override
    public Point getShoot() {
        return Point.getRandomPoint();
    }
}
