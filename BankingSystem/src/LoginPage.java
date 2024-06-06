import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends BankMain implements ActionListener {

	JFrame frame;
	JPanel panel;
	JTextField  FirstnameTextfield, Passwordfield;
	JLabel FirstnameLabel, PasswordLabel, LoginLabel, BanknameLabel, TextLabel, SignUpLabel_Pic;
	JButton LoginBtn, SignUpBtn;
	
	Font font = new Font("Ink Free", Font.BOLD,25);
	Font font1 = new Font("Ink Free", Font.BOLD,35);
	Font font2 = new Font("Ink Free", Font.BOLD,20);
	
	ImageIcon SignUpImg = new ImageIcon("SignUp_Pic.jpg");
	
	
	LoginPage(){
		 
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
		
		LoginLabel = new JLabel("Login");
		LoginLabel.setBounds(170,15,150,35);
		LoginLabel.setFont(font);
		
		
		FirstnameLabel = new JLabel("First Name: ");
		FirstnameLabel.setBounds(50,70,150,35);
		FirstnameLabel.setFont(font);
		
		
		PasswordLabel = new JLabel("Enter Password: ");
		PasswordLabel.setBounds(50,170,200,35);
		PasswordLabel.setFont(font);
		
		
		
		// TextFields
		FirstnameTextfield = new JTextField();
		FirstnameTextfield.setBounds(50,95,300,40);
		 
		 
		Passwordfield = new JTextField();
		Passwordfield.setBounds(50,195,300,40);
		
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
		SignUpBtn.addActionListener(this);
		
		
		
		// Panel for Textfields and Labels
		panel = new JPanel();
		panel.setBounds(285,0,400,700);
		panel.setVisible(true);
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.add(LoginLabel);
		panel.add(FirstnameLabel);
		panel.add(PasswordLabel);
		panel.add(FirstnameTextfield);
		panel.add(Passwordfield);
		panel.add(LoginBtn);
		panel.add(SignUpBtn);
		
		
		
		// SignUp frame
		frame = new JFrame("Banking APP- Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(Color.BLACK);;
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		
		//Adding Components too frame
		frame.add(panel);
		frame.add(BanknameLabel);
		frame.add(TextLabel);
		frame.add(SignUpLabel_Pic);
		
		
		frame.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==SignUpBtn) {
			SignUpPage signuppage = new SignUpPage();
			frame.dispose();
		}
		
	}

}
