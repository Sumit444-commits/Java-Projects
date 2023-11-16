import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Framelayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,500);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        
        
       JPanel panel =new JPanel();
       panel.setPreferredSize(new Dimension(350,500));
       panel.setBackground(Color.LIGHT_GRAY);
       frame.add(panel);     
       panel.setLayout(new FlowLayout(0, 50, 10));
    //    subpanel
       JPanel subpanel =new JPanel();
       subpanel.setPreferredSize(new Dimension(350,100));
       subpanel.setBackground(Color.WHITE);
       panel.add(subpanel);     


       panel.add(new JButton("1"));
       panel.add(new JButton("2"));
       panel.add(new JButton("3"));
       panel.add(new JButton("4"));
       panel.add(new JButton("5"));
       panel.add(new JButton("6"));
       panel.add(new JButton("7"));
       panel.add(new JButton("8"));
       panel.add(new JButton("9"));
       panel.add(new JButton("0"));
        
        frame.setVisible(true);
    }
}
