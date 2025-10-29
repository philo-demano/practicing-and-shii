import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener{
    //create Frame
    static JFrame f; 

    //create Textfeld,
    static JTextField l;
    
    //store operator and operands
    String s0;
    String s1;
    String s2;

    //default constructor
    Calculator(){
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args){
        //create a new Frame
        f = new JFrame("Calculator");

        try{
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            System.err.println(e.getMessage());
        }

        Calculator c = new Calculator();
        l = new JTextField();
        l.setEditable(false);             // darf nicht vom User geändert werden

        //buttons for calculator
        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdiv,bmul,beq,bcl,bp;

        //number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        //Operator Buttons
        bdiv = new JButton("/");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bcl = new JButton("C");
        bp = new JButton(".");
        beq = new JButton("=");
        
        JPanel p = new JPanel();

        //add to actionlistener
        bmul.addActionListener(c);
        badd.addActionListener(c);
        bsub.addActionListener(c);
        bdiv.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        bp.addActionListener(c);
        beq.addActionListener(c);
        bcl.addActionListener(c);

        //add to panel
        p.add(badd);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bsub);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bmul);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bdiv);
        p.add(beq);
        p.add(b0);
        p.add(beq);
        p.add(bp);

        p.setBackground(Color.blue);

        f.add(l, BorderLayout.NORTH);       //add Text field to frame
        f.add(p, BorderLayout.CENTER);     //add panel to frame
        f.setSize(200,220);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        if((s.charAt(0) == '.')||(s.charAt(0) <= '9' && s.charAt(0) >= '0')){   //for no input
            if(!s.equals("")){    
                s2 = s2 + s;
            }else {
                s0 = s0 + s;
            }

            l.setText(s0 + s1 + s2);
        }else if(s.charAt(0) == 'C'){     //to clear 
            s0 = s1 = s2 = "";
            l.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '='){   // for equals
            double te = 0; // value for answer

            switch(s1){
                case "+" -> te = Double.parseDouble(s0) + Double.parseDouble(s2);
                case "-" -> te = Double.parseDouble(s0) - Double.parseDouble(s2);
                case "/" -> te = Double.parseDouble(s0) / Double.parseDouble(s2);
                case "*" -> te = Double.parseDouble(s0) * Double.parseDouble(s2);
                default -> System.out.println("No operator given");
            }

            l.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        }else{
            if(s1.equals("") || s2.equals("")){
                s1 = s;
            } else {
                double te = 0; // value for answer

                switch(s1){
                    case "+" -> te = Double.parseDouble(s0) + Double.parseDouble(s2);
                    case "-" -> te = Double.parseDouble(s0) - Double.parseDouble(s2);
                    case "/" -> te = Double.parseDouble(s0) / Double.parseDouble(s2);
                    case "*" -> te = Double.parseDouble(s0) * Double.parseDouble(s2);
                        default -> System.out.println("No operator given");
                }

                s0 = Double.toString(te);
                s1 = s;     //place the operator
                s2 = "";   //make operand blank
            }

            l.setText(s0 + s1 + s2);
        }
    }
}
