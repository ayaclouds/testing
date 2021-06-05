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

class Gui extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message, idL;
    JTextField userName_text;
    JTextField id_text;
    JPasswordField password_text;
    JButton submit, cancel;

    Gui() {

        // User Label
        setSize(300, 600);
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
        new Gui();
  
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        String id = id_text.getText();
        String a = "!";
        String b = "@";
        String c = "#";
        String User1 = "Doctor1";
        String User2 = "Doctor2";
        int digitsUser2 = countDigits(User1);
        int digitsUser1 = countDigits(User1);
        String pas1 = "docto21!";
        String pas2 = "docto23#";
        String ID1 = "123456";
        String ID2 = "123321";
        int digitpasaword1 = countDigits(pas1);
        int digitpasaword2 = countDigits(pas2);
        int charpassword1 = countChars(pas1);
        int charpassword2 = countChars(pas1);
        //&& password.equals(pas1)&&id.equals(ID1)&&digitpasaword1>0&&pas1.indexOf("!")!=-1||pas1.indexOf("#")!=-1||pas1.indexOf("$")!=-1&&charpassword1>0&&pas1.length()>=8&&pas1.length()<=10&&id.equals(ID1)
        if (userName.equals(User1) && digitsUser1 <= 2 && User1.length() >= 6 && User1.length() <= 8 && password.equals(pas1) && id.equals(ID1) && digitpasaword1 > 0 && pas1.indexOf("!") != -1 || pas1.indexOf("#") != -1 || pas1.indexOf("$") != -1 && charpassword1 > 0 && pas1.length() >= 8 && pas1.length() <= 10 && id.equals(ID1) || userName.equals(User2) && digitsUser2 <= 2 && User2.length() >= 6 && User2.length() <= 8 && password.equals(pas2) && id.equals(ID2) && digitpasaword2 > 0 && pas2.indexOf("!") != -1 || pas2.indexOf("#") != -1 || pas2.indexOf("$") != -1 && charpassword2 > 0 && pas2.length() >= 8 && pas2.length() <= 10 && id.equals(ID2)) {
            message.setText(" Hello " + userName
                    + "");
        } else {
            message.setText(" Invalid user.. ");
        }
        
        if(ae.getSource()==submit) {
        	setVisible(false);
   
        	new toAddPatient();
     
        
        }

    }

    public int countDigits(String s) {
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                ++counter;
            }
        }
        return counter;
    }

    public int countChars(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
        }
        return count;
    }

}