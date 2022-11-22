import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Friends { // ģ����� ���� Ŭ����
	public static final Color WHITE = new Color(255, 255, 255);
	ImageIcon userImg = new ImageIcon("src\\img\\account_circle.png");
	JPanel friend = new JPanel();

	public Friends(JPanel profListpnl, String username) {
		friend.setLayout(new FlowLayout(FlowLayout.LEFT));
		friend.setSize(380, 70);
		friend.setVisible(true);
		friend.setBackground(WHITE);

		JButton UserButton = new JButton(userImg); // ������
		UserButton.setSize(70, 70);
		UserButton.setBackground(null);
		UserButton.setBorderPainted(false);
		UserButton.setFocusPainted(false);
		friend.add(UserButton);

		JLabel lblNewLabel = new JLabel(username); // �̸�
		lblNewLabel.setFont(new Font("������� Semilight", Font.BOLD, 15));
		lblNewLabel.setSize(160, 30);
		friend.add(lblNewLabel);

		profListpnl.add(friend);
	}

}
