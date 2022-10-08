package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(400, 400));
        JButton button = new JButton("Press");
        JButton button2 = new JButton("Count");
        JLabel label = new JLabel("Hi from label", JLabel.CENTER);
        panel.add(label);

        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
