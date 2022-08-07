package fileCreation;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CreatJFrame {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("player-icon-18.png");// creat icon
        Border border= BorderFactory.createLineBorder(Color.green,3);
        ImageIcon image1 = new ImageIcon("Music-PNG-Photos");
        JLabel label = new JLabel("Welcome Player 1.0");

        label.setIcon(image);

        label.setVisible(true);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(-35);
        label.setBackground(Color.black);
       // label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial", 1, 50));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame("PLAYER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        frame.setResizable(true);
        // frame.setSize(600,600);
        frame.add(label);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        frame.pack();
        // frame.getContentPane().setBackground(new Color(50,200,200));


    }
}