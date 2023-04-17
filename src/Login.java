import javax.swing.*; // For using JFrame because swing package comes form java extended.
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener { //JFrame is a swing class. ActionListener interface is responsible for detecting any actions. If an interface is implemented, all the methods inside that interface needs to be override.

    JButton loginbutton, clearbutton, signupbutton;
    JTextField cardTextfield;
    JPasswordField pinTextfield;
    Login(){ //constructor is created for popping the frame when the object of the Login class is called.
        setTitle("Automated Teller Machine");
        setLayout(null); //for creating custom layouts, layout is set to null.

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //the getSystemResource() method searches for the resource on the system classpath only. To search for a resource on the application classpath, you can use the ClassLoader.getResource() method instead.
        Image image1 = icon1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); // for scaling the image, awt classes is used.
        ImageIcon icon2 = new ImageIcon(image1); // JLabel cannot take image, so image is converted into icon.
        JLabel label = new JLabel(icon2);
        label.setBounds(70,10,100,100); //For positioning the label, this function is used.
        add(label);

        JLabel intro_title = new JLabel("Welcome to ATM");
        intro_title.setFont(new Font("Oswald",Font.BOLD,38)); //For font the label, setFont method is used. inside it a object of Font class need to be created.
        intro_title.setBounds(200,40,400,40); // Since layout is null, setBound is required to mention the position.
        add(intro_title);

        JLabel cardnum = new JLabel("Card No: ");
        cardnum.setFont(new Font("Verdana",Font.BOLD,28));
        cardnum.setBounds(90,180,150,40);
        add(cardnum);

        JLabel pinnum = new JLabel("PIN: ");
        pinnum.setFont(new Font("Verdana",Font.BOLD,28));
        pinnum.setBounds(90,240,150,40);
        add(pinnum);

//        *** TEXT FIELD CREATION ***

        cardTextfield =  new JTextField(); //For creating text block
        cardTextfield.setBounds(280, 180, 300, 40);
        cardTextfield.setFont(new Font("Arial", Font.BOLD, 18));
        add(cardTextfield);

        pinTextfield =  new JPasswordField(); //For creating text block
        pinTextfield.setBounds(280, 240, 300, 40);
        pinTextfield.setFont(new Font("Arial", Font.BOLD, 18));
        add(pinTextfield);

//        *** BUTTON CREATION ***

        loginbutton = new JButton("SIGN IN");
        loginbutton.setBounds(280 , 300, 100, 30);
        loginbutton.addActionListener(this); //this function allows to catch the event that button is clicked.
        add(loginbutton);

        clearbutton = new JButton("CLEAR");
        clearbutton.setBounds(420 , 300, 100, 30);
        clearbutton.addActionListener(this); //this function allows to catch the event that button is clicked.
        add(clearbutton);

        signupbutton = new JButton("SIGN UP");
        signupbutton.setBounds(280 , 350, 240, 30);
        signupbutton.addActionListener(this); //this function allows to catch the event that button is clicked.
        add(signupbutton);



        getContentPane().setBackground(Color.WHITE); //The content pane is a container that holds all the components of the frame such as buttons, text fields, labels, etc.



//        *** FRAME CREATION ***

        setSize(800,480); // defines the length and breadth of the frame.
        setVisible(true); // the frame is by default not visible to the user. that is why this function is called.
        setLocation(350,200); //the frame by default pops from origin(top left). To set a popping location, this method is used.





    }

    @Override
    public void actionPerformed(ActionEvent e) { // tells what action needs to be done after receiving the click in the button.
        if (e.getSource()==clearbutton){
            cardTextfield.setText("");
            pinTextfield.setText("");
        } else if (e.getSource()==loginbutton) {
            
        } else if (e.getSource()==signupbutton){

        }

    }

    public static void main(String[] args) {
        new Login();
    }


}
