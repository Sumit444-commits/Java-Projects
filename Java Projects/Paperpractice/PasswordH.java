import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordH extends JFrame{
    JPasswordField pass = new JPasswordField();
    PasswordH(){
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("OOP Paper");
        pass.setBounds(0,0,200,20);
        // pass.setEchoChar((char)0);
        this.add(pass);

        this.getContentPane().setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new PasswordH();
    }
}
