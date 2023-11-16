import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Btn_ActonLestner extends JFrame implements ActionListener{
    JButton button;
    int count =1;
    JLabel label;
    Btn_ActonLestner(){
        
        label =new JLabel();
        ImageIcon icon =new ImageIcon("GUI/logo.png");
        label.setIcon(icon);
        label.setBounds(0, 152, 500, 500);
        label.setVisible(false);
        

        ImageIcon img = new ImageIcon("GUI/fv.jpg");
        Image image =img.getImage();
        Image newimg = image.getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg);


        button =new JButton("hello");
        button.setBounds(150, 150, 100, 60);
        // button.addActionListener(e->System.out.println(count++ +". hello world"));
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBackground(Color.GRAY);
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
         button.setFont(new Font("Comic Sans", Font.BOLD,20));
        //  button.setIconTextGap(-12);
        button.setForeground(Color.green);
        // button.setEnabled(false);
        button.setBorder(BorderFactory.createEtchedBorder());


        
        this.setVisible(true);
        this.setSize(450,500);
        this.setLocation(700, 70);   
        this.setLayout(null); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.add(button);
        this.add(label);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            // ImageIcon icon = new ImageIcon("GUI/logo.png");
         button.setEnabled(false);
            label.setVisible(true);
        }
    }
    public static void main(String[] args) {
        Btn_ActonLestner b =new Btn_ActonLestner();
    }
}