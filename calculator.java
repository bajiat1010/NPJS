import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener {
    JButton b10, b11, b12, b13, b14, b15, b16, b17;
    JButton b[] = new JButton[10];
    int i, r, n1, n2;
    JTextField res;
    char op;

    public calculator() {
        super("Calculator");
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4)); 
        Font buttonFont = new Font("Arial", Font.PLAIN, 16); // Define the button font
        
        for (int i = 0; i <= 9; i++) {
            b[i] = new JButton(i + "");
            b[i].setFont(buttonFont); // Set font for each button
            p.add(b[i]);
            b[i].addActionListener(this);
        }
        b10 = new JButton("+");
        b10.setFont(buttonFont); // Set font for the button
        p.add(b10);
        b10.addActionListener(this);
        
        b11 = new JButton("-");
        b11.setFont(buttonFont);
        p.add(b11);
        b11.addActionListener(this);
        
        b12 = new JButton("*");
        b12.setFont(buttonFont);
        p.add(b12);
        b12.addActionListener(this);
        
        b13 = new JButton("/");
        b13.setFont(buttonFont);
        p.add(b13);
        b13.addActionListener(this);
        
        b14 = new JButton("=");
        b14.setFont(buttonFont);
        p.add(b14);
        b14.addActionListener(this);
        
        b15 = new JButton("C");
        b15.setFont(buttonFont);
        p.add(b15);
        b15.addActionListener(this);
        
        b16 = new JButton("%");
        b16.setFont(buttonFont);
        p.add(b16);
        b16.addActionListener(this);
        
        b17 = new JButton("!");
        b17.setFont(buttonFont);
        p.add(b17);
        b17.addActionListener(this);
        
        res = new JTextField(10);
        add(p, BorderLayout.CENTER);
        add(res, BorderLayout.NORTH);
        setVisible(true);
        setSize(200, 250); 
    }

    public void actionPerformed(ActionEvent ae) {
        JButton pb = (JButton) ae.getSource();
        if (pb == b15) {
            r = n1 = n2 = 0;
            res.setText("");
        } else if (pb == b14) {
            n2 = Integer.parseInt(res.getText());
            eval();
            res.setText("" + r);
        } else if (pb == b16) { 
            op = '%';
            n1 = Integer.parseInt(res.getText());
            res.setText("");
        } else if (pb == b17) {
            n1 = Integer.parseInt(res.getText());
            int fact = 1;
            for (int i = 1; i <= n1; i++) {
                fact *= i;
            }
            res.setText(Integer.toString(fact));
        } else {
            boolean opf = false;
            if (pb == b10) {
                op = '+';
                opf = true;
            }
            if (pb == b11) {
                op = '-';
                opf = true;
            }
            if (pb == b12) {
                op = '*';
                opf = true;
            }
            if (pb == b13) {
                op = '/';
                opf = true;
            }
            if (opf == false) {
                for (i = 0; i < 10; i++) {
                    if (pb == b[i]) {
                        String t = res.getText();
                        t += i;
                        res.setText(t);
                    }
                }
            } else {
                n1 = Integer.parseInt(res.getText());
                res.setText("");
            }
        }
    }

    int eval() {
        switch (op) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                r = n1 / n2;
                break;
            case '%':
                r = n1 % n2; 
                break;
        }
        return 0;
    }

    public static void main(String arg[]) {
        new calculator();
    }
}




// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;

// public class calculator extends JFrame implements ActionListener {
//     JButton b10, b11, b12, b13, b14, b15;
//     JButton b[] = new JButton[10];
//     int i, r, n1, n2;
//     JTextField res;
//     char op;

//     public calculator() {
//         super("Calulator");
//         setLayout(new BorderLayout());
//         JPanel p = new JPanel();
//         p.setLayout(new GridLayout(4, 4));
//         for (int i = 0; i <= 9; i++) {
//             b[i] = new JButton(i + "");
//             p.add(b[i]);
//             b[i].addActionListener(this);
//         }
//         b10 = new JButton("+");
//         p.add(b10);
//         b10.addActionListener(this);
//         b11 = new JButton("-");
//         p.add(b11);
//         b11.addActionListener(this);
//         b12 = new JButton("*");
//         p.add(b12);
//         b12.addActionListener(this);
//         b13 = new JButton("/");
//         p.add(b13);
//         b13.addActionListener(this);
//         b14 = new JButton("=");
//         p.add(b14);
//         b14.addActionListener(this);
//         b15 = new JButton("C");
//         p.add(b15);
//         b15.addActionListener(this);
//         res = new JTextField(10);
//         add(p, BorderLayout.CENTER);
//         add(res, BorderLayout.NORTH);
//         setVisible(true);
//         setSize(200, 200);
//     }

//     public void actionPerformed(ActionEvent ae) {
//         JButton pb = (JButton) ae.getSource();
//         if (pb == b15) {
//             r = n1 = n2 = 0;
//             res.setText("");
//         } else if (pb == b14) {
//             n2 = Integer.parseInt(res.getText());
//             eval();
//             res.setText("" + r);
//         } else {
//             boolean opf = false;
//             if (pb == b10) {
//                 op = '+';
//                 opf = true;
//             }
//             if (pb == b11) {
//                 op = '-';
//                 opf = true;
//             }
//             if (pb == b12) {
//                 op = '*';
//                 opf = true;
//             }
//             if (pb == b13) {
//                 op = '/';
//                 opf = true;
//             }
//             if (opf == false) {
//                 for (i = 0; i < 10; i++) {
//                     if (pb == b[i]) {
//                         String t = res.getText();
//                         t += i;
//                         res.setText(t);
//                     }
//                 }
//             } else {
//                 n1 = Integer.parseInt(res.getText());
//                 res.setText("");
//             }
//         }
//     }

//     int eval() {
//         switch (op) {
//             case '+':
//                 r = n1 + n2;
//                 break;
//             case '-':
//                 r = n1 - n2;
//                 break;
//             case '*':
//                 r = n1 * n2;
//                 break;
//             case '/':
//                 r = n1 / n2;
//                 break;
//         }
//         return 0;
//     }

//     public static void main(String arg[]) {
//         new calculator();
//     }
// }
