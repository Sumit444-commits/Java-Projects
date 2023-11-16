import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPortal extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextArea displayArea;

    public LoginPortal() {
        setTitle("Login Portal");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Components
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel emailLabel = new JLabel("Email:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        emailField = new JTextField();

        JButton loginButton = new JButton("Show Password");
        JButton submitButton = new JButton("Submit to File");
        JButton displayButton = new JButton("Display File Data");

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        // Adding components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(emailLabel);
        add(emailField);
        add(loginButton);
        add(submitButton);
        add(displayButton);
        add(new JScrollPane(displayArea));

        // Event handlers
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your login logic can be added here
                passwordField.setEchoChar((char)0);
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameField.getText().isEmpty() || passwordField.getPassword().toString().isEmpty() ||
                        emailField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(LoginPortal.this, "Please enter all the fields");
                }
                if (validateEmail()) {
                        submitDataToFile();
                    } else
                        JOptionPane.showMessageDialog(LoginPortal.this, "Invalid Email Address!");
                usernameField.setText(null);
                passwordField.setText(null);
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayFileData();
            }
        });
    }

    private boolean validateEmail() {
        String email = emailField.getText();
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void submitDataToFile() {
        try (FileOutputStream fos = new FileOutputStream("userdata.txt", true);
             PrintWriter writer = new PrintWriter(fos)) {

            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String email = emailField.getText();

            // Writing data to the file
            writer.println("Username: " + username + ", Password: " + password + ", Email: " + email);
            JOptionPane.showMessageDialog(this, "Data Submitted to File!");

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error submitting data to file.");
        }
    }

    private void displayFileData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("userdata.txt"))) {
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
            displayArea.setText(data.toString());

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading data from file.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPortal().setVisible(true);
            }
        });
    }
}