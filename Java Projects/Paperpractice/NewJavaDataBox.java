import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;

class Student implements Serializable {
    String name;
    String rollNo;
    String date;

    public Student(String name, String rollNo, String date) {
        this.name = name;
        this.rollNo = rollNo;
        this.date = date;
    }

    public String dis() {
        return ("Name : " + name + "\nRoll no: " + rollNo + "\nRegistered Date : " + date
                + "\n--------------------------------\n");
    }
}

class Myframe extends JFrame implements ActionListener {
    JTextArea outputScreen;
    JPanel inputScreen;
    JLabel lblName, lblRollno, lblDate;
    JTextField txtName, txtRollno;
    JButton btnSubmit;
    JButton btnShow;
    HashSet<Student> student ;

    Myframe() {
        inputScreen = new JPanel();
        outputScreen = new JTextArea();

        lblName = new JLabel("Name");
        lblRollno = new JLabel("Roll No: ");
        lblDate = new JLabel("Date : " + CDate());

        txtName = new JTextField();
        txtRollno = new JTextField();

        btnSubmit = new JButton("SUBMIT");
        btnShow = new JButton("SHOW");

        inputScreen.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));

        inputScreen.setBounds(0, 0, 200, 500);

        outputScreen.setBounds(250, 10, 280, 400);

        txtName.setPreferredSize(new Dimension(100, 20));
        txtName.setMinimumSize(new Dimension(100, 20));
        txtRollno.setPreferredSize(new Dimension(100, 20));
        txtRollno.setMinimumSize(new Dimension(100, 20));

        btnSubmit.addActionListener(this);
        btnShow.addActionListener(this);

        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("OOP Paper");
        this.getContentPane().setLayout(null);

        inputScreen.add(lblName);
        inputScreen.add(txtName);
        inputScreen.add(lblRollno);
        inputScreen.add(txtRollno);
        inputScreen.add(lblDate);

        inputScreen.add(btnSubmit);
        inputScreen.add(btnShow);
        this.add(inputScreen);
        this.add(outputScreen);

        this.setVisible(true);
    }

    public String CDate() {
        Date date = new Date();
        String sdf = new SimpleDateFormat("yyyy/MM/dd").format(date);
        return sdf;
    }

    public void fetchData() throws IOException,ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.bin"));
        try {
            student = (HashSet<Student>) ois.readObject();
        } catch (EOFException e) {
            student = new HashSet<>();
            System.out.println("Not opening");
        }
        finally{
            ois.close();
        }


        File file = new File("Student.bin");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        student.add(new Student(txtName.getText(), txtRollno.getText(), CDate()));
        oos.writeObject(student);
        oos.close();
    }

    public void restoreDisplay() throws IOException, ClassNotFoundException{
        HashSet<Student> students;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
        try {
            students = (HashSet<Student>) ois.readObject();
        } catch (EOFException e) {
            students = new HashSet<>();
        }
        outputScreen.setText("");
        for (Student s : students) {
            outputScreen.append(s.dis());

        }

        ois.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            try {
                fetchData();
               
            } catch (Exception ie) {
            }
        }
        if (e.getSource() == btnShow) {
            try {
              
                restoreDisplay();
            } catch (Exception ie) {
            }
        }
    }

}

public class NewJavaDataBox {
    public static void main(String[] args) {
        Myframe frame = new Myframe();

    }

}
