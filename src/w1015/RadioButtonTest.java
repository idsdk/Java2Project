package w1015;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonTest extends JFrame {
    String[] rbstrArr = {"우치하 사스케", "우치하 시스이", "우치하 이타치"};
    String[] imgNameArr ={"사스케", "시스이", "이타치"};
    JRadioButton[] rbArr = new JRadioButton[rbstrArr.length];
    JLabel lbl = new JLabel("", JLabel.CENTER);

    public RadioButtonTest() {
        JPanel panel = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        int i=0;
        for(String str : rbstrArr) {
            rbArr[i] = new JRadioButton(str);
            rbArr[i].addActionListener(radioListener);
            bg.add(rbArr[i]);
            panel.add(rbArr[i]);
            i++;
        }
        lbl.setOpaque(true);
        lbl.setBackground(Color.PINK);
        add(panel, "North");
        add(lbl, "Center");

        setTitle("RadioButtonTest");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        JFrame이 모니터 화면에 정중앙에 오도록 한다.
        CenterFrame cf = new CenterFrame(500, 300);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener radioListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int i=0;

            for (JRadioButton rb : rbArr) {
                if (rb.isSelected()) {
                    ImageIcon imageIcon = new ImageIcon("D:/Java2Projects/untitled/src/w1015/imgs/" + imgNameArr[i] + ".jpg");
                    lbl.setIcon(imageIcon);
                    JOptionPane.showMessageDialog(null, rb.getText()+"가 선택되었습니다.");
                }
                i++;
            }
        }
    };

    public static void main(String[] args) {
        new RadioButtonTest();
    }
}
