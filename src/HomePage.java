import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HomePage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Socket socket; // 연결소켓
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Vector user_vc;
	public String UserName = "";
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	public static final Color WHITE = new Color(255, 255, 255);
	public static final Color GREY = new Color(227, 228, 230);

	ImageIcon homeImg = new ImageIcon("src\\img\\home_FILL0.png");
	ImageIcon chatImg = new ImageIcon("src\\img\\chat_bubble.png");
	ImageIcon settingImg = new ImageIcon("src\\img\\settings_FILL0.png");
	ImageIcon logoutImg = new ImageIcon("src\\img\\logout.png");
	ImageIcon chatplusImg = new ImageIcon("src\\img\\chat_plus.png");

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image img_icon = toolkit.getImage("src\\img\\img_icon.png");
	JFrame frame = new JFrame("카카오톡");
	JPanel profListpnl = new JPanel();
	JPanel chatListpnl = new JPanel();
	JButton chatPlusBtn = new JButton(chatplusImg);
	JPanel settingpnl = new JPanel();
	JLabel test = new JLabel("설정 페이지 입니다.");
	JPanel sidePanel = new JPanel();
	JButton homeButton = new JButton(homeImg); // 프로필 리스트 버튼
	JButton chatButton = new JButton(chatImg);// 채팅 리스트 버튼
	JButton settingButton = new JButton(settingImg); // 설정 버튼
	JButton logoutButton = new JButton(logoutImg);// 로그아웃 버튼

	public HomePage(String username, String ip_addr, String port_no) {
		frame.setIconImage(img_icon);

		JPanel pnlBg = new JPanel();
		pnlBg.setBackground(WHITE);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);

		profListpnl.setBackground(WHITE);
		profListpnl.setBounds(70, 0, 380, 650);
		profListpnl.setLayout(null);
		pnlBg.add(profListpnl);

		Friends master = new Friends(profListpnl, username); // 로그인 유저 생성
		master.friend.setBackground(new Color(255, 255, 153));

//		for (int i = 0; i < user_vc.size(); i++) {
//			UserService user = (UserService) user_vc.elementAt(i);
//			Friends friends = new Friends(profListpnl, user.UserName);
//			friends.friend.setBackground(new Color(255, 255, 153));
//		}

		chatListpnl.setBackground(WHITE);
		chatListpnl.setLayout(null);
		chatListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(chatListpnl);

		chatPlusBtn.setBackground(null);
		chatPlusBtn.setBounds(300, 540, 50, 50);
		chatPlusBtn.setBorderPainted(false);
		chatPlusBtn.setFocusPainted(false);
		chatListpnl.add(chatPlusBtn);
		chatPlusBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		settingpnl.setBackground(WHITE);
		settingpnl.setLayout(null);
		settingpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(settingpnl);

		test.setBounds(0, 0, 300, 30);
		settingpnl.add(test);

		sidePanel.setBackground(GREY);
		sidePanel.setLayout(null);
		sidePanel.setBounds(0, 0, 70, 650);
		pnlBg.add(sidePanel);

		homeButton.setBackground(null);
		homeButton.setBounds(0, 0, 70, 70);
		homeButton.setBorderPainted(false);
		homeButton.setFocusPainted(false);
		sidePanel.add(homeButton);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chatListpnl.setVisible(false);
				settingpnl.setVisible(false);
				profListpnl.setVisible(true);
			}
		});

		chatButton.setBackground(null);
		chatButton.setBounds(0, 60, 70, 70);
		chatButton.setBorderPainted(false);
		chatButton.setFocusPainted(false);
		sidePanel.add(chatButton);
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(false);
				settingpnl.setVisible(false);
				chatListpnl.setVisible(true);
			}
		});

		settingButton.setBackground(null);
		settingButton.setBounds(0, 125, 70, 70);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);
		settingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(false);
				chatListpnl.setVisible(false);
				settingpnl.setVisible(true);
			}
		});

		logoutButton.setBackground(null);
		logoutButton.setBounds(0, 530, 70, 70);
		logoutButton.setBorderPainted(false);
		logoutButton.setFocusPainted(false);
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, username + "님 로그아웃 하시겠습니까?", "로그아웃",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					new LoginApp();
					frame.setVisible(false);
				}
			}
		});

		sidePanel.add(logoutButton);

		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		try {
			socket = new Socket(ip_addr, Integer.parseInt(port_no));
//			is = socket.getInputStream();
//			dis = new DataInputStream(is);
//			os = socket.getOutputStream();
//			dos = new DataOutputStream(os);

			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());

			// SendMessage("/login " + UserName);

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
