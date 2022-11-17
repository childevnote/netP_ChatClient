import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
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

	public HomePage(String conn_id) {
		JFrame frame = new JFrame("移댁뭅�삤�넚");
		frame.setIconImage(img_icon);
		
		JPanel pnlBg = new JPanel();
		pnlBg.setBackground(WHITE);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);
		
		JPanel profListpnl=new JPanel();
		profListpnl.setBackground(WHITE);
		profListpnl.setLayout(null);
		profListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(profListpnl);
		
		Friends master=new Friends(profListpnl, conn_id); //로그인 유저 생성
		master.friend.setBounds(0,0,380,70);
		Friends [] user=new Friends[10]; //친구생성
		for(int i=0; i<10; i++) {
			 user[i]=new Friends(profListpnl, "user"+i);
			 user[i].friend.setBounds(0,70*(i+1),380,70);
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

		JButton homeButton = new JButton(homeImg); // �봽濡쒗븘踰꾪듉
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

		JButton chatButton = new JButton(chatImg);// 梨꾪똿諛⑸쾭�듉
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

		JButton settingButton = new JButton(settingImg); // �꽕�젙 踰꾪듉
		settingButton.setForeground(WHITE);
		settingButton.setBackground(GREY);
		settingButton.setBounds(0, 125, 70, 70);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);

		JButton logoutButton = new JButton(logoutImg);// 濡쒓렇�븘�썐踰꾪듉
		logoutButton.setForeground(WHITE);
		logoutButton.setBackground(GREY);
		logoutButton.setBounds(0, 530, 70, 70);
		logoutButton.setBorderPainted(false);
		logoutButton.setFocusPainted(false);
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, conn_id + "�떂 濡쒓렇�븘�썐 �븯�떆寃좎뒿�땲源�?", "濡쒓렇�븘�썐",
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
