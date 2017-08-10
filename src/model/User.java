package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Vladislav on 10.07.2017.
 */
public class User implements Shootable {
    public volatile static boolean isShoot;
    public static Point point;


    @Override
    public Point getShoot() {
        isShoot = false;
        while (!isShoot) ; // todo wait
        return point;
    }
}
