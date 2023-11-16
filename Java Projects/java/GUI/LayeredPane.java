import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class LayeredPane {

    public LayeredPane(){
         
        JLayeredPane pane =new JLayeredPane();
        pane.setBounds(0, 0, 500, 500);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBounds(100, 100, 150, 150);
        label1.setBackground(Color.BLUE);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(150, 150, 150, 150);
        label2.setBackground(Color.RED);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBounds(200, 200, 150, 150);
        label3.setBackground(Color.GREEN);


        pane.add(label1,Integer.valueOf(0));
        pane.add(label2, Integer.valueOf(1));
        pane.add(label3,Integer.valueOf(2));

        JFrame frame =new JFrame();

        frame.add(pane);

        frame.setTitle("Border layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       

    }
}
