import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    MyFrame(){
        
        // thisrame this = new thisrame("GUI");
        this.setVisible(true);
        this.setTitle("tirle");
        // this.setResizable(false);
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLayout(new FlowLayout());
        // this.getContentPane().setBackground(Color.DARK_GRAY); 
        this.getContentPane().setBackground(new Color(123, 50, 0)); 

       

         ImageIcon img = new ImageIcon("logo.png");
        this.setIconImage(img.getImage());
    }
}
