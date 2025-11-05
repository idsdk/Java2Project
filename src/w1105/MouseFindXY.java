package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.MouseAdapter;

public class MouseFindXY extends JFrame {
    public MouseFindXY() {
        addMouseListener(mouseListener);
        setTitle("MouseEventTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);

    }
    MouseAdapter mouseListener = new MouseAdapter() {

    };

    public static void main(String[] args) {

        new MouseFindXY();
    }

}

