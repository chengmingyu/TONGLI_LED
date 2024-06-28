package TongLi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class subA_show extends JFrame {
	public subA_show() {
	}
	private static final int MEMBER_MAX = 12;
	private static final String FONT_STYLE = "Microsoft YaHei";
	private JPanel contentPane;
	public JLabel[] lb_Num  = new JLabel[MEMBER_MAX];
	public JLabel[] lb_Name  = new JLabel[MEMBER_MAX];
	public JLabel[] lb_Goal  = new JLabel[MEMBER_MAX];
	public JLabel[] lb_Foul  = new JLabel[MEMBER_MAX];
	subPingMu subA_Ping = new subPingMu();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					team t = new team();
					String [] strTmp1 = new String[MEMBER_MAX];
					String [] strTmp2 = new String[MEMBER_MAX];
					String [] strTmp3= new String[MEMBER_MAX];
					String [] strTmp4 = new String[MEMBER_MAX];
					t.init();
					readManger.LoadTeam("a.txt", t);
					subPingMu tmp_Ping = new subPingMu();
					tmp_Ping.init();
					for (int p = 0; p < MEMBER_MAX; p++){
						strTmp1[p] = t.player[p].getPlayerNo();
						strTmp2[p] = t.player[p].getPlayerName();
	//					strTmp3[p] = getFoulToString(t.player[p].getPlayerFoull());
						strTmp4[p] = String.valueOf(t.player[p].getPlayerGoal());
					}
					tmp_Ping.setStrPlayerNo(strTmp1);
					tmp_Ping.setStrPlayerName(strTmp2);
					tmp_Ping.setStrPlayerGoal(strTmp4);
					tmp_Ping.setStrPlayerFoul(strTmp3);
					
					subA_show frame = new subA_show();
					//frame.setVisible(true);
					frame.getPingMu(tmp_Ping);
					frame.run();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void getPingMu(subPingMu sub){
		//subA_Ping.init();
		subA_Ping.setStrPlayerNo(sub.getStrPlayerNo());
		subA_Ping.setStrPlayerName(sub.getStrPlayerName());
		subA_Ping.setStrPlayerGoal(sub.getStrPlayerGoal());
		subA_Ping.setStrPlayerFoul(sub.getStrPlayerFoul());
	}
	
	// 设置分数
	public void setGoal(String strNum, String value){
		for (int i=0;i< MEMBER_MAX ; i++){
			if (strNum == subA_Ping.getStrPlayerNo()[i]){
				lb_Goal[i].setText(value);
			}
		}	
	}
	// 设置犯规
	public void setFoull(String strNum, String value){
		for (int i=0;i< MEMBER_MAX ; i++){
			if (strNum == subA_Ping.getStrPlayerNo()[i]){
				lb_Foul[i].setText(value);
			}
		}	
	}	
	/**
	 * Create the frame.
	 */
	public void run() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//屏幕显示位置
//		setBounds(236, 75, 160, 245);
		setBounds(0, 60, 250, 324);
		setAlwaysOnTop(true);
		setUndecorated(true);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		int iXp_Num = 10;
//		int iYp_Num = 2;
//		int iWidth_Num = 20;
//		int iHeight_Num = 20;
//		
//		int iXp_Name = 30;
//		int iYp_Name = 2;
//		int iWidth_Name = 50;
//		int iHeight_Name = 20;
//		
//		int iXp_Foul = 87;
//		int iYp_Foul = 2;
//		int iWidth_Foul = 50;
//		int iHeight_Foul = 20;
//		
//		int iXp_Goal = 140;
//		int iYp_Goal = 2;
//		int iWidth_Goal = 20;
//		int iHeight_Goal = 20;
//		
		
		int x = 8;
		
		//共通起始Y坐标
		int comm_x = 3;
		
		//字号
		int fontSize = 16;
		
		int iXp_Num = 10;
		int iYp_Num = comm_x;
		int iWidth_Num = 35 - x;
		int iHeight_Num = 34 - x;
		
		int iXp_Name = 45;
		int iYp_Name = comm_x;
		int iWidth_Name = 65 - x;
		int iHeight_Name = 34 - x;
		
		int iXp_Foul = 135;
		int iYp_Foul = comm_x;
		int iWidth_Foul = 65;
		int iHeight_Foul = 34 - x;
		
		int iXp_Goal = 220;
		int iYp_Goal = comm_x;
		int iWidth_Goal = 35;
		int iHeight_Goal = 34 - x;
		
		for (int i = 0; i < MEMBER_MAX ; i++){
			//System.out.println(subA_Ping.getStrPlayerNo()[i]);
			//  队员号码
			lb_Num[i] = new JLabel("");
			lb_Num[i].setText(subA_Ping.getStrPlayerNo()[i]);
			lb_Num[i].setFont(new Font(FONT_STYLE, Font.PLAIN, fontSize));
			lb_Num[i].setForeground(Color.RED);
			lb_Num[i].setBounds(iXp_Num,iYp_Num+iHeight_Num*i , iWidth_Num, iHeight_Num);
			contentPane.add(lb_Num[i]);
			//System.out.println(lb_Num[i].getText());
			//  队员姓名
			lb_Name[i] = new JLabel("");
			lb_Name[i].setText(subA_Ping.getStrPlayerName()[i]);
			lb_Name[i].setFont(new Font(FONT_STYLE, Font.PLAIN,fontSize));
			lb_Name[i].setForeground(Color.RED);
			lb_Name[i].setBounds(iXp_Name, iYp_Name+iHeight_Name*i, iWidth_Name, iHeight_Name);
			contentPane.add(lb_Name[i]);
			
			//  队员犯规次数
			lb_Foul[i] = new JLabel("");
			lb_Foul[i].setText(subA_Ping.getStrPlayerFoul()[i]);
			lb_Foul[i].setFont(new Font("Courier New", Font.PLAIN,fontSize));
			lb_Foul[i].setForeground(Color.RED);
			lb_Foul[i].setBounds(iXp_Foul, iYp_Foul+iHeight_Foul*i, iWidth_Foul, iHeight_Foul);
			contentPane.add(lb_Foul[i]);
			
			//  队员得分
			lb_Goal[i] = new JLabel("");
			lb_Goal[i].setText(subA_Ping.getStrPlayerGoal()[i]);
			lb_Goal[i].setFont(new Font(FONT_STYLE, Font.PLAIN, fontSize));
			lb_Goal[i].setForeground(Color.RED);
			lb_Goal[i].setBounds(iXp_Goal, iYp_Goal+iHeight_Goal*i, iWidth_Goal, iHeight_Goal);
			contentPane.add(lb_Goal[i]);
			
			if (i < 5){
				lb_Num[i].setForeground(Color.YELLOW);
				lb_Name[i].setForeground(Color.YELLOW);
				lb_Foul[i].setForeground(Color.YELLOW);
				lb_Goal[i].setForeground(Color.YELLOW);
			}
		}
		
	}
	
	public void refresh(){
		for (int i = 0; i < MEMBER_MAX ; i++){
			if (i < 5){
				lb_Num[i].setForeground(Color.YELLOW);
				lb_Name[i].setForeground(Color.YELLOW);
				lb_Foul[i].setForeground(Color.YELLOW);
				lb_Goal[i].setForeground(Color.YELLOW);
			}
			lb_Num[i].setText(subA_Ping.getStrPlayerNo()[i]);
			lb_Name[i].setText(subA_Ping.getStrPlayerName()[i]);
			lb_Foul[i].setText(subA_Ping.getStrPlayerFoul()[i]);
			lb_Goal[i].setText(subA_Ping.getStrPlayerGoal()[i]);
		}
	}
	
	

}
