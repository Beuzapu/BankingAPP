import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DepositPage implements ActionListener{

	JFrame frame;
	JTextField DepositTextField;
	JButton OneHundredBtn, TwohundredBtn, FiveHundredBtn, OneThousendBtn, DepositBtn, BackBtn;
	JLabel DepositLabel, label;
	JPanel panel;
	
	Font font = new Font("Ink Free", Font.BOLD,25);
	Font font1 = new Font("Ink Free", Font.BOLD,10);
	
	
	DepositPage(){
		
		BackBtn = new JButton("Back");
		BackBtn.setBounds(20, 20, 40, 40);
		BackBtn.setFocusable(false);
		BackBtn.setFont(font1);
		BackBtn.addActionListener(this);
		
		DepositTextField = new JTextField();
		DepositTextField.setBounds(100,100,500,50);
		DepositTextField.setLayout(null);
		DepositTextField.setText("Enter Amount...");
		
		OneHundredBtn = new JButton("R100");
		OneHundredBtn.setBounds(40, 10, 200, 100);
		OneHundredBtn.setFocusable(false);
		OneHundredBtn.setFont(font);
		
		TwohundredBtn = new JButton("R200");
		TwohundredBtn.setBounds(260, 10, 200, 100);
		TwohundredBtn.setFocusable(false);
		TwohundredBtn.setFont(font);
		
		FiveHundredBtn = new JButton("R500");
		FiveHundredBtn.setBounds(40, 130, 200, 100);
		FiveHundredBtn.setFocusable(false);
		FiveHundredBtn.setFont(font);
		
		OneThousendBtn = new JButton("R1000");
		OneThousendBtn.setBounds(260, 130, 200, 100);
		OneThousendBtn.setFocusable(false);
		OneThousendBtn.setFont(font);
		
		DepositBtn = new JButton("Deposit");
		DepositBtn.setBounds(250, 500 , 200, 75);
		DepositBtn.setFocusable(false);
		DepositBtn.setFont(font);
		
		
		panel = new JPanel();
		panel.setBounds(100,200,500,250);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.add(OneHundredBtn);
		panel.add(TwohundredBtn);
		panel.add(FiveHundredBtn);
		panel.add(OneThousendBtn);
		
	
		
		
		
		// adding frame
		frame = new JFrame();
		frame = new JFrame("Banking APP- Deposit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(Color.BLACK);;
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(DepositTextField);
		frame.add(panel);
		frame.add(DepositBtn);
		frame.add(BackBtn);
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==BackBtn) {
			HomePage homepage = new HomePage();
			frame.dispose();
		}
		
	}
	
}
