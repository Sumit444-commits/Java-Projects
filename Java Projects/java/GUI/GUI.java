import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
public class GUI{
    public static void main(String[] args) {
        /*
            GUI JFRAME

        JFrame jf = new JFrame("GUI");
       
        jf.setVisible(true);
        // jf.setResizable(false);
        jf.setSize(420,420);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        // jf.getContentPane().setBackground(Color.DARK_GRAY); 
        jf.getContentPane().setBackground(new Color(0, 0, 0)); //set bg color
        

        
        // ImageIcon img = new ImageIcon("logo.png");
        // jf.setIconImage(img.getImage());
        
        MyFrame myframe =new MyFrame();
        */
        

        JFrame jf = new JFrame("GUI");
        jf.setVisible(true);
        jf.setSize(750,750);
        // jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set text Left , Center  , Right
        jf.setLayout(null);
        

        // change the size of image
        ImageIcon icon = new ImageIcon("GUI/fv.jpg");
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon =new ImageIcon(newimg); 

        //to add image and text in label
        JLabel label =new JLabel();
        label.setText("CLICK");
        label.setIcon(icon);
        // label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(30, 20, 30, 30);

        /*
        GUI Label
        
        ImageIcon image =new ImageIcon("GUI/fv.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        

        JLabel l1 = new JLabel("FLIPCART");

        jf.add(l1);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setVerticalTextPosition(JLabel.TOP);
        l1.setForeground(new Color(0x00FF00)); //set font color of text
        l1.setFont(new Font("MV Boli",Font.PLAIN,30)); //set font style
        l1.setIconTextGap(10);
        l1.setBackground(Color.BLACK);
        l1.setOpaque(true);//to show bg color
        l1.setBorder(border);
        l1.setIcon(image);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setHorizontalAlignment(JLabel.CENTER);
        // l1.setBounds(0, 0, 405, 380); // sets the label position and size by take (x,y,width,height) 
        jf.pack();

        */

        /*

        GUI JPanel

        JPanel redpanel =new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(new BorderLayout());
     

        JPanel bluepanel =new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(new BorderLayout());


        JPanel greenpanel =new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(new BorderLayout());

            
    

        jf.add(redpanel);
        jf.add(bluepanel);
        jf.add(greenpanel);

        redpanel.add(label);
       
        */





        // jf.add(l1);
        // JTextField t1 = new JTextField(20);
        // jf.add(t1);
        // JLabel l2 = new JLabel("Password ");
        // jf.add(l2);
        // JTextField t2 = new JTextField(20);
        // jf.add(t2);
        // JButton btn = new JButton("Submit");
        // jf.add(btn);

        // JTextArea ta1 = new JTextArea("Hello");
        // jf.add(ta1);

    }
}
