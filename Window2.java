import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Window2 {
	JFrame frame=new JFrame("Fill the blank");
    JLabel label=new JLabel();
    private Component button;
    JButton Check;
    public static JTextField WBCtxt=new JTextField(10);
    public static JTextField Neuttxt=new JTextField(10);
    public static JTextField Lymphtxt=new JTextField(10);
    public static JTextField RBCtxt=new JTextField(10);
    public static String data1 []={"yes","no"};
    public static JComboBox smokingtxt=new JComboBox(data1);
    public static JComboBox Orientaltxt=new JComboBox(data1);
    public static JComboBox Ethiopianstxt=new JComboBox(data1);
    public static JTextField HCTtxt=new JTextField(10);
    public static JTextField Ureatxt=new JTextField(10);
    public static JTextField Hbtxt=new JTextField(10);
    public static JTextField Creatininetxt=new JTextField(10);
    public static JTextField Irontxt=new JTextField(10);
    public static JTextField HDLtxt=new JTextField(10);
    public static JTextField Phosphatasetxt=new JTextField(10);
    
    
  


	JLabel WBC=new JLabel("WBC(4000-17000):");
    JLabel Neut=new JLabel("Neut (in%):");
    JLabel Lymph=new JLabel("Lymph (in%): ");
    JLabel RBC=new JLabel("RBC(4.5-6) :");
    JLabel HCT=new JLabel("HCT (in %):");
    JLabel Urea=new JLabel("Urea(17 למעלה) :");
    JLabel Hb=new JLabel("Hb(11.5-16) :");
    JLabel Creatinine =new JLabel("Creatinine(0.5..:");
    JLabel Iron =new JLabel("Iron(60-120) :");
    JLabel HDL =new JLabel("HDL(34-82) :");
    JLabel Phosphatase =new JLabel("Phosphatase(30..:");
    JLabel smoking=new JLabel("Smoking?");
    JLabel Oriental =new JLabel("Oriental  person?");
    JLabel Ethiopian =new JLabel("Ethiopian?");


    JButton check = new JButton("Result");
    
    Window2(){
    	label.setBounds(0,0,400,600);

        
        
        WBC.setBounds(10, 20, 100, 25);
        WBCtxt.setBounds(110, 20, 100, 25);
        
        Neut.setBounds(10, 50, 100, 25);
        Neuttxt.setBounds(110,50,100,25);
        
        Lymph.setBounds(10, 80, 100, 25);
        Lymphtxt.setBounds(110, 80, 100, 25);
        
        RBC.setBounds(10, 110, 100, 25);
        RBCtxt.setBounds(110, 110, 100, 25);
        
        HCT.setBounds(10, 140, 100, 25);
        HCTtxt.setBounds(110, 140, 100, 25);
        
        Urea.setBounds(10, 170, 100, 25);
        Ureatxt.setBounds(110, 170, 100, 25);
        
        Hb.setBounds(10, 200, 100, 25);
        Hbtxt.setBounds(110, 200, 100, 25);
        
        Creatinine.setBounds(10, 230, 100, 25);
        Creatininetxt.setBounds(110, 230, 100, 25);
        
        Iron.setBounds(10, 260, 100, 25);
        Irontxt.setBounds(110, 260, 100, 25);
        
        HDL.setBounds(10, 290, 100, 25);
        HDLtxt.setBounds(110, 290, 100, 25);
        
        Phosphatase.setBounds(10, 320, 100, 25);
        Phosphatasetxt.setBounds(110, 320, 100, 25);
        
        smoking.setBounds(10, 350, 100, 25);
        smokingtxt.setBounds(110, 350, 100, 25);
        Oriental .setBounds(10, 380, 100, 25);
        Orientaltxt.setBounds(110, 380, 100, 25);
        
        Ethiopian .setBounds(10, 410, 100, 25);
        Ethiopianstxt.setBounds(110, 410, 100, 25);
        check.setBounds(98, 440, 120, 25);
        
        frame.add(WBC); frame.add(WBCtxt);
        frame.add(Neut); frame.add(Neuttxt);
        frame.add(Lymph); frame.add(Lymphtxt);
        frame.add(RBC); frame.add(RBCtxt);
        frame.add(HCT); frame.add(HCTtxt);
        frame.add(Urea); frame.add(Ureatxt);
        frame.add(Hb); frame.add(Hbtxt);
        frame.add(Creatinine); frame.add(Creatininetxt);
        frame.add(Iron); frame.add(Irontxt);
        frame.add(HDL); frame.add(HDLtxt);
        frame.add(Phosphatase); frame.add(Phosphatasetxt);
        frame.add(smoking); frame.add(smokingtxt);
        frame.add(Oriental ); frame.add(Orientaltxt);
        frame.add(Ethiopian ); frame.add(Ethiopianstxt);

        frame.add(check);
       




        

        frame.add(label);
        ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setVisible(true);
        
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);
           
                new CopyResult();
            }
        });
    	
    }
    
    

}
