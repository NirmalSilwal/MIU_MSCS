package lesson7;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class HelloGoodbye extends JFrame {
	JPanel mainPanel, topPanel, centerPanel;
	JTextField leftText, rightText;

	public HelloGoodbye() {
		setTitle("Hello Goodbye");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		defineTopPanel();
		defineCenterPanel();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		getContentPane().add(mainPanel);
		pack();
	}

	public void defineTopPanel() {
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		leftText = new JTextField(10);
		leftText.setText("Hello");
		rightText = new JTextField(10);
		rightText.setText("Goodbye");
		topPanel.add(leftText);
		topPanel.add(rightText);
	}

// Concentrate on highlighted part
	public void defineCenterPanel() {
		centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton b = new JButton("Switch");
		b.addActionListener(new ButtonListener());
		centerPanel.add(b);
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String left = leftText.getText();
			String right = rightText.getText();
			leftText.setText(right);
			rightText.setText(left);
		}
	}

	public static void main(String[] args) {
		HelloGoodbye hg = new HelloGoodbye();
		hg.setVisible(true);
	}
}