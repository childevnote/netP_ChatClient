
import java.awt.*;
import javax.swing.*;

public class LoginApp {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("카카오톡");
		JPanel pnlBg = new JPanel();
		JLabel lblImg = new JLabel("카카오톡이미지");
		ImageIcon img;
		JTextField insert_id = new JTextField();
		JTextField insert_pw = new JTextField();
		JButton loginbtn = new JButton("로그인");

		img = new ImageIcon("src\\img\\icon.png");
		lblImg = new JLabel(img);

		pnlBg.setBackground(YELLOW);
		pnlBg.setLayout(null);
		frame.add(pnlBg);

		lblImg.setSize(100, 100);
		lblImg.setBounds(175, 130, 100, 100);
		pnlBg.add(lblImg);

		insert_id.setBounds(125, 240, 200, 30);
		insert_id.setText("아이디를 입력하세요.");
		pnlBg.add(insert_id);

		insert_pw.setBounds(125, 270, 200, 30);
		insert_pw.setText("비밀번호를 입력하세요.");
		pnlBg.add(insert_pw);

		loginbtn.setBounds(125, 310, 200, 40);
		loginbtn.setBackground(BROWN);
		loginbtn.setForeground(YELLOW);
		pnlBg.add(loginbtn);

		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
