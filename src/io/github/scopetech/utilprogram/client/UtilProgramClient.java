package io.github.scopetech.utilprogram.client;

import io.github.scopetech.utilprogram.gui.UPFrame;
import sun.awt.OSInfo;

import javax.swing.*;
import java.util.Calendar;

public class UtilProgramClient {

    final String os = "操作系统：";
    final String date = "日期：";

    String varOs = os;
    String varDate = date;

    JLabel label = new JLabel(
            "<html><body>" + varOs + "<br>" + varDate + "</body></html>"
    );

    public UtilProgramClient() throws InterruptedException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        JButton button = new JButton("更新信息");
        button.addActionListener(e -> {
            varOs = os + OSInfo.getOSType();
            varDate = date
            + Calendar.getInstance().get(Calendar.YEAR) + "年"
            + Calendar.getInstance().get(Calendar.MONTH) + "月"
            + Calendar.getInstance().get(Calendar.DATE) + "日"
            + Calendar.getInstance().get(Calendar.HOUR) + "时"
            + Calendar.getInstance().get(Calendar.MINUTE) + "分"
            + Calendar.getInstance().get(Calendar.SECOND) + "秒";
            label.setText("<html><body>" + varOs + "<br>" + varDate + "</body></html>");
        });
        varOs = os + OSInfo.getOSType();
        varDate = date
                + Calendar.getInstance().get(Calendar.YEAR) + "年"
                + Calendar.getInstance().get(Calendar.MONTH) + "月"
                + Calendar.getInstance().get(Calendar.DATE) + "日"
                + Calendar.getInstance().get(Calendar.HOUR) + "时"
                + Calendar.getInstance().get(Calendar.MINUTE) + "分"
                + Calendar.getInstance().get(Calendar.SECOND) + "秒";
        label.setText("<html><body>" + varOs + "<br>" + varDate + "</body></html>");
        new UPFrame(label, button);
        while (true) {
            varOs = os + OSInfo.getOSType();
            varDate = date
                    + Calendar.getInstance().get(Calendar.YEAR) + "年"
                    + Calendar.getInstance().get(Calendar.MONTH) + "月"
                    + Calendar.getInstance().get(Calendar.DATE) + "日"
                    + Calendar.getInstance().get(Calendar.HOUR) + "时"
                    + Calendar.getInstance().get(Calendar.MINUTE) + "分"
                    + Calendar.getInstance().get(Calendar.SECOND) + "秒";
            label.setText("<html><body>" + varOs + "<br>" + varDate + "</body></html>");
            Thread.sleep(1);
        }
    }

}
