package Bank.mangment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2 ,m1,m2,m3;
    JButton next;
    JTextField textName,textFName,textEmail,textAdd,textCity,textPin,textstate;
    JDateChooser dateChooser;




    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;

    String first=" "+ Math.abs(first4);
    signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("raleway",Font.BOLD,38));
        add(label1);
        JLabel label2=new JLabel("page 1");
        label2.setFont(new Font("raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);


        JLabel label3=new JLabel("personal Details");
        label3.setFont(new Font("raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);


        JLabel labelName=new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);


        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        JLabel labelfName=new JLabel(" Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);


        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);


        JLabel DOB=new JLabel(" Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(225,225,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(225,225,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel labelEmail=new JLabel("Email :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);



        JLabel labelMs=new JLabel("Martial Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,30));
        labelMs.setBounds(100,440,300,30);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);


        m3=new JRadioButton("other");
        m3.setBounds(635,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,30));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);




        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,30));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);



        JLabel labelPin=new JLabel("PIN :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,30));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelstate=new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,30));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);


        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String martial1 = null;
        if (m1.isSelected()) {
            martial1 = "married";
        } else if (m2.isSelected()) {
            martial1 = "unmarried";
        } else if (m3.isSelected()) {
            martial1 = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textstate.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                JOptionPane.showMessageDialog(null, "Please enter a valid email address");
            } else if (!pincode.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "PIN must be a numeric value");
            } else {
                Con con1 = new Con();
                String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + martial1 + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new signup2(first);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }



    public static void main(String args[]){
    new signup();

}
}
