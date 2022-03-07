package lesson10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class AddTwoNumberGUI {

	public static void main(String[] args) {
		Addition myadder = new Addition();
	}
}

class Addition extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 896104663087803987L;
	JTextField t1, t2;
	JButton btn;
	JLabel label;
	JLabel first, second;

	public Addition() {

		setTitle("My addition App");

		first = new JLabel("num1");
		second = new JLabel("num2");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);

		btn = new JButton("Sum");

		label = new JLabel("Result");

		// adding listener to button on click event
		btn.addActionListener(this);

		add(first);
		add(t1);
		add(second);
		add(t2);
		add(btn);
		add(label);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt) {

		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText()); 
		int totalsum = num1 + num2;
		
		label.setText(totalsum + "");

		
		JOptionPane.showMessageDialog(null, "Addition is performed", "Stay happy, safe Nirmal", JOptionPane.WARNING_MESSAGE);
	}
}
