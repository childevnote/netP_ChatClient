import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class HomePage {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	public static final Color WHITE = new Color(255, 255, 255);
	public static final Color GREY = new Color(227, 228, 230);

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image img_icon = toolkit.getImage("src\\img\\img_icon.png");

	ImageIcon homeImg = new ImageIcon("src\\img\\home_FILL0.png");
	ImageIcon chatImg = new ImageIcon("src\\img\\chat_bubble.png");
	ImageIcon settingImg = new ImageIcon("src\\img\\settings_FILL0.png");
	ImageIcon logoutImg = new ImageIcon("src\\img\\logout.png");

	public HomePage(String[] idList, String conn_id) {
		JFrame frame = new JFrame("카카오톡");
		frame.setIconImage(img_icon);

		JPanel pnlBg = new JPanel();
		pnlBg.setBackground(WHITE);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);

		JPanel profListpnl = new JPanel();
		profListpnl.setBackground(WHITE);
		profListpnl.setLayout(new GridLayout(idList.length, 1));
		profListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(profListpnl);

		Friends master = new Friends(profListpnl, conn_id); // 로그인 유저 생성
		master.friend.setLayout(new FlowLayout(FlowLayout.LEFT));
		master.friend.setSize(380,70);
		Friends[] user = new Friends[10]; // 친구생성

		for (int i = 0; i < idList.length; i++) {
			if (conn_id != idList[i]) {
				user[i] = new Friends(profListpnl, "User " + idList[i]);
				user[i].friend.setSize(380, 70);
			}
		}

		JPanel chatListpnl = new JPanel();
		chatListpnl.setBackground(WHITE);
		chatListpnl.setLayout(null);
		chatListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(chatListpnl);

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(GREY);
		sidePanel.setForeground(WHITE);
		sidePanel.setLayout(null);
		sidePanel.setBounds(0, 0, 70, 650);
		pnlBg.add(sidePanel);

		JButton homeButton = new JButton(homeImg); // 프로필 리스트 버튼
		homeButton.setForeground(WHITE);
		homeButton.setBackground(GREY);
		homeButton.setBounds(0, 0, 70, 70);
		homeButton.setBorderPainted(false);
		homeButton.setFocusPainted(false);
		sidePanel.add(homeButton);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(true);
				chatListpnl.setVisible(false);
			}
		});

		JButton chatButton = new JButton(chatImg);// 채팅 리스트 버튼
		chatButton.setForeground(WHITE);
		chatButton.setBackground(GREY);
		chatButton.setBounds(0, 60, 70, 70);
		chatButton.setBorderPainted(false);
		chatButton.setFocusPainted(false);
		sidePanel.add(chatButton);
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(false);
				chatListpnl.setVisible(true);
			}
		});

		JButton settingButton = new JButton(settingImg); // 설정 버튼
		settingButton.setForeground(WHITE);
		settingButton.setBackground(GREY);
		settingButton.setBounds(0, 125, 70, 70);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);

		JButton logoutButton = new JButton(logoutImg);// 로그아웃 버튼
		logoutButton.setForeground(WHITE);
		logoutButton.setBackground(GREY);
		logoutButton.setBounds(0, 530, 70, 70);
		logoutButton.setBorderPainted(false);
		logoutButton.setFocusPainted(false);
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, conn_id + "님 로그아웃 하시겠습니까?", "로그아웃",
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
	}
}
