package Coversor.ui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Converter Agustin Rojas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, by default its running it background.
        this.setResizable(false); // prevent frame from being resize
        this.setSize(420,420); // sets the x-dimension, and 7-dimension of frame
        this.setVisible(true); // make frame visible
        ImageIcon logo = new ImageIcon("logo.png"); // create an image icon
        this.setIconImage(logo.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(12,100,10));
    }
}
