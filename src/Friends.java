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

public class Friends { //친구목록 생성 클래스
	public static final Color WHITE = new Color(255, 255, 255);
	ImageIcon userImg = new ImageIcon("src\\img\\account_circle.png");
	JPanel friend= new JPanel();
	
public Friends(JPanel profListpnl, String conn_id) {
	friend.setLayout(null);
	friend.setVisible(true);
	friend.setBackground(WHITE);
	
	JButton UserButton = new JButton(userImg); //프로필
	UserButton.setBounds(0, 0, 70, 70);
	UserButton.setBackground(WHITE);
	UserButton.setBorderPainted(false);
	UserButton.setFocusPainted(false);
	friend.add(UserButton);
	
	JLabel lblNewLabel = new JLabel(conn_id); //이름
	lblNewLabel.setFont(new Font("맑은고딕 Semilight", Font.BOLD, 15));
	lblNewLabel.setBounds(89, 35, 160, 15);
	friend.add(lblNewLabel);

	profListpnl.add(friend); 
}


}
