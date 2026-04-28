import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t = new JTextField();
    String n1="", op="";

    Calculator() {
        setLayout(new BorderLayout());
        add(t, BorderLayout.NORTH);

        JPanel p = new JPanel(new GridLayout(4,4));
        String b[]={"7","8","9","/","4","5","6","*","1","2","3","-","0","C","=","+"};

        for(String s:b){
            JButton btn=new JButton(s);
            btn.addActionListener(this);
            p.add(btn);
            btn.getColorModel();
        }

        add(p);
        setSize(250,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();

        if(s.matches("[0-9]")) t.setText(t.getText()+s);

       else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            n1=t.getText(); op=s; t.setText("");
        }

        else if(s.equals("=")){
            double a=Double.parseDouble(n1);
            double b=Double.parseDouble(t.getText());
            double r=0;

            if(op.equals("+")) r=a+b;
            if(op.equals("-")) r=a-b;
            if(op.equals("*")) r=a*b;
            if(op.equals("/")) r=a/b;

            t.setText(""+r);
        }

        else if(s.equals("C")) t.setText("");
    }

    public static void main(String[] args) {
        new Calculator();
    }
}