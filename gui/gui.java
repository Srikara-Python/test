package gui;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.Border;

public class gui {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();

        JTextField t1;
        t1=new JTextField(String.valueOf(a));  
        t1.setBounds(50,100, 200,30);  


        ImageIcon image = new ImageIcon("download.png");
        Border border = BorderFactory.createLineBorder(Color.green,5);

        JLabel label = new JLabel();
        label.setText("Hello World!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(144,233,123));
        label.setFont(new Font("MV Boli",Font.PLAIN,30));
        label.setIconTextGap((-0));
        label.setBackground(Color.black);
        label.setOpaque((true));
        label.setBorder((border));
        label.setVerticalAlignment((JLabel.CENTER));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(250, 250, 250, 250);

        JLabel label2 = new JLabel();
        label2.setText(String.valueOf(a));
        label2.setForeground(new Color(144,233,123));
        label2.setFont(new Font("MV Boli",Font.PLAIN,35));
        label2.setBackground(Color.blue);
        label2.setOpaque((true));
        label2.setBorder((border));
        label2.setVerticalAlignment((JLabel.CENTER));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setBounds(250, 150, 250, 100);

        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hide/do nothing on close
        frame.setResizable(false);
        frame.setSize(700,600);
        frame.setLayout(null);
        frame.setVisible(true); // Makes frame visible
        ImageIcon logo = new ImageIcon("download.png");
        frame.setIconImage(logo.getImage());
       // frame.getContentPane().setBackground(Color.green);
       frame.getContentPane().setBackground(new Color(154, 156, 246));
        frame.add(label);
        frame.add(label2);
        frame.add(t1); 

    }
}