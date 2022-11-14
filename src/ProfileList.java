import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProfileList {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	ImageIcon homeImg=new ImageIcon("src\\img\\home_FILL0.png");
	ImageIcon chatImg=new ImageIcon("src\\img\\chat_bubble.png");
	ImageIcon settingImg=new ImageIcon("src\\img\\settings_FILL0.png");
	
	public ProfileList() {
		JFrame frame = new JFrame("카카오톡");
		JPanel pnlBg = new JPanel();

		pnlBg.setBackground(new Color(255, 255, 255)); //왼쪽 사이드바
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 228, 230));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 66, 611);
		pnlBg.add(panel);
		
		JButton homeButton = new JButton(homeImg); //홈버튼
		homeButton.setForeground(new Color(255, 255, 255));
		homeButton.setBackground(new Color(227, 228, 230));
		homeButton.setBounds(0, 0, 66, 68);
		homeButton.setBorderPainted(false);
		homeButton.setFocusPainted(false);
		pnlBg.add(homeButton);
		
		JButton chatButton=new JButton(chatImg);//채팅방 버튼
		chatButton.setForeground(new Color(255, 255, 255));
		chatButton.setBackground(new Color(227, 228, 230));
		chatButton.setBounds(0, 69, 66, 68);
		chatButton.setBorderPainted(false);
		chatButton.setFocusPainted(false);
		pnlBg.add(chatButton);
		
		JButton settingButton=new JButton(settingImg);//설정 버튼
		settingButton.setForeground(new Color(255, 255, 255));
		settingButton.setBackground(new Color(227, 228, 230));
		settingButton.setBounds(0, 129, 66, 68);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		pnlBg.add(settingButton);
		
		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
