package com.lms.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginUi extends JFrame {

    private JTextField username;
    private JTextField password;
    private JButton logbut;
    private JButton reset;
    private JPanel jpane;
    private JLabel bg;
    private JLabel intro;

    public loginUi() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,650);
        setVisible(true);
        setContentPane(jpane);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon(getClass().getResource("/login.jpg"));
        Image img = icon.getImage().getScaledInstance(450,600,Image.SCALE_SMOOTH);

        bg.setIcon(new ImageIcon(img));
        intro.setFont(new Font("Segoe UI", Font.BOLD, 25));

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username.setText("");
                password.setText("");
            }
        });


        logbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                username.setText("");
                password.setText("");
            }
        });

    }


    public static void main(String[] args) {
            new loginUi();

    }

    private void createUIComponents() {
        reset = new JButton("RESET");
        logbut = new JButton("LOGIN");
    }


}
