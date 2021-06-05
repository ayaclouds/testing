import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class toAddPatient {
	
	toAddPatient(){
    JFrame frame = new JFrame("to add patient");           
    frame.setSize(300, 250);                                
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
            frame.setLayout(new FlowLayout());                      

            JButton button = new JButton("Add Patient");        

            frame.add(button);                                     

            frame.setVisible(true); 
           
            
            
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	frame.setVisible(false);
               
                    new Window1();
                }
            });
           
	}


}
