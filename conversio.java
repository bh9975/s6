import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Conversion extends JFrame
{
	private JLabel l1,l2,Bin,l3,Oct,l4,Hex;
	private JTextField txtDec;
	private JButton cal;

	public Conversion()
	{
		l1 = new JLabel("Decimal Number:");
		l2 = new JLabel("Binary Number:");
		l3 = new JLabel("Octal Number:");
		l4 = new JLabel("Hexadecimal Number:");

		txtDec = new JTextField();
		
		Bin = new JLabel();
		Oct = new JLabel();
		Hex = new JLabel();

		cal = new JButton("Calculate");

		setSize(400,200);
		setLayout(new GridLayout(5,2));
		add(l1);
		add(txtDec);
		add(l2);
		add(Bin);
		add(l3);
		add(Oct);
		add(l4);
		add(Hex);
		add(cal);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		cal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n = Integer.parseInt(txtDec.getText());
				Bin.setText(Integer.toBinaryString(n));
				Oct.setText(Integer.toOctalString(n));
				Hex.setText(Integer.toHexString(n));
			}
		});

	}

	public static void main(String args[])
	{
		new Conversion();
	}
}
