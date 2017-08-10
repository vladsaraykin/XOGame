package views;

import controllers.GameWindowController;
import model.Point;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {
        setSize(400, 300);
        setTitle("XO Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton jButton = new JButton();
                jButton.setText("  ");
                buttons[i][j] = jButton;
                jPanel.add(jButton);

                int finalJ = j;
                int finalI = i;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        System.out.printf("Button: %s, x: %d, y: %d %n", buttonText, finalJ, finalI);
                        GameWindowController.doShoot(new Point(finalI, finalJ));
                    }
                });
            }
        }
        add(jPanel);
        JPanel jPanelSouth = new JPanel();
        jPanelSouth.add(new JButton("New game"));

        add(jPanelSouth, BorderLayout.SOUTH);
        setVisible(true);

    }
}
