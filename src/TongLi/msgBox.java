package TongLi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class msgBox extends JFrame {

	private JPanel contentPane;
	private String strShow;
	private static String FONT = "Microsoft YaHei";
	
	JLabel lb_Message = new JLabel("");
	
	public String getStrShow() {
		return strShow;
	}

	public void setStrShow(String strShow) {
		this.strShow = strShow;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					msgBox frame = new msgBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public msgBox() {
		setTitle("提示窗");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 323, 272);
		setAlwaysOnTop(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lb_Message.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb_Message.setText("");
		lb_Message.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		lb_Message.setBounds(38, 30, 241, 101);
		contentPane.add(lb_Message);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {
		     dispose();
		    }
		   });
		btnNewButton.setFont(new Font(FONT, Font.PLAIN, 15));
		btnNewButton.setBounds(107, 141, 91, 47);
		contentPane.add(btnNewButton);
	}
	
	public void showStr(String str){
		lb_Message.setText(str);
		this.setVisible(true);
	}

}
