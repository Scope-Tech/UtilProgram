package io.github.scopetech.utilprogram.gui;

import javax.swing.*;
import java.awt.*;

public class UPFrame extends JFrame {

    public UPFrame(JLabel jLabel, JButton jButton) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(600, 300, 500, 400);
        this.setTitle("Scope-Tech's UtilProgram");
        this.getContentPane().add(new UPLeftPanel(jLabel), BorderLayout.WEST);
        this.getContentPane().add(new UPBottomPanel(jButton), BorderLayout.SOUTH);
        this.setVisible(true);
    }

}
