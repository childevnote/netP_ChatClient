
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginApp {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);

	public LoginApp() {
		JFrame frame = new JFrame("·Î±×ÀÎ");
		JPanel pnlBg = new JPanel();
		JLabel lblImg = new JLabel("Ä«Ä«¿ÀÅåÀÌ¹ÌÁö");
		ImageIcon img;
		JTextField insert_id = new JTextField();
		insert_id.setFont(new Font("¸¼Àº °íµñ Semilight", Font.ITALIC, 12));
		insert_id.setText("\uC544\uC774\uB514");
		insert_id.setToolTipText("\uC544\uC774\uB514");
		JTextField insert_pw = new JTextField();
		insert_pw.setFont(new Font("¸¼Àº °íµñ Semilight", Font.ITALIC, 12));
		insert_pw.setText("\uBE44\uBC00\uBC88\uD638");
		insert_pw.setToolTipText("");
		JButton loginbtn = new JButton("·Î±×ÀÎ");

		img = new ImageIcon("src\\img\\icon.png");
		lblImg = new JLabel(img);

		pnlBg.setBackground(YELLOW);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);

		lblImg.setSize(100, 100);
		lblImg.setBounds(175, 130, 100, 100);
		pnlBg.add(lblImg);

		insert_id.setBounds(125, 240, 200, 30);
		pnlBg.add(insert_id);

		insert_pw.setBounds(125, 270, 200, 30);
		pnlBg.add(insert_pw);

		loginbtn.setBounds(125, 310, 200, 40);
		loginbtn.setBackground(BROWN);
		loginbtn.setForeground(YELLOW);
		pnlBg.add(loginbtn);

		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProfileList();
				frame.setVisible(false);
			}
		});

		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginApp();
		
		System.out.println("test");
	}
}
