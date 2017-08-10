package model;

import java.util.ArrayList;

/**
 * Created by Vladislav on 10.07.2017.
 */
public class Field {
    private static final int SIZE = 3;
    private TypeField[][] field;

//    private boolean trigger = true;


    public Field() {
        field = new TypeField[SIZE][SIZE];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = TypeField.NOT_SET;
            }
        }
    }


    public void doShoot(Point p, TypeField type) {
        if (field[p.getX()][p.getY()] == TypeField.NOT_SET) {
            field[p.getX()][p.getY()] = type;
        }

    }


//    public ArrayList<Point> getNotSetPoints() {
//        ArrayList<Point> points = new ArrayList<>();
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field.length; j++) {
//                if (field[i][j] == TypeField.NOT_SET) {
//
//                    points.add(new Point(i, j));
//                }
//            }
//        }
//        return points;
//    }

    public TypeField isNotGameOver() {

        int result = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 1; j < field.length; j++) {
                if (field[i][j] != TypeField.NOT_SET && field[i][0] == field[i][j]) {
                    result++;
                    if (result == field.length) {
                        return field[i][j];
                    }
                } else {
                    result = 1;
                    break;
                }

            }
        }
        result = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 1; j < field.length; j++) {
                if (field[0][i] != TypeField.NOT_SET && field[0][i] == field[j][i]) {
                    result++;
                    if (result == field.length) {
                        return field[j][i];
                    }
                } else {
                    result = 1;
                    break;
                }
            }
        }
        result = 1;

    


        return TypeField.NOT_SET;
    }



    public void showField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public enum TypeField {
        X, O, NOT_SET
    }


}