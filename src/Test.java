import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Test {

    JFrame f;
    Test(){
        f = new JFrame();
        JButton b = new JButton("Start");
        JButton c = new JButton("Exit");
        b.setBounds(140, 100, 100,40);
        c.setBounds(140, 200, 100, 40);

        f.add(b);
        f.add(c);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        Test t = new Test();
    }
}
