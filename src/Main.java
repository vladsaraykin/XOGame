import model.Game;
import views.GameWindow;

import static javax.swing.LayoutStyle.getInstance;

/**
 * Created by Vladislav on 10.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();
        Game game = Game.getInstance();
        game.start();




    }


}
