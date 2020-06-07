package io.github.scopetech.utilprogram.gui;

import javax.swing.*;

public class UPBottomPanel extends JPanel {

    public UPBottomPanel(JButton jButton) {
        this.add(jButton);
        this.add(new JLabel("© 2020 Scope Technology Inc."));
    }

}
