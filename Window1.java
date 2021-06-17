import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window1 implements ActionListener{
    JFrame frame=new JFrame("Patient details");
    JLabel label=new JLabel();
    public static String data []={"male","female"};
    public static JTextField nametxt=new JTextField();
    public static JTextField compcodetxt=new JTextField(10);
    public static JTextField cardnumtxt=new JTextField(10);
    public static JTextField cardtypetxt=new JTextField(10);
    public static JTextField pintxt=new JTextField(10);
    public static JComboBox gendertxt=new JComboBox(data);

    public static JTextField empcodetxt=new JTextField(10);
    public static JTextField dobtxt=new JTextField(10);
    public static JTextField valuptotxt=new JTextField(10);
    public static JTextField jdatetxt=new JTextField(10);
    public static JTextField depttxt=new JTextField(10);
    public static JTextField uidtxt=new JTextField(10);

    private ImageIcon image;
    JLabel la;

    JLabel name=new JLabel("First Name :");//
    JLabel compcode=new JLabel("Last Name :");
    JLabel cardno=new JLabel("Age: ");//
    JLabel gender=new JLabel("Gender:");
    JLabel dob=new JLabel("Id :");//
    JButton but_per = new JButton("AddPatient");//
    private Component button;
    JButton AddPatient;
    Window1(){
        label.setBounds(0,0,300,600);

        image = new ImageIcon(getClass().getResource("1.jpg"));
        la = new JLabel(image);
        la.setBounds(220, 30, 300, 300);


        empcodetxt.setBounds(110, 10, 100, 25);
        name.setBounds(10, 40, 100, 25);//
        nametxt.setBounds(110, 40, 100, 25);
        compcode.setBounds(10, 70, 100, 25);//
        compcodetxt.setBounds(110, 70, 100, 25);
        cardno.setBounds(10, 100, 100, 25);
        cardnumtxt.setBounds(110, 100, 100, 25);
        gender.setBounds(10, 130, 100, 25);
        gendertxt.setBounds(110, 130, 100, 25);
        dob.setBounds(10, 160, 100, 25);//
        dobtxt.setBounds(110, 160, 100, 25);

        valuptotxt.setBounds(110, 190, 100, 25);

        jdatetxt.setBounds(110, 220, 100, 25);

        depttxt.setBounds(110, 250, 100, 25);

        uidtxt.setBounds(110, 280, 100, 25);

        but_per.setBounds(100, 250, 120, 25);
        frame.add(name); frame.add(nametxt);
        frame.add(compcode); frame.add(compcodetxt);
        frame.add(cardno); frame.add(cardnumtxt);
        frame.add(gender); frame.add(gendertxt);
        frame.add(dob); frame.add(dobtxt);
        frame.add(but_per);

        frame.add(label);
        frame.add(la);
        ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setVisible(true);
        

        but_per.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);
           
                new Window2();
            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent ai) {
    	 if(ai.getSource()==AddPatient) {
    		    
         	Window2 MyWindow1=new Window2();
    	 }
    }

    public static void main(String[] args) {
        new Window1();
    }

}