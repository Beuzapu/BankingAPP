import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class HomePage {

	JFrame frame;
	JButton DepositBtn, WithdrawBtn, DetailsBtn, TransactionsBtn;
	JLabel WelcomeLabel, FundsLabel;
	JPanel panel;
	
	Font font = new Font("Ink Free", Font.BOLD,35);
	Font font1 = new Font("Ink Free", Font.BOLD,20);
	
	String name = "Nathan";
	int funds = 5000;
	
	
	
	HomePage(){
		
		WelcomeLabel = new JLabel("Welcome back, " + name);
		WelcomeLabel.setBounds(25,10,200,40);
		WelcomeLabel.setFont(font1);
		WelcomeLabel.setForeground(Color.WHITE);
		
		FundsLabel = new JLabel("Funds- R" + funds);
		FundsLabel.setBounds(325,10,200,40);
		FundsLabel.setFont(font1);
		FundsLabel.setForeground(Color.WHITE);
		
		DepositBtn = new JButton("Deposit");
		DepositBtn.setBounds(25,55,225,225);
		DepositBtn.setFocusable(false);
		DepositBtn.setBorder(null);
		DepositBtn.setFont(font);
		DepositBtn.setBackground(Color.BLUE);
		DepositBtn.setForeground(Color.white);
		
		WithdrawBtn = new JButton("Withdraw");
		WithdrawBtn.setBounds(325,55,225,225);
		WithdrawBtn.setFocusable(false);
		WithdrawBtn.setBorder(null);
		WithdrawBtn.setFont(font);
		WithdrawBtn.setBackground(Color.BLUE);
		WithdrawBtn.setForeground(Color.white);
		
		DetailsBtn = new JButton("Details");
		DetailsBtn.setBounds(25,325,225,225);
		DetailsBtn.setFocusable(false);
		DetailsBtn.setBorder(null);
		DetailsBtn.setFont(font);
		DetailsBtn.setBackground(Color.BLUE);
		DetailsBtn.setForeground(Color.white);
		
		TransactionsBtn = new JButton("Transactions");
		TransactionsBtn.setBounds(325,325,225,225);
		TransactionsBtn.setFocusable(false);
		TransactionsBtn.setBorder(null);
		TransactionsBtn.setFont(font);
		TransactionsBtn.setBackground(Color.BLUE);
		TransactionsBtn.setForeground(Color.white);
		
		panel = new JPanel();
		panel.setBounds(45,30,600,600);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.add(DepositBtn);
		panel.add(WithdrawBtn);
		panel.add(DetailsBtn);
		panel.add(TransactionsBtn);
		panel.add(WelcomeLabel);
		panel.add(FundsLabel);
		
		frame = new JFrame("Banking APP- Home");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(Color.BLACK);;
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		
		
		
		
		
		frame.setVisible(true);
		
		
		
	}

}
