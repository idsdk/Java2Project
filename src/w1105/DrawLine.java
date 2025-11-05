package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawLine extends JFrame {
    public int x1, y1, x2, y2;
    DrawPanel dp = new DrawPanel(Color.white);

    public DrawLine() {
        dp.addMouseListener(mouseListener);
        add(dp);

        setTitle("마우스로 선그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawLine();
    }

    MouseAdapter mouseListener = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            dp.repaint();
        }
    };



    class DrawPanel extends JPanel {
        DrawPanel(Color color) {
            setBackground(color);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
