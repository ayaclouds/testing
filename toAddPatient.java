import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class toAddPatient {

    private ImageIcon image;
    JLabel la;
	
	toAddPatient(){
	    image = new ImageIcon(getClass().getResource("3.jpg"));
        la = new JLabel(image);
        la.setBounds(40, 100, 150, 130);
        JFrame frame = new JFrame("to add patient");
        frame.setSize(300, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
            frame.setLayout(new FlowLayout());                      

            JButton button = new JButton("Add Patient");        

            frame.add(button);
            frame.add(la);

            frame.setVisible(true); 
           
            
            
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	frame.setVisible(false);
               
                    new Window1();
                }
            });
           
	}

    public static void main(String[] args) {
        new toAddPatient();
    }
	


}
