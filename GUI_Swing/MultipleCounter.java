package GUI_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleCounter {
    JFrame f;
    JTextField tf;
    JButton cnt, rst;
    public MultipleCounter(){
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        f.add(tf);
        tf.setText("0");
        cnt = new JButton("Count");
        f.add(cnt);
        rst = new JButton("Reset");
        f.add(rst);

        cnt.addActionListener(new CounterAction1());
        rst.addActionListener(new CounterAction1());

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MultipleCounter();
    }
    public class CounterAction1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton j = (JButton) e.getSource();
            if (j == cnt) {
                String s = tf.getText();
                int a = Integer.parseInt(s);
                a = a + 1;
                s = a + "";
                tf.setText(s);
            }
            if (j == rst) {
                tf.setText("0");
            }
            System.out.println(e.getActionCommand());
        }
    }
//    public class CounterAction2 implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            tf.setText("0");
//            System.out.println(e.getActionCommand());
//        }
//    }
}
