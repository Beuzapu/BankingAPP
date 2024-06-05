import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignUpPage extends BankMain implements ActionListener {

	JFrame frame;
	JPanel panel;
	JTextField  FirstnameTextfield, LastnameTextfield,PhonenumberTextfield, PinTextfield;
	JLabel FirstnameLabel, LastnameLabel, PhonenumberLabel, PinLabel, SignUpLabel, BanknameLabel, TextLabel, SignUpLabel_Pic;
	JButton LoginBtn, SignUpBtn;
	
	Font font = new Font("Ink Free", Font.BOLD,25);
	Font font1 = new Font("Ink Free", Font.BOLD,35);
	Font font2 = new Font("Ink Free", Font.BOLD,20);
	
	ImageIcon SignUpImg = new ImageIcon("SignUp_Pic.jpg");
	
	
	SignUpPage(){
		 
		// Labels
		SignUpLabel_Pic = new JLabel();
		SignUpLabel_Pic.setBounds(45,200,200,200);
		Image Cookie1 =  SignUpImg.getImage();
		Image newCookie = Cookie1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		 SignUpImg = new ImageIcon(newCookie);
		 SignUpLabel_Pic.setIcon( SignUpImg);
		
		
		
		BanknameLabel = new JLabel("Banking APP");
		BanknameLabel.setBounds(50,100,200,40);	
		BanknameLabel.setForeground(Color.BLUE);
		BanknameLabel.setFont(font1);
		
		TextLabel = new JLabel("The Future of Banking");
		TextLabel.setBounds(35,500,300,40);
		TextLabel.setForeground(Color.BLUE);
		TextLabel.setFont(font2);
		
		SignUpLabel = new JLabel("SignUp");
		SignUpLabel.setBounds(170,15,150,35);
		SignUpLabel.setFont(font);
		
		
		FirstnameLabel = new JLabel("First Name: ");
		FirstnameLabel.setBounds(50,70,150,35);
		FirstnameLabel.setFont(font);
		
		LastnameLabel = new JLabel("Last Name: ");
		LastnameLabel.setBounds(50,170,150,35);
		LastnameLabel.setFont(font);
		
		PhonenumberLabel = new JLabel("Phone number: ");
		PhonenumberLabel.setBounds(50,270,200,35);
		PhonenumberLabel.setFont(font);
		
		PinLabel = new JLabel("Enter Pin: ");
		PinLabel.setBounds(50,370,150,35);
		PinLabel.setFont(font);
		
		
		
		// TextFields
		FirstnameTextfield = new JTextField();
		FirstnameTextfield.setBounds(50,95,300,40);
		 
		 
		LastnameTextfield = new JTextField();
		LastnameTextfield.setBounds(50,195,300,40);
		 
		PhonenumberTextfield = new JTextField();
		PhonenumberTextfield.setBounds(50,295,300, 40);
		 
		PinTextfield = new JTextField();
		PinTextfield.setBounds(50,395,300,40);
		
		//Buttons
		LoginBtn = new JButton("Login");
		LoginBtn.setBounds(55,450,140,50);
		LoginBtn.setBackground(Color.BLUE);
		LoginBtn.setForeground(Color.WHITE);
		LoginBtn.setFocusable(false);
		
		
		SignUpBtn = new JButton("Sign Up");
		SignUpBtn.setBounds(200,450,140,50);
		SignUpBtn.setBackground(Color.BLUE);
		SignUpBtn.setForeground(Color.WHITE);
		SignUpBtn.setFocusable(false);
		
		
		
		// Panel for Textfields and Labels
		panel = new JPanel();
		panel.setBounds(285,0,400,700);
		panel.setVisible(true);
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.add(SignUpLabel);
		panel.add(FirstnameLabel);
		panel.add(LastnameLabel);
		panel.add(PhonenumberLabel);
		panel.add(PinLabel);
		panel.add(FirstnameTextfield);
		panel.add(LastnameTextfield);
		panel.add(PhonenumberTextfield);
		panel.add(PinTextfield);
		panel.add(LoginBtn);
		panel.add(SignUpBtn);
		
		
		
		// SignUp frame
		frame = new JFrame("Banking APP- SignUp");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(Color.BLACK);;
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		
		//Adding Components too frame
		frame.add(panel);
		frame.add(BanknameLabel);
		frame.add(TextLabel);
		frame.add(SignUpLabel_Pic);
		
		
		frame.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
