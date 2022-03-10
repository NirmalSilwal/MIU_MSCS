package lesson7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MetricConversion extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField mileinput;
	private JTextField kminput;
	private JTextField poundinput;
	private JTextField galloninput;
	private JTextField fareninput;
	private JTextField kginput;
	private JTextField literinput;
	private JTextField centiinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion frame = new MetricConversion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MetricConversion() {

		setTitle("Metric Conversion Assistant");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel milelabel = new JLabel("Mile:");
		GridBagConstraints gbc_mileLabel = new GridBagConstraints();
		gbc_mileLabel.insets = new Insets(0, 0, 5, 5);
		gbc_mileLabel.gridx = 1;
		gbc_mileLabel.gridy = 0;
		contentPane.add(milelabel, gbc_mileLabel);

		mileinput = new JTextField();
		GridBagConstraints gbc_mileinput = new GridBagConstraints();
		gbc_mileinput.insets = new Insets(0, 0, 5, 5);
		gbc_mileinput.fill = GridBagConstraints.HORIZONTAL;
		gbc_mileinput.gridx = 2;
		gbc_mileinput.gridy = 0;
		contentPane.add(mileinput, gbc_mileinput);
		mileinput.setColumns(10);

		JLabel kmlabel = new JLabel("Kilometer:");
		GridBagConstraints gbc_kmLabel = new GridBagConstraints();
		gbc_kmLabel.insets = new Insets(0, 0, 5, 5);
		gbc_kmLabel.gridx = 3;
		gbc_kmLabel.gridy = 0;
		contentPane.add(kmlabel, gbc_kmLabel);

		kminput = new JTextField();
		GridBagConstraints gbc_kminput = new GridBagConstraints();
		gbc_kminput.insets = new Insets(0, 0, 5, 0);
		gbc_kminput.fill = GridBagConstraints.HORIZONTAL;
		gbc_kminput.gridx = 4;
		gbc_kminput.gridy = 0;
		contentPane.add(kminput, gbc_kminput);
		kminput.setColumns(10);

		JLabel poundlabel = new JLabel("Pound:");
		GridBagConstraints gbc_poundLabel = new GridBagConstraints();
		gbc_poundLabel.insets = new Insets(0, 0, 5, 5);
		gbc_poundLabel.gridx = 1;
		gbc_poundLabel.gridy = 1;
		contentPane.add(poundlabel, gbc_poundLabel);

		poundinput = new JTextField();
		GridBagConstraints gbc_poundinput = new GridBagConstraints();
		gbc_poundinput.insets = new Insets(0, 0, 5, 5);
		gbc_poundinput.fill = GridBagConstraints.HORIZONTAL;
		gbc_poundinput.gridx = 2;
		gbc_poundinput.gridy = 1;
		contentPane.add(poundinput, gbc_poundinput);
		poundinput.setColumns(10);

		JLabel kglabel = new JLabel("Kilogram:");
		GridBagConstraints gbc_kgLabel = new GridBagConstraints();
		gbc_kgLabel.insets = new Insets(0, 0, 5, 5);
		gbc_kgLabel.gridx = 3;
		gbc_kgLabel.gridy = 1;
		contentPane.add(kglabel, gbc_kgLabel);

		kginput = new JTextField();
		GridBagConstraints gbc_kginput = new GridBagConstraints();
		gbc_kginput.insets = new Insets(0, 0, 5, 0);
		gbc_kginput.fill = GridBagConstraints.HORIZONTAL;
		gbc_kginput.gridx = 4;
		gbc_kginput.gridy = 1;
		contentPane.add(kginput, gbc_kginput);
		kginput.setColumns(10);

		JLabel gallonlabel = new JLabel("Gallon:");
		GridBagConstraints gbc_gallonLabel = new GridBagConstraints();
		gbc_gallonLabel.insets = new Insets(0, 0, 5, 5);
		gbc_gallonLabel.gridx = 1;
		gbc_gallonLabel.gridy = 2;
		contentPane.add(gallonlabel, gbc_gallonLabel);

		galloninput = new JTextField();
		GridBagConstraints gbc_galloninput = new GridBagConstraints();
		gbc_galloninput.insets = new Insets(0, 0, 5, 5);
		gbc_galloninput.fill = GridBagConstraints.HORIZONTAL;
		gbc_galloninput.gridx = 2;
		gbc_galloninput.gridy = 2;
		contentPane.add(galloninput, gbc_galloninput);
		galloninput.setColumns(10);

		JLabel literslabel = new JLabel("Liters:");
		GridBagConstraints gbc_literLabel = new GridBagConstraints();
		gbc_literLabel.insets = new Insets(0, 0, 5, 5);
		gbc_literLabel.gridx = 3;
		gbc_literLabel.gridy = 2;
		contentPane.add(literslabel, gbc_literLabel);

		literinput = new JTextField();
		GridBagConstraints gbc_literinput = new GridBagConstraints();
		gbc_literinput.insets = new Insets(0, 0, 5, 0);
		gbc_literinput.fill = GridBagConstraints.HORIZONTAL;
		gbc_literinput.gridx = 4;
		gbc_literinput.gridy = 2;
		contentPane.add(literinput, gbc_literinput);
		literinput.setColumns(10);

		JLabel farenlabel = new JLabel("Fahrenheit:");
		GridBagConstraints gbc_farenLabel = new GridBagConstraints();
		gbc_farenLabel.insets = new Insets(0, 0, 5, 5);
		gbc_farenLabel.gridx = 1;
		gbc_farenLabel.gridy = 3;
		contentPane.add(farenlabel, gbc_farenLabel);

		fareninput = new JTextField();
		GridBagConstraints gbc_fareninput = new GridBagConstraints();
		gbc_fareninput.insets = new Insets(0, 0, 5, 5);
		gbc_fareninput.fill = GridBagConstraints.HORIZONTAL;
		gbc_fareninput.gridx = 2;
		gbc_fareninput.gridy = 3;
		contentPane.add(fareninput, gbc_fareninput);
		fareninput.setColumns(10);

		JLabel centilabel = new JLabel("Centigrade:");
		GridBagConstraints gbc_centiLabel = new GridBagConstraints();
		gbc_centiLabel.insets = new Insets(0, 0, 5, 5);
		gbc_centiLabel.gridx = 3;
		gbc_centiLabel.gridy = 3;
		contentPane.add(centilabel, gbc_centiLabel);

		centiinput = new JTextField();
		GridBagConstraints gbc_centiinput = new GridBagConstraints();
		gbc_centiinput.insets = new Insets(0, 0, 5, 0);
		gbc_centiinput.fill = GridBagConstraints.HORIZONTAL;
		gbc_centiinput.gridx = 4;
		gbc_centiinput.gridy = 3;
		contentPane.add(centiinput, gbc_centiinput);
		centiinput.setColumns(10);

		JButton convertbutton = new JButton("convert");
		GridBagConstraints gbc_convertbutton = new GridBagConstraints();
		gbc_convertbutton.anchor = GridBagConstraints.WEST;
		gbc_convertbutton.insets = new Insets(0, 0, 5, 5);
		gbc_convertbutton.gridx = 3;
		gbc_convertbutton.gridy = 5;

		// adding action listener for convert button using lambda expression
		// ae represent ActionEvent
		convertbutton.addActionListener(ae -> {
			// capturing user inputs
			double miles = Double.parseDouble(mileinput.getText());
			double pounds = Double.parseDouble(poundinput.getText());
			double gallons = Double.parseDouble(galloninput.getText());
			double farenheits = Double.parseDouble(fareninput.getText());

			String kms = String.format("%.2f", miles * 1.60934);
			String kgs = String.format("%.2f", pounds * 0.453592);
			String litrs = String.format("%.2f", gallons * 3.78541);
			String cels = String.format("%.6f", ((farenheits - 32) * 5) / 9);

			kminput.setText(kms);
			kginput.setText(kgs);
			literinput.setText(litrs);
			centiinput.setText(cels);

		});

		contentPane.add(convertbutton, gbc_convertbutton);

		pack();
	}

}
