import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField studentName;
    private JButton calculatButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtMarks4;
    private JTextField total;
    private JTextField avarage;
    private JTextField grade;
    private JPanel Main;
    private JTextField status;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1,m2,m3,m4,tot;
                double ava;
                m1 = Integer.parseInt(txtMarks1.getText());
                m2 = Integer.parseInt(txtMarks2.getText());
                m3 = Integer.parseInt(txtMarks3.getText());
                m4 = Integer.parseInt(txtMarks4.getText());
                tot = (m1+m2+m3+m4);
                total.setText(String.valueOf(tot));
                ava = (tot/4);
                avarage.setText(String.valueOf(ava));
                if(tot<=400 && tot>=300){
                    grade.setText(String.valueOf("A"));
                } else if (tot<=300 && tot>=200) {
                    grade.setText(String.valueOf("B"));
                } else if (tot<=200 && tot>=100) {
                    grade.setText(String.valueOf("C"));
                } else if (tot<=100 && tot>=50) {
                    grade.setText(String.valueOf("D"));
                } else {
                    grade.setText(String.valueOf("F"));
                }
                if(tot<50){
                    status.setText(String.valueOf("Fail"));
                } else {
                    status.setText(String.valueOf("Pass"));
                }
            }
        });
    }
}
