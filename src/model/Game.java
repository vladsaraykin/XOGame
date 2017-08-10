package model;

/**
 * Created by Vladislav on 10.07.2017.
 */
public class Game {
    private static Game instance;
    private User user = new User();
    private Computer computer = new Computer();
    private Field field = new Field();


    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {

    }


    public void start() {
//        boolean result = false;
        field.showField();
        while (field.isNotGameOver() == Field.TypeField.NOT_SET) {
            field.doShoot(user.getShoot(), Field.TypeField.X);
            field.showField();
            if (field.isNotGameOver() == Field.TypeField.X){
                System.out.println("Игрок, игравший за " + Field.TypeField.X + " победил");
                break;
            }

            field.doShoot(computer.getShoot(), Field.TypeField.O);
            field.showField();
            if(field.isNotGameOver() == Field.TypeField.O){
                System.out.println("Игрок, игравший за " + Field.TypeField.O + " победил");
                break;
            }

        }

    }
}
