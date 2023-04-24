import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser; //requires a jar file of jcalendar

public class SignupOne extends JFrame{

    JTextField nameTextField;
    SignupOne(){
        setTitle("Signup Page");
        setLayout(null);


        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L); // Gives a 4 digit positive random number used in "formnum"


        JLabel formnum = new JLabel("APPLICATION FORM NO. " + random );
        formnum.setFont(new Font("Oswald",Font.BOLD,38));
        formnum.setBounds(140,20,600,40);
        add(formnum);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Oswald",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

//        *** FIELD CREATION ***

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

        JLabel marital= new JLabel("Marital Status: ");
        marital.setFont(new Font("Oswald", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Oswald",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        JLabel district = new JLabel("District: ");
        district.setFont(new Font("Oswald",Font.BOLD,20));
        district.setBounds(100,490,200,30);
        add(district);

        JLabel division = new JLabel("Division: ");
        division.setFont(new Font("Oswald",Font.BOLD,20));
        division.setBounds(100,540,200,30);
        add(division);

        JLabel country = new JLabel("Country: ");
        country.setFont(new Font("Oswald",Font.BOLD,20));
        country.setBounds(100,590,200,30);
        add(country);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Oswald",Font.BOLD,20));
        pincode.setBounds(100,640,200,30);
        add(pincode);

//        *** TEXT FIELD CREATION ***

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Oswald", Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30); // in correspondance with name JLabel.
        add(nameTextField);

        JTextField fathernameTextField = new JTextField();
        fathernameTextField.setFont(new Font("Oswald", Font.BOLD,14));
        fathernameTextField.setBounds(300,190,400,30);
        add(fathernameTextField);

        JDateChooser dobTextField = new JDateChooser(); //calendar creation
        dobTextField.setFont(new Font("Oswald", Font.BOLD,14));
        dobTextField.setBounds(300,240,400,30);
        add(dobTextField);

        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Oswald", Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Oswald", Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JTextField districtTextField = new JTextField();
        districtTextField.setFont(new Font("Oswald", Font.BOLD,14));
        districtTextField.setBounds(300,490,400,30);
        add(districtTextField);

        JTextField divisionTextField = new JTextField();
        divisionTextField.setFont(new Font("Oswald", Font.BOLD,14));
        divisionTextField.setBounds(300,540,400,30);
        add(divisionTextField);

        JTextField countryTextField = new JTextField();
        countryTextField.setFont(new Font("Oswald", Font.BOLD,14));
        countryTextField.setBounds(300,590,400,30);
        add(countryTextField);

        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Oswald", Font.BOLD,14));
        pincodeTextField.setBounds(300,640,400,30);
        add(pincodeTextField);

//        *** BUTTON CREATION ***

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup(); //For grouping the radio buttons, so that multiple selection can be avoided.
        gendergroup.add(male);
        gendergroup.add(female);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(640,390,120,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup(); //For grouping the radio buttons, so that multiple selection can be avoided.
        gendergroup.add(married);
        gendergroup.add(unmarried);
        gendergroup.add(other);


        JButton next = new JButton("Next");
        next.setFont(new Font("Oswald",Font.BOLD,14));
        next.setBounds(620,690,80,30);
        add(next);


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
