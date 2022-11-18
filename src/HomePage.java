import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
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
	ImageIcon chatplusImg = new ImageIcon("src\\img\\chat_plus.png");

	public HomePage(String[] idList, String conn_id) {
		JFrame frame = new JFrame("카카오톡");
		frame.setIconImage(img_icon);

		JPanel pnlBg = new JPanel();
		pnlBg.setBackground(WHITE);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);

		JPanel profListpnl = new JPanel();
		profListpnl.setBackground(WHITE);
		profListpnl.setBounds(70, 0, 380, 650);
		profListpnl.setLayout(null);
		pnlBg.add(profListpnl);

		Friends master = new Friends(profListpnl, conn_id); // 로그인 유저 생성
		master.friend.setBackground(new Color(255, 255, 153));
		Friends[] user = new Friends[idList.length]; // 친구생성
		int id_idx = 0;
		for (int i = 0; i < idList.length; i++) {
			if (conn_id == idList[i])
				id_idx = i;
		}
		for (int i = id_idx; i < idList.length - 1; i++) {
			idList[i] = idList[i + 1];
		}
		for (int i = 0; i < idList.length - 1; i++) {
			user[i] = new Friends(profListpnl, "User " + idList[i]);
			user[i].friend.setBounds(0, 70 * (i + 1), 380, 70);
		}
		JPanel chatListpnl = new JPanel();
		chatListpnl.setBackground(WHITE);
		chatListpnl.setLayout(null);
		chatListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(chatListpnl);

		JButton chatPlusBtn = new JButton(chatplusImg);
		chatPlusBtn.setBackground(null);
		chatPlusBtn.setBounds(300, 540, 50, 50);
		chatPlusBtn.setBorderPainted(false);
		chatPlusBtn.setFocusPainted(false);
		chatListpnl.add(chatPlusBtn);

		JPanel settingpnl = new JPanel();
		settingpnl.setBackground(WHITE);
		settingpnl.setLayout(null);
		settingpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(settingpnl);

		JLabel test = new JLabel("설정 페이지 입니다.");
		test.setBounds(0, 0, 300, 30);
		settingpnl.add(test);

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(GREY);
		sidePanel.setLayout(null);
		sidePanel.setBounds(0, 0, 70, 650);
		pnlBg.add(sidePanel);

		JButton homeButton = new JButton(homeImg); // 프로필 리스트 버튼
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

		JButton chatButton = new JButton(chatImg);// 채팅 리스트 버튼
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

		JButton settingButton = new JButton(settingImg); // 설정 버튼
		settingButton.setBackground(null);
		settingButton.setBounds(0, 125, 70, 70);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(false);
				chatListpnl.setVisible(false);
				settingpnl.setVisible(true);
			}
		});

		JButton logoutButton = new JButton(logoutImg);// 로그아웃 버튼
		logoutButton.setBackground(null);
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
