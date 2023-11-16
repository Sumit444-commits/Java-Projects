import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Launchpage implements ActionListener {
    JFrame frame =new JFrame();
    JButton btn = new JButton("New window");

    public Launchpage(){
        
        btn.setBounds(200, 200, 200, 100);
        btn.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(btn);
        frame.setVisible(true);
    }
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            frame.dispose();
            LayeredPane pane =new LayeredPane();
        }
     }
     public static void main(String[] args) {
        
     }

}
