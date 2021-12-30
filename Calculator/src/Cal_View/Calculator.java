package Cal_View;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class Calculator extends JFrame{
    private JButton ACButton;
    private JButton OFFButton;
    private JButton button3;
    private JButton button4;
    private JButton a4Button1;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton xButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton button13;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton a0Button;
    private JButton button19;
    private JButton button20;
    private JTextArea textArea1;
    private JPanel as;
    private JTextPane textPane1;
    private String lastoperator = "+";
    private double solve = 0;
    private int er = 0;

    double lastnumber(String one){
        StringBuilder ans = new StringBuilder();
        int idx = one.length()-1;
        while(idx >= 0 && (Character.isDigit(one.charAt(idx)) || one.charAt(idx) == '.'))
        {
            ans.append(one.charAt(idx));
            idx--;
        }
        ans.reverse();
        double ax = 0;
        try{
            ax = Double.parseDouble(ans.toString());
            er = 0;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Warning: Error parsing your input");
            er = 1;
        }
        return ax;
    }

    Calculator(){
        textArea1.setSize(350,100);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(as);
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"1");
                textArea1.setText(textArea1.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"2");
                textArea1.setText(textArea1.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"3");
                textArea1.setText(textArea1.getText()+"3");
            }
        });
        a4Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"4");
                textArea1.setText(textArea1.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"5");
                textArea1.setText(textArea1.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"6");
                textArea1.setText(textArea1.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"7");
                textArea1.setText(textArea1.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"8");
                textArea1.setText(textArea1.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"9");
                textArea1.setText(textArea1.getText()+"9");
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText("");
                textArea1.setText("");
                lastoperator = "+";
                solve = 0;
            }
        });
        OFFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ap = textPane1.getText();
                if(ap.length() == 0){
                    return;
                }
                ap = ap.substring(0,ap.length()-1);
                textPane1.setText(ap);
                ap = textArea1.getText();
                if(ap.length() == 0){
                    return;
                }
                ap = ap.substring(0,ap.length()-1);
                textArea1.setText(ap);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lastnum = lastnumber(textArea1.getText());
                if(er == 1) { er = 0; return; }
                    if(lastoperator == "+"){
                        solve += lastnum;
                    }
                    if(lastoperator == "-"){
                        solve -= lastnum;
                    }
                    if(lastoperator == "*"){
                        solve *= lastnum;
                    }
                    if(lastoperator == "/"){
                        solve /= lastnum;
                    }
                    lastoperator = "/";
                    textArea1.setText(Double.toString(solve));
                textArea1.setText(Double.toString(solve)+"/");
                textPane1.setText(textPane1.getText()+"/");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lastnum = lastnumber(textArea1.getText());
                if(er == 1) { er = 0; return; }
                if(lastoperator == "+"){
                    solve += lastnum;
                }
                if(lastoperator == "-"){
                    solve -= lastnum;
                }
                if(lastoperator == "*"){
                    solve *= lastnum;
                }
                if(lastoperator == "/"){
                    solve /= lastnum;
                }
                lastoperator = "*";
                textArea1.setText(Double.toString(solve)+"*");
                textPane1.setText(textPane1.getText()+"*");
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lastnum = lastnumber(textArea1.getText());
                if(er == 1) { er = 0; return; }
                if(lastoperator == "+"){
                    solve += lastnum;
                }
                if(lastoperator == "-"){
                    solve -= lastnum;
                }
                if(lastoperator == "*"){
                    solve *= lastnum;
                }
                if(lastoperator == "/"){
                    solve /= lastnum;
                }
                lastoperator = "-";
                textArea1.setText(Double.toString(solve)+"-");
                textPane1.setText(textPane1.getText()+"-");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lastnum = lastnumber(textArea1.getText());
                if(er == 1) { er = 0; return; }
                if(lastoperator == "+"){
                    solve += lastnum;
                }
                if(lastoperator == "-"){
                    solve -= lastnum;
                }
                if(lastoperator == "*"){
                    solve *= lastnum;
                }
                if(lastoperator == "/"){
                    solve /= lastnum;
                }
                lastoperator = "+";
                textArea1.setText(Double.toString(solve)+"+");
                textPane1.setText(textPane1.getText()+"+");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+".");
                textArea1.setText(textArea1.getText()+".");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText()+"0");
                textPane1.setText(textPane1.getText()+"0");
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(textPane1.getText()+"00");
                textArea1.setText(textArea1.getText()+"00");
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lastnum = lastnumber(textArea1.getText());
                if(er == 1) { er = 0; return; }
                if(lastoperator == "+"){
                    solve += lastnum;
                }
                if(lastoperator == "-"){
                    solve -= lastnum;
                }
                if(lastoperator == "*"){
                    solve *= lastnum;
                }
                if(lastoperator == "/"){
                    solve /= lastnum;
                }
                lastoperator = "+";
                textArea1.setText(Double.toString(solve));
                solve = 0;
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
