package Coversor.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        //JPanel = a gui component that functions as a container to hold other components
        // Select converter option panel, and for input value.
        JPanel selectConverterPanel = new JPanel();
        selectConverterPanel.setBackground(Color.red);
        selectConverterPanel.setBounds(0,0,200,350);

        // Select option of converter (for example currency to currency )
        JPanel selectConversionPanel = new JPanel();
        selectConversionPanel.setBackground(Color.blue);
        selectConversionPanel.setBounds(500,0,100,300);

        // Select option of converter (for example currency to currency )
        JPanel resultPanel = new JPanel();
        resultPanel.setBackground(Color.green);
        resultPanel.setBounds(500,200,300,100);

        // JLabel = a gui display-area for a string of text, an image or both
        ImageIcon image = new ImageIcon("logo.png"); // create an image icon
        ImageIcon logo = new ImageIcon("logo.png"); // create an image icon
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Alura Conversor"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center , right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center , bottom of imageicon
        label.setForeground(new Color(0xFFABA8C9, true)); // set fontcolor of text
        label.setFont(new Font("Arvo", Font.PLAIN,20)); // set font of txt
        label.setIconTextGap(-15);
        label.setBackground(Color.black); // set background color but need the next method
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setBounds(0,100,250,250); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false); // prevent frame from being resize
        frame.setSize(850,700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setIconImage(logo.getImage()); // change icon of frame
        // frame.getContentPane().setBackground(new Color(8,0,6));
        frame.add(label);
        frame.add(selectConverterPanel);
        frame.add(selectConversionPanel);
        // frame.pack(); // adjust size of the elements that we have, acomodate the size. packs goes after the adds.

    }

}
