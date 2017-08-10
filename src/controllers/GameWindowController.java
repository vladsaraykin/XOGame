package controllers;

import model.User;
import model.Point;
import java.awt.*;

public class GameWindowController {
    public static void doShoot(Point point) {
        User.point = point;
        User.isShoot = true;
    }
}
