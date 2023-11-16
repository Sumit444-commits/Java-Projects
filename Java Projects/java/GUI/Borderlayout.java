import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borderlayout {
    public static void main(String[] args) {
        
        


        JFrame frame =new JFrame();


        frame.setTitle("Border layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));
       
        frame.setVisible(true);
        frame.setSize(500,500);

        JPanel jp1 =new JPanel();
        JPanel jp2 =new JPanel();
        JPanel jp3 =new JPanel();
        JPanel jp4 =new JPanel();
        JPanel jp5 =new JPanel();


        jp1.setBackground(Color.BLUE);
        jp2.setBackground(Color.RED);
        jp3.setBackground(Color.GREEN);
        jp4.setBackground(Color.YELLOW);
        jp5.setBackground(Color.magenta);

        jp1.setPreferredSize(new Dimension(100,100));
        jp2.setPreferredSize(new Dimension(100,100));
        jp3.setPreferredSize(new Dimension(100,100));
        jp4.setPreferredSize(new Dimension(100,100));
        jp5.setPreferredSize(new Dimension(100,100));

        frame.add(jp1, BorderLayout.NORTH);
        frame.add(jp2,BorderLayout.EAST);
        frame.add(jp3,BorderLayout.SOUTH);
        frame.add(jp4,BorderLayout.WEST);
        frame.add(jp5,BorderLayout.CENTER);

        //-------------------------sub Panel----------------------

        JPanel jp6 =new JPanel();
        JPanel jp7 =new JPanel();
        JPanel jp8 =new JPanel();
        JPanel jp9 =new JPanel();
        JPanel jp10 =new JPanel();

        jp5.setLayout(new BorderLayout(5,5));

        jp6.setBackground(Color.black);
        jp7.setBackground(Color.CYAN);
        jp8.setBackground(Color.LIGHT_GRAY);
        jp9.setBackground(Color.orange);
        jp10.setBackground(Color.PINK);

        jp6.setPreferredSize(new Dimension(50,50));
        jp7.setPreferredSize(new Dimension(50,50));
        jp8.setPreferredSize(new Dimension(50,50));
        jp9.setPreferredSize(new Dimension(50,50));
        jp10.setPreferredSize(new Dimension(50,50));

        jp5.add(jp6, BorderLayout.NORTH);
        jp5.add(jp7,BorderLayout.EAST);
        jp5.add(jp8,BorderLayout.SOUTH);
        jp5.add(jp9,BorderLayout.WEST);
        jp5.add(jp10,BorderLayout.CENTER);

        //---------------------------------------------sub sub panel-------------------------------------

        JPanel jp11 =new JPanel();
        JPanel jp12 =new JPanel();
        JPanel jp13 =new JPanel();
        JPanel jp14 =new JPanel();
        JPanel jp15 =new JPanel();

        jp10.setLayout(new BorderLayout(5,5));

        jp11.setBackground(Color.blue);
        jp12.setBackground(Color.GREEN);
        jp13.setBackground(Color.gray);
        jp14.setBackground(Color.WHITE);
        jp15.setBackground(Color.LIGHT_GRAY);

        jp11.setPreferredSize(new Dimension(50,50));
        jp12.setPreferredSize(new Dimension(50,50));
        jp13.setPreferredSize(new Dimension(50,50));
        jp14.setPreferredSize(new Dimension(50,50));
        jp15.setPreferredSize(new Dimension(50,50));

        jp10.add(jp11, BorderLayout.NORTH);
        jp10.add(jp12,BorderLayout.EAST);
        jp10.add(jp13,BorderLayout.SOUTH);
        jp10.add(jp14,BorderLayout.WEST);
        jp10.add(jp15,BorderLayout.CENTER);

    }
}
    
