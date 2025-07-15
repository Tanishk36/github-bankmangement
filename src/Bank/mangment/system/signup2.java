package Bank.mangment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, r3, r4;
    JButton next;
    String formno;

    signup2(String first) {
        super("APPLICATION FORM");

        getContentPane().setBackground(new Color(252, 208, 76));
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = first;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 120, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 160, 600, 40);
        add(l2);

        // Religion Label and ComboBox
        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 220, 100, 30);
        add(l3);
        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 220, 320, 30);
        add(comboBox);

        // Category Label and ComboBox
        JLabel l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 270, 100, 30);
        add(l4);
        String Category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 270, 320, 30);
        add(comboBox2);

        // Income Label and ComboBox
        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 320, 100, 30);
        add(l5);
        String Income[] = {"NULL", "<1,50,000", "<2,50,000", "5,00,000", "upto 10,00,000", "above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 320, 320, 30);
        add(comboBox3);

        // Educational Label and ComboBox
        JLabel l6 = new JLabel("Educational:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 370, 150, 30);
        add(l6);
        String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 370, 320, 30);
        add(comboBox4);

        // Occupation Label and ComboBox
        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 420, 150, 30);
        add(l7);
        String Occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 420, 320, 30);
        add(comboBox5);

        // PAN Number Label and TextField
        JLabel l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 470, 150, 30);
        add(l8);
        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 470, 320, 30);
        add(textPan);

        // Aadhar Number Label and TextField
        JLabel l9 = new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 520, 150, 30);
        add(l9);
        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAadhar.setBounds(350, 520, 320, 30);
        add(textAadhar);

        // Senior Citizen Label and RadioButtons
        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 570, 150, 30);
        add(l10);
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 570, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 570, 100, 30);
        add(r2);

        // Existing Account Label and RadioButtons
        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 620, 200, 30);
        add(l11);
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(252, 208, 76));
        r3.setBounds(350, 620, 100, 30);
        add(r3);
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(252, 208, 76));
        r4.setBounds(460, 620, 100, 30);
        add(r4);


        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        l13.setBounds(760, 10, 60, 30);
        add(l13);


        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " ";
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eaccount = " ";
        if (r3.isSelected()) {
            eaccount = "Yes";
        } else if (r4.isSelected()) {
            eaccount = "No";
        }

        try {
            if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all field");
            } else if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
                JOptionPane.showMessageDialog(null, "Enter valid PAN number (e.g., ABCDE1234F)");
            } else if (!aadhar.matches("\\d{12}")) {
                JOptionPane.showMessageDialog(null, "Enter valid 12-digit Aadhar number");
            } else {
                Con c1 = new Con();
                String q = "insert into SignupTwo values('" + formno + "', '" + rel + "', '" + cate + "', '" + inc + "', '" + edu + "', '" + occ + "', '" + pan + "', '" + aadhar + "', '" + scitizen + "', '" + eaccount + "')";
                c1.statement.executeUpdate(q);

                new Signup3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup2(" ");
    }


}
