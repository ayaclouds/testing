

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class SignInForDoctor extends JFrame implements ActionListener {

    JPanel panel;
    JLabel message=new JLabel();
    JLabel user_label, password_label,idL;
    JTextField userName_text;
    JTextField id_text;
    JPasswordField password_text;
    private ImageIcon image;
    JLabel la;

    JButton s=new JButton("submit");
    

    SignInForDoctor() {

        image = new ImageIcon(getClass().getResource("1.jpg"));
        la = new JLabel(image);
        la.setBounds(220, -70, 800, 600);
        // User Label
        setSize(1000,500);
        user_label = new JLabel();
        user_label.setText("UserName :");
        userName_text = new JTextField();
        user_label.setBounds(20,20,100,30);
        userName_text.setBounds(130,20,100,30);

        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();
        password_label.setBounds(20,90,100,30);
        password_text.setBounds(130,90,100,30);

        //id
        idL = new JLabel();
        idL.setText("ID :");
        id_text = new JTextField();
        idL.setBounds(20,160,100,30);
        id_text.setBounds(130,160,100,30);


        // Submit

        s.setBounds(130,200,100,30);

        //panel = new JPanel(new GridLayout(4, 1));

//        panel=new JPanel();
        add(user_label);
        add(userName_text);
        add(password_label);
        add(password_text);
        add(idL);
        add(id_text);
        add(s);
        add(la);

        add(message);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners to components..
        s.addActionListener(this);
        
//        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setVisible(true);
        

    }

    public static void main(String[] args) {
        new SignInForDoctor();
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        String id=id_text.getText();
        
        String a="!";
        String b="?";
        String c="#";
        
        if (userName.equals("Doctor1") && password.equals("docto21?")&&id.equals("221133")||userName.equals("Doctor2") && password.equals("docto21!")&&id.equals("221122")
        		&&userName.length()>=6&& userName.length()<=8&&password.length()>=8&&password.length()<=10
        		&& password.indexOf(a)!=-1||password.indexOf(b)!=-1||password.indexOf(c)!=-1) {
            setVisible(false);
            new toAddPatient();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }

    }

}