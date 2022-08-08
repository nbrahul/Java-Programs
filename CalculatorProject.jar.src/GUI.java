import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JTextField;
public class GUI implements ActionListener
{
    JPanel panel = new JPanel();
    JPanel panelnum=new JPanel();
    JPanel paneltrig=new JPanel();
    JTextField text=new JTextField();
    JFrame frame= new JFrame();
    JLabel labe=new JLabel();
    private JLabel statusLabel=new JLabel("",JLabel.CENTER);;

    JButton buttonadd=new JButton("+");
    JButton buttonsubtract=new JButton("-");
    JButton buttonmultiply=new JButton("x");
    JButton buttondivide=new JButton("/");
    JButton buttonxpower=new JButton("^");
    JButton buttonequals=new JButton("=");
    JButton reset=new JButton("re");
    JButton decimal=new JButton(".");
    JButton sin=new JButton("sin");
    JButton cosin=new JButton("cosin");
    JButton tan=new JButton("tan");
    JButton cosec=new JButton("cosec");
    JButton sec=new JButton("sec");
    JButton cot=new JButton("cot");

    JButton buttonzero=new JButton("0");
    JButton buttonone=new JButton("1");
    JButton buttontwo=new JButton("2");
    JButton buttonthree=new JButton("3");
    JButton buttonfour=new JButton("4");
    JButton buttonfive=new JButton("5");
    JButton buttonsix=new JButton("6");
    JButton buttonseven=new JButton("7");
    JButton buttoneight=new JButton("8");
    JButton buttonnine=new JButton("9");

    double y=0;
    double sum=0;
    double num=0;
    int whichval=0;
    double multy=1;
    double multsum=1;
    double multnum=1;
    double res=0;
    public void actionPerformed(ActionEvent e) {

    }

    public void actionPerformed() {
        buttonzero.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "0");

                }
            });
        buttonone.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "1");

                }
            });
        buttontwo.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "2");

                }
            });
        buttonthree.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "3");

                }
            });
        buttonfour.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "4");

                }
            });
        buttonfive.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "5");

                }
            });
        buttonsix.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "6");

                }
            });
        buttonseven.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "7");

                }
            });
        buttoneight.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "8");

                }
            });
        buttonnine.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = statusLabel.getText();

                    statusLabel.setText(text + "9");

                }
            });
        decimal.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    statusLabel.setText(text+".");
                }
            });

        buttonadd.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    String text=statusLabel.getText();
                    num=Double.parseDouble(text)+num;
                    statusLabel.setText("");
                    whichval=1;
                }
            });

        buttonsubtract.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text)-num;
                    statusLabel.setText("");
                    whichval=2;
                }
            });
        buttonmultiply.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    multnum=Double.parseDouble(text)*multnum;
                    statusLabel.setText("");
                    whichval=3;
                }
            });
        buttondivide.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    multnum=Double.parseDouble(text)/multnum;
                    statusLabel.setText("");
                    whichval=4;
                }
            });
        sin.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=5;
                }
            });
        cosin.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=6;
                }
            });
        cosec.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=7;
                }
            });
        cot.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=8;
                }
            });
        sec.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=9;
                }
            });
        tan.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=10;
                }
            });
            buttonxpower.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text=statusLabel.getText();
                    num=Double.parseDouble(text);
                    statusLabel.setText("");
                    whichval=11;
                }
            });

        buttonequals.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (whichval==1) {

                        String text=statusLabel.getText();
                        y=Double.parseDouble(text)+y;
                        sum=Calculator.add(num,y)+sum;
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                        y=0;
                        num=0;
                        sum=0;
                    }
                    if (whichval==2) {

                        String text=statusLabel.getText();
                        y=Double.parseDouble(text)-y;
                        sum=Calculator.subtract(num,y)+sum;
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                        y=0;
                        num=0;
                        sum=0;
                    }
                    if (whichval==3) {
                        String text=statusLabel.getText();
                        multy=Double.parseDouble(text)*multy;
                        multsum=Calculator.multiply(multnum,multy)*multsum;
                        String z=Double.toString(multsum);
                        statusLabel.setText(z);
                        multy=1;
                        multsum=1;
                        multnum=1;
                    }
                    if (whichval==4) {

                        String text=statusLabel.getText();
                        multy=Double.parseDouble(text)/multy;
                        multsum=Calculator.divide(multnum,multy)/multsum;
                        String z=Double.toString(multsum);
                        statusLabel.setText(z);
                        multy=1;
                        multsum=1;
                        multnum=1;
                    }
                    if(whichval==5) {
                        String text=statusLabel.getText();
                        sum=Calculator.sin(num);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    if(whichval==6) {
                        String text=statusLabel.getText();
                        sum=Calculator.cosin(num);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    if(whichval==7) {
                        String text=statusLabel.getText();
                        sum=Calculator.cosec(num);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    if(whichval==8) {
                        String text=statusLabel.getText();
                        sum=Calculator.cot(num);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    if(whichval==9) {
                        String text=statusLabel.getText();
                        sum=Calculator.sec(num);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    if(whichval==10) {
                        String text=statusLabel.getText();
                        sum=Calculator.tan(num);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    if(whichval==11) {
                        String text=statusLabel.getText();
                        y=Double.parseDouble(text);
                        
                        System.out.println("num"+num+"y"+y);
                        sum=Calculator.power(num,y);
                        String z=Double.toString(sum);
                        statusLabel.setText(z);
                    }
                    
                }
            });
        reset.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    y=0;
                    num=0;
                    sum=0;
                    statusLabel.setText("");

                }

            });

    }

    public GUI() {
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(buttonadd);
        panel.add(buttonsubtract);
        panel.add(buttonmultiply);
        panel.add(buttondivide);
        panel.add(buttonxpower);
        panel.add(statusLabel);
        panel.add(buttonequals);
        panel.add(reset);
        panel.add(decimal);
        
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        paneltrig.add(cosec);
        paneltrig.add(sec);
        paneltrig.add(cosin);
        paneltrig.add(cot);
        paneltrig.add(sin);
        paneltrig.add(tan);

        panelnum.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panelnum.setLayout(new GridLayout(0,1));
        panelnum.add(buttonzero);
        panelnum.add(buttonone);
        panelnum.add(buttontwo);
        panelnum.add(buttonthree);
        panelnum.add(buttonfour);
        panelnum.add(buttonfive);
        panelnum.add(buttonsix);
        panelnum.add(buttonseven);
        panelnum.add(buttoneight);
        panelnum.add(buttonnine);

        frame.add(panel, BorderLayout.WEST);
        frame.add(panelnum, BorderLayout.EAST);
        frame.add(paneltrig, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);

        statusLabel.setVisible(true);
    }

    public static void main(String [] args) {
        GUI g=new GUI();
        g.actionPerformed();
    }
}
