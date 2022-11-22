
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginApp extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	static final String ip_addr = "127.0.0.1";
	static final String port_no = "30000";

	JPanel pnlBg = new JPanel();
	JLabel lblImg = new JLabel("카카오톡이미지");
	JLabel info = new JLabel();
	JTextField insert_id = new JTextField();
	JButton loginbtn = new JButton("로그인");
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image img_icon = toolkit.getImage("src\\img\\img_icon.png");
	ImageIcon img;

	public LoginApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 650);
		setLocationRelativeTo(null);
		setResizable(false);

		insert_id.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 12));
		insert_id.setToolTipText("아이디");

		img = new ImageIcon("src\\img\\icon.png");
		lblImg = new JLabel(img);

		pnlBg.setBackground(YELLOW);
		pnlBg.setLayout(null);
		getContentPane().add(pnlBg);
		setIconImage(img_icon);

		lblImg.setBounds(175, 130, 100, 100);
		pnlBg.add(lblImg);

		info.setText("이름을 입력해주세요.");
		info.setBounds(125, 270, 200, 30);
		pnlBg.add(info);

		insert_id.setBounds(125, 240, 200, 30);
		pnlBg.add(insert_id);

		loginbtn.setBounds(125, 310, 200, 40);
		loginbtn.setBackground(BROWN);
		loginbtn.setForeground(YELLOW);
		pnlBg.add(loginbtn);

		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = insert_id.getText().trim();
				JOptionPane.showMessageDialog(null, username + "님, 환영합니다.", "로그인 성공", JOptionPane.INFORMATION_MESSAGE);
				new HomePage(username, ip_addr, port_no);
				setVisible(false);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginApp frame = new LoginApp();
					frame.setTitle("카카오톡");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
