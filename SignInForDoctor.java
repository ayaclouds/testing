

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class SignInForDoctor extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message,idL;
    JTextField userName_text;
    JTextField id_text;
    JPasswordField password_text;
    JButton submit, cancel;
    

    SignInForDoctor() {

        // User Label
        setSize(300,600);
        user_label = new JLabel();
        user_label.setText("UserName :");
        userName_text = new JTextField();

        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        //id
        idL = new JLabel();
        idL.setText("ID :");
        id_text = new JTextField();


        // Submit

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(4, 1));

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(idL);
        panel.add(id_text);


        message = new JLabel();
        panel.add(message);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners to components..
        submit.addActionListener(this);
        
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(300, 200);
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
            message.setText(" Hello " + userName
                    + "");
            setVisible(false);
            new toAddPatient();
        } else {
            message.setText(" Invalid user.. ");
        }

    }

}