import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;

public class JoptoinPane {
    public static void main(String[] args) {
       
        /*
        ----Show Message Dialog---------
        JOptionPane.showMessageDialog(null, "Hello dear", null,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello dear", null,JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello dear", null,JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello dear", null,JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello dear", null,JOptionPane.WARNING_MESSAGE);
 */
        
    //  System.out.println(JOptionPane.showConfirmDialog(null, "hello", "conform", JOptionPane.YES_NO_CANCEL_OPTION));

    String[] option = {"Hello","world","I love u"};
    ImageIcon icon = new ImageIcon("GUI/fv.jpg");
int naem= JOptionPane.showOptionDialog(null,"Hello","welcome",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,option,0);


        // String name = JOptionPane.showInputDialog("what is your name : ");
        System.out.println(option[naem]);
    }
}
