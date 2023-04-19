import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignupOne extends JFrame{
    SignupOne(){
        setTitle("Signup Page");
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L); // Gives a 4 digit positive random number


        JLabel formnum = new JLabel("APPLICATION FORM NO. " + random );
        formnum.setFont(new Font("Oswald",Font.BOLD,38));
        formnum.setBounds(140,20,600,40);
        add(formnum);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Oswald",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Oswald",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        JLabel fathername = new JLabel("Father's Name: ");
        fathername.setFont(new Font("Oswald",Font.BOLD,20));
        fathername.setBounds(100,190,200,30);
        add(fathername);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Oswald",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Oswald",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Oswald",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);


        getContentPane().setBackground(Color.WHITE);

//    *** FRAME CREATION ***

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
