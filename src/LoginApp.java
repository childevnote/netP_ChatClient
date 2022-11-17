
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginApp {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	public static final String[] idList = { "a", "b", "c", "d", "e", "f", "g"};
	public static final int IDNUM = idList.length;
	String conn_id = null;
	Boolean idcheck = false;

	public LoginApp() {
		JFrame frame = new JFrame("로그인");
		JPanel pnlBg = new JPanel();
		JLabel lblImg = new JLabel("카카오톡이미지");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img_icon = toolkit.getImage("src\\img\\img_icon.png");

		ImageIcon img;

		JTextField insert_id = new JTextField();
		insert_id.setFont(new Font("맑은 고딕 Semilight", Font.ITALIC, 12));
		insert_id.setText("아이디");
		insert_id.setToolTipText("아이디");

		JButton loginbtn = new JButton("로그인");

		img = new ImageIcon("src\\img\\icon.png");
		lblImg = new JLabel(img);

		pnlBg.setBackground(YELLOW);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);
		frame.setIconImage(img_icon);

		lblImg.setSize(100, 100);
		lblImg.setBounds(175, 130, 100, 100);
		pnlBg.add(lblImg);

		insert_id.setBounds(125, 240, 200, 30);
		pnlBg.add(insert_id);

		loginbtn.setBounds(125, 310, 200, 40);
		loginbtn.setBackground(BROWN);
		loginbtn.setForeground(YELLOW);
		pnlBg.add(loginbtn);

		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < IDNUM; i++) {
					if (insert_id.getText().equals(idList[i])) {
						idcheck = true;
						conn_id = idList[i];
						break;
					}
				}
				if (idcheck) {
					JOptionPane.showMessageDialog(null, conn_id + "님, 환영합니다.", "로그인 성공",
							JOptionPane.INFORMATION_MESSAGE);
					new HomePage(idList, conn_id);
					frame.setVisible(false);

				} else {
					insert_id.setText("");
					JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.", "로그인 오류", JOptionPane.WARNING_MESSAGE);
				}

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

	}
}
