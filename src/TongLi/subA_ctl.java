package TongLi;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.TabableView;
//import javax.swing.Checkbox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.geom.FlatteningPathIterator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class subA_ctl extends JFrame {

	private JPanel contentPane;
	private JTextField tf_Goal_0;
	private JTextField tf_Foul_0;
	private JTextField tf_Goal_1;
	private JTextField tf_Foul_1;
	private JTextField tf_Goal_2;
	private JTextField tf_Foul_2;
	private JTextField tf_Goal_3;
	private JTextField tf_Foul_3;
	private JTextField tf_Goal_4;
	private JTextField tf_Foul_4;
	private JTextField tf_Goal_5;
	private JTextField tf_Foul_5;
	private JTextField tf_Goal_6;
	private JTextField tf_Foul_6;
	private JTextField tf_Goal_7;
	private JTextField tf_Foul_7;
	private JTextField tf_Goal_8;
	private JTextField tf_Foul_8;
	private JTextField tf_Goal_9;
	private JTextField tf_Foul_9;
	private JTextField tf_Goal_10;
	private JTextField tf_Foul_10;
	private JTextField tf_Goal_11;
	private JTextField tf_Foul_11;
	
	private JLabel lb_Num_0;
	private JLabel lb_Num_1;
	private JLabel lb_Num_2;
	private JLabel lb_Num_3;
	private JLabel lb_Num_4;
	private JLabel lb_Num_5;
	private JLabel lb_Num_6;
	private JLabel lb_Num_7;
	private JLabel lb_Num_8;
	private JLabel lb_Num_9;
	private JLabel lb_Num_10;
	private JLabel lb_Num_11;
	private JLabel lb_Name_0;
	private JLabel lb_Name_1;
	private JLabel lb_Name_2;
	private JLabel lb_Name_3;
	private JLabel lb_Name_4;
	private JLabel lb_Name_5;
	private JLabel lb_Name_6;
	private JLabel lb_Name_7;
	private JLabel lb_Name_8;
	private JLabel lb_Name_9;
	private JLabel lb_Name_10;
	private JLabel lb_Name_11;
	
	private JButton btn_Goal_P_0;
	private JButton btn_Goal_P_1;
	private JButton btn_Goal_P_2;
	private JButton btn_Goal_P_3;
	private JButton btn_Goal_P_4;
	private JButton btn_Goal_P_5;
	private JButton btn_Goal_P_6;
	private JButton btn_Goal_P_7;
	private JButton btn_Goal_P_8;
	private JButton btn_Goal_P_9;
	private JButton btn_Goal_P_10;
	private JButton btn_Goal_P_11;
	private JButton btn_Goal_M_0;
	private JButton btn_Goal_M_1;
	private JButton btn_Goal_M_2;
	private JButton btn_Goal_M_3;
	private JButton btn_Goal_M_4;
	private JButton btn_Goal_M_5;
	private JButton btn_Goal_M_6;
	private JButton btn_Goal_M_7;
	private JButton btn_Goal_M_8;
	private JButton btn_Goal_M_9;
	private JButton btn_Goal_M_10;
	private JButton btn_Goal_M_11;
	
	private JButton btn_Foul_P_0;
	private JButton btn_Foul_P_1;
	private JButton btn_Foul_P_2;
	private JButton btn_Foul_P_3;
	private JButton btn_Foul_P_4;
	private JButton btn_Foul_P_5;
	private JButton btn_Foul_P_6;
	private JButton btn_Foul_P_7;
	private JButton btn_Foul_P_8;
	private JButton btn_Foul_P_9;
	private JButton btn_Foul_P_10;
	private JButton btn_Foul_P_11;
	private JButton btn_Foul_M_0;
	private JButton btn_Foul_M_1;
	private JButton btn_Foul_M_2;
	private JButton btn_Foul_M_3;
	private JButton btn_Foul_M_4;
	private JButton btn_Foul_M_5;
	private JButton btn_Foul_M_6;
	private JButton btn_Foul_M_7;
	private JButton btn_Foul_M_8;
	private JButton btn_Foul_M_9;
	private JButton btn_Foul_M_10;
	private JButton btn_Foul_M_11;
	
	
	
//	private team TeamA;
	
	private static int iNum = 0;
	private static final int MAXPLAYER = 5;
	private static final int MAXFOUL = 6;
	private static final int MEMBER_MAX = 12;
	private static final String FILEPATH = "C:\\TONGLI\\a.txt";
	private static final String FONT_STYLE = "Microsoft YaHei";
	team TeamA = new team();
	team TeamA_Show = new team();
	subPingMu PINGMU  = new subPingMu();
	subA_show SP = new subA_show();
	int iTmp = 0;
	private JButton btn_show;
	public int iStartFlg = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subA_ctl frame = new subA_ctl();
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
	public subA_ctl() {
		setTitle("主队控制台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 450, 410, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		TeamA.init();
		TeamA_Show.init();
		// 载入球队信息
		TeamA.init();
		readManger.LoadTeam(FILEPATH, TeamA);
		//readManger.makeShowTeam(TeamA,TeamA_Show);
		//TeamA_Show = TeamA;
		makeSubPing(TeamA,PINGMU);
		
		
		Checkbox cb_0 = new Checkbox("");
		cb_0.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (checkPlayerNum(cb_0) == true){
					if (cb_0.getState() == true){
						lb_Num_0.setForeground(Color.RED);
						lb_Name_0.setForeground(Color.RED);
						tf_Goal_0.setEditable(true);
						tf_Foul_0.setEditable(true);
						btn_Goal_P_0.setEnabled(true);
						btn_Goal_M_0.setEnabled(true);
						btn_Foul_P_0.setEnabled(true);
						btn_Foul_M_0.setEnabled(true);
						TeamA.player[0].setPlayerStatus(1);
					}else{
						lb_Num_0.setForeground(Color.BLACK);
						lb_Name_0.setForeground(Color.BLACK);
						tf_Goal_0.setEditable(false);
						tf_Foul_0.setEditable(false);
						btn_Goal_P_0.setEnabled(false);
						btn_Goal_M_0.setEnabled(false);
						btn_Foul_P_0.setEnabled(false);
						btn_Foul_M_0.setEnabled(false);
						TeamA.player[0].setPlayerStatus(0);
					}
				}
			}
		});

		cb_0.setBounds(8, 36, 21, 21);
		contentPane.add(cb_0);
		
		Checkbox cb_1 = new Checkbox("");
		cb_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_1) == true) {
					if (cb_1.getState() == true) {
						lb_Num_1.setForeground(Color.RED);
						lb_Name_1.setForeground(Color.RED);
						tf_Goal_1.setEditable(true);
						tf_Foul_1.setEditable(true);
						btn_Goal_P_1.setEnabled(true);
						btn_Goal_M_1.setEnabled(true);
						btn_Foul_P_1.setEnabled(true);
						btn_Foul_M_1.setEnabled(true);
						TeamA.player[1].setPlayerStatus(1);
					} else {
						lb_Num_1.setForeground(Color.BLACK);
						lb_Name_1.setForeground(Color.BLACK);
						tf_Goal_1.setEditable(false);
						tf_Foul_1.setEditable(false);
						btn_Goal_P_1.setEnabled(false);
						btn_Goal_M_1.setEnabled(false);
						btn_Foul_P_1.setEnabled(false);
						btn_Foul_M_1.setEnabled(false);
						TeamA.player[1].setPlayerStatus(0);
					}
				}
			}
		});
		cb_1.setBounds(8, 71, 21, 21);
		contentPane.add(cb_1);
		
		Checkbox cb_2 = new Checkbox("");
		cb_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_2) == true) {
					if (cb_2.getState() == true) {
						lb_Num_2.setForeground(Color.RED);
						lb_Name_2.setForeground(Color.RED);
						tf_Goal_2.setEditable(true);
						tf_Foul_2.setEditable(true);
						btn_Goal_P_2.setEnabled(true);
						btn_Goal_M_2.setEnabled(true);
						btn_Foul_P_2.setEnabled(true);
						btn_Foul_M_2.setEnabled(true);
						TeamA.player[2].setPlayerStatus(1);
					} else {
						lb_Num_2.setForeground(Color.BLACK);
						lb_Name_2.setForeground(Color.BLACK);
						tf_Goal_2.setEditable(false);
						tf_Foul_2.setEditable(false);
						btn_Goal_P_2.setEnabled(false);
						btn_Goal_M_2.setEnabled(false);
						btn_Foul_P_2.setEnabled(false);
						btn_Foul_M_2.setEnabled(false);
						TeamA.player[2].setPlayerStatus(0);
					}
				}
			}
		});
		cb_2.setBounds(8, 106, 21, 21);
		contentPane.add(cb_2);
		
		Checkbox cb_3 = new Checkbox("");
		cb_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_3) == true) {
					if (cb_3.getState() == true) {
						lb_Num_3.setForeground(Color.RED);
						lb_Name_3.setForeground(Color.RED);
						tf_Goal_3.setEditable(true);
						tf_Foul_3.setEditable(true);
						btn_Goal_P_3.setEnabled(true);
						btn_Goal_M_3.setEnabled(true);
						btn_Foul_P_3.setEnabled(true);
						btn_Foul_M_3.setEnabled(true);
						TeamA.player[3].setPlayerStatus(1);
					} else {
						lb_Num_3.setForeground(Color.BLACK);
						lb_Name_3.setForeground(Color.BLACK);
						tf_Goal_3.setEditable(false);
						tf_Foul_3.setEditable(false);
						btn_Goal_P_3.setEnabled(false);
						btn_Goal_M_3.setEnabled(false);
						btn_Foul_P_3.setEnabled(false);
						btn_Foul_M_3.setEnabled(false);
						TeamA.player[3].setPlayerStatus(0);
					}
				}
			}
		});
		cb_3.setBounds(8, 141, 21, 21);
		contentPane.add(cb_3);
		
		Checkbox cb_4 = new Checkbox("");
		cb_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_4) == true) {
					if (cb_4.getState() == true) {
						lb_Num_4.setForeground(Color.RED);
						lb_Name_4.setForeground(Color.RED);
						tf_Goal_4.setEditable(true);
						tf_Foul_4.setEditable(true);
						btn_Goal_P_4.setEnabled(true);
						btn_Goal_M_4.setEnabled(true);
						btn_Foul_P_4.setEnabled(true);
						btn_Foul_M_4.setEnabled(true);
						TeamA.player[4].setPlayerStatus(1);
					} else {
						lb_Num_4.setForeground(Color.BLACK);
						lb_Name_4.setForeground(Color.BLACK);
						tf_Goal_4.setEditable(false);
						tf_Foul_4.setEditable(false);
						btn_Goal_P_4.setEnabled(false);
						btn_Goal_M_4.setEnabled(false);
						btn_Foul_P_4.setEnabled(false);
						btn_Foul_M_4.setEnabled(false);
						TeamA.player[4].setPlayerStatus(0);
					}
				}
			}
		});
		cb_4.setBounds(8, 176, 21, 21);
		contentPane.add(cb_4);
		
		Checkbox cb_5 = new Checkbox("");
		cb_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_5) == true) {
					if (cb_5.getState() == true) {
						lb_Num_5.setForeground(Color.RED);
						lb_Name_5.setForeground(Color.RED);
						tf_Goal_5.setEditable(true);
						tf_Foul_5.setEditable(true);
						btn_Goal_P_5.setEnabled(true);
						btn_Goal_M_5.setEnabled(true);
						btn_Foul_P_5.setEnabled(true);
						btn_Foul_M_5.setEnabled(true);
						TeamA.player[5].setPlayerStatus(1);
					} else {
						lb_Num_5.setForeground(Color.BLACK);
						lb_Name_5.setForeground(Color.BLACK);
						tf_Goal_5.setEditable(false);
						tf_Foul_5.setEditable(false);
						btn_Goal_P_5.setEnabled(false);
						btn_Goal_M_5.setEnabled(false);
						btn_Foul_P_5.setEnabled(false);
						btn_Foul_M_5.setEnabled(false);
						TeamA.player[5].setPlayerStatus(0);
					}
				}
			}
		});
		cb_5.setBounds(8, 211, 21, 21);
		contentPane.add(cb_5);
		
		Checkbox cb_6 = new Checkbox("");
		cb_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_6) == true) {
					if (cb_6.getState() == true) {
						lb_Num_6.setForeground(Color.RED);
						lb_Name_6.setForeground(Color.RED);
						tf_Goal_6.setEditable(true);
						tf_Foul_6.setEditable(true);
						btn_Goal_P_6.setEnabled(true);
						btn_Goal_M_6.setEnabled(true);
						btn_Foul_P_6.setEnabled(true);
						btn_Foul_M_6.setEnabled(true);
						TeamA.player[6].setPlayerStatus(1);
					} else {
						lb_Num_6.setForeground(Color.BLACK);
						lb_Name_6.setForeground(Color.BLACK);
						tf_Goal_6.setEditable(false);
						tf_Foul_6.setEditable(false);
						btn_Goal_P_6.setEnabled(false);
						btn_Goal_M_6.setEnabled(false);
						btn_Foul_P_6.setEnabled(false);
						btn_Foul_M_6.setEnabled(false);
						TeamA.player[6].setPlayerStatus(0);
					}
				}
			}
		});
		cb_6.setBounds(8, 246, 21, 21);
		contentPane.add(cb_6);
		
		Checkbox cb_7 = new Checkbox("");
		cb_7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_7) == true) {
					if (cb_7.getState() == true) {
						lb_Num_7.setForeground(Color.RED);
						lb_Name_7.setForeground(Color.RED);
						tf_Goal_7.setEditable(true);
						tf_Foul_7.setEditable(true);
						btn_Goal_P_7.setEnabled(true);
						btn_Goal_M_7.setEnabled(true);
						btn_Foul_P_7.setEnabled(true);
						btn_Foul_M_7.setEnabled(true);
						TeamA.player[7].setPlayerStatus(1);
					} else {
						lb_Num_7.setForeground(Color.BLACK);
						lb_Name_7.setForeground(Color.BLACK);
						tf_Goal_7.setEditable(false);
						tf_Foul_7.setEditable(false);
						btn_Goal_P_7.setEnabled(false);
						btn_Goal_M_7.setEnabled(false);
						btn_Foul_P_7.setEnabled(false);
						btn_Foul_M_7.setEnabled(false);
						TeamA.player[7].setPlayerStatus(0);
					}
				}
			}
		});
		cb_7.setBounds(8, 281, 21, 21);
		contentPane.add(cb_7);
		
		Checkbox cb_8 = new Checkbox("");
		cb_8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_8) == true) {
					if (cb_8.getState() == true) {
						lb_Num_8.setForeground(Color.RED);
						lb_Name_8.setForeground(Color.RED);
						tf_Goal_8.setEditable(true);
						tf_Foul_8.setEditable(true);
						btn_Goal_P_8.setEnabled(true);
						btn_Goal_M_8.setEnabled(true);
						btn_Foul_P_8.setEnabled(true);
						btn_Foul_M_8.setEnabled(true);
						TeamA.player[8].setPlayerStatus(1);
					} else {
						lb_Num_8.setForeground(Color.BLACK);
						lb_Name_8.setForeground(Color.BLACK);
						tf_Goal_8.setEditable(false);
						tf_Foul_8.setEditable(false);
						btn_Goal_P_8.setEnabled(false);
						btn_Goal_M_8.setEnabled(false);
						btn_Foul_P_8.setEnabled(false);
						btn_Foul_M_8.setEnabled(false);
						TeamA.player[8].setPlayerStatus(0);
					}
				}
			}
		});
		cb_8.setBounds(8, 316, 21, 21);
		contentPane.add(cb_8);
		
		Checkbox cb_9 = new Checkbox("");
		cb_9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_9) == true) {
					if (cb_9.getState() == true) {
						lb_Num_9.setForeground(Color.RED);
						lb_Name_9.setForeground(Color.RED);
						tf_Goal_9.setEditable(true);
						tf_Foul_9.setEditable(true);
						btn_Goal_P_9.setEnabled(true);
						btn_Goal_M_9.setEnabled(true);
						btn_Foul_P_9.setEnabled(true);
						btn_Foul_M_9.setEnabled(true);
						TeamA.player[9].setPlayerStatus(1);
					} else {
						lb_Num_9.setForeground(Color.BLACK);
						lb_Name_9.setForeground(Color.BLACK);
						tf_Goal_9.setEditable(false);
						tf_Foul_9.setEditable(false);
						btn_Goal_P_9.setEnabled(false);
						btn_Goal_M_9.setEnabled(false);
						btn_Foul_P_9.setEnabled(false);
						btn_Foul_M_9.setEnabled(false);
						TeamA.player[9].setPlayerStatus(0);
					}
				}
			}
		});
		cb_9.setBounds(8, 351, 21, 21);
		contentPane.add(cb_9);
		
		Checkbox cb_10 = new Checkbox("");
		cb_10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_10) == true) {
					if (cb_10.getState() == true) {
						lb_Num_10.setForeground(Color.RED);
						lb_Name_10.setForeground(Color.RED);
						tf_Goal_10.setEditable(true);
						tf_Foul_10.setEditable(true);
						btn_Goal_P_10.setEnabled(true);
						btn_Goal_M_10.setEnabled(true);
						btn_Foul_P_10.setEnabled(true);
						btn_Foul_M_10.setEnabled(true);
						TeamA.player[10].setPlayerStatus(1);
					} else {
						lb_Num_10.setForeground(Color.BLACK);
						lb_Name_10.setForeground(Color.BLACK);
						tf_Goal_10.setEditable(false);
						tf_Foul_10.setEditable(false);
						btn_Goal_P_10.setEnabled(false);
						btn_Goal_M_10.setEnabled(false);
						btn_Foul_P_10.setEnabled(false);
						btn_Foul_M_10.setEnabled(false);
						TeamA.player[10].setPlayerStatus(0);
					}
				}
			}
		});
		cb_10.setBounds(8, 386, 21, 21);
		contentPane.add(cb_10);
		
		Checkbox cb_11 = new Checkbox("");
		cb_11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkPlayerNum(cb_11) == true) {
					if (cb_11.getState() == true) {
						lb_Num_11.setForeground(Color.RED);
						lb_Name_11.setForeground(Color.RED);
						tf_Goal_11.setEditable(true);
						tf_Foul_11.setEditable(true);
						btn_Goal_P_11.setEnabled(true);
						btn_Goal_M_11.setEnabled(true);
						btn_Foul_P_11.setEnabled(true);
						btn_Foul_M_11.setEnabled(true);
						TeamA.player[11].setPlayerStatus(1);
					} else {
						lb_Num_11.setForeground(Color.BLACK);
						lb_Name_11.setForeground(Color.BLACK);
						tf_Goal_11.setEditable(false);
						tf_Foul_11.setEditable(false);
						btn_Goal_P_11.setEnabled(false);
						btn_Goal_M_11.setEnabled(false);
						btn_Foul_P_11.setEnabled(false);
						btn_Foul_M_11.setEnabled(false);
						TeamA.player[11].setPlayerStatus(0);
					}
				}
			}
		});
		cb_11.setBounds(8, 421, 21, 21);
		contentPane.add(cb_11);
		
		JButton btnApply = new JButton("主队换人应用");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (iNum == 5){
					if (iStartFlg == 1){
					makeShowTeam(TeamA,TeamA_Show);
					makeSubPing(TeamA_Show,PINGMU);
					SP.getPingMu(PINGMU);
					SP.refresh();}
				}else{
					msgBox msg = new msgBox();
					msg.showStr("场上队员人数不为5，请确认！！！");
					return;
				}
				
			}
		});
		btnApply.setBounds(211, 450, 150, 25);
		contentPane.add(btnApply);
		
		lb_Num_0 = new JLabel("10");
		lb_Num_0.setBounds(40, 36, 20, 20);
		contentPane.add(lb_Num_0);
		
		lb_Name_0 = new JLabel("New label");
		lb_Name_0.setBounds(69, 36, 70, 20);
		contentPane.add(lb_Name_0);
		
		lb_Num_1 = new JLabel("10");
		lb_Num_1.setBounds(40, 71, 20, 20);
		contentPane.add(lb_Num_1);
		
		lb_Name_1 = new JLabel("New label");
		lb_Name_1.setBounds(69, 71, 70, 20);
		contentPane.add(lb_Name_1);
		
		JLabel lblNewLabel = new JLabel("得分");
		lblNewLabel.setBounds(187, 10, 50, 13);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("犯规");
		label.setBounds(316, 10, 50, 13);
		contentPane.add(label);
		
		lb_Num_2 = new JLabel("10");
		lb_Num_2.setBounds(40, 106, 20, 20);
		contentPane.add(lb_Num_2);
		
		lb_Name_2 = new JLabel("New label");
		lb_Name_2.setBounds(69, 106, 70, 20);
		contentPane.add(lb_Name_2);
		
		tf_Goal_0 = new JTextField();
		tf_Goal_0.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_0.setBounds(179, 36, 40, 20);
		contentPane.add(tf_Goal_0);
		tf_Goal_0.setColumns(10);
		
		btn_Goal_P_0 = new JButton("+");
		btn_Goal_P_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iTmp = StringToInt(tf_Goal_0.getText());
				iTmp ++ ;
				tf_Goal_0.setText(IntToString(iTmp));
				TeamA.player[0].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_0.getText(),tf_Goal_0.getText());			
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_0.setFont(new Font("Microsoft YaHei", Font.PLAIN, 8));
		btn_Goal_P_0.setBounds(138, 36, 40, 20);
		contentPane.add(btn_Goal_P_0);
		
		btn_Goal_M_0 = new JButton("-");
		btn_Goal_M_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_0.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_0.setText(IntToString(iTmp));
				TeamA.player[0].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_0.getText(),tf_Goal_0.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_0.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_0.setBounds(219, 36, 40, 20);
		contentPane.add(btn_Goal_M_0);
		
		btn_Foul_P_0 = new JButton("+");
		btn_Foul_P_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_0.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_0.setText(IntToString(iTmp));
				TeamA.player[0].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_0.getText(),getFoulToString(iTmp));		
				showMain.setHostTeamFoul_P();
				
			}
		});
		btn_Foul_P_0.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_0.setBounds(271, 37, 40, 20);
		contentPane.add(btn_Foul_P_0);
		
		tf_Foul_0 = new JTextField();
		tf_Foul_0.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_0.setColumns(10);
		tf_Foul_0.setBounds(312, 37, 40, 20);
		contentPane.add(tf_Foul_0);
		
		btn_Foul_M_0 = new JButton("-");
		btn_Foul_M_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_0.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_0.setText(IntToString(iTmp));
				TeamA.player[0].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_0.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_0.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_0.setBounds(352, 37, 40, 20);
		contentPane.add(btn_Foul_M_0);
		
		btn_Goal_P_1 = new JButton("+");
		btn_Goal_P_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_1.getText());
				iTmp ++ ;
				tf_Goal_1.setText(IntToString(iTmp));
				TeamA.player[1].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_1.getText(),tf_Goal_1.getText());		
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_1.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_1.setBounds(138, 71, 40, 20);
		contentPane.add(btn_Goal_P_1);
		
		tf_Goal_1 = new JTextField();
		tf_Goal_1.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_1.setColumns(10);
		tf_Goal_1.setBounds(179, 71, 40, 20);
		contentPane.add(tf_Goal_1);
		
		btn_Goal_M_1 = new JButton("-");
		btn_Goal_M_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_1.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_1.setText(IntToString(iTmp));
				TeamA.player[1].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_1.getText(),tf_Goal_1.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_1.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_1.setBounds(219, 71, 40, 20);
		contentPane.add(btn_Goal_M_1);
		
		btn_Foul_P_1 = new JButton("+");
		btn_Foul_P_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_1.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_1.setText(IntToString(iTmp));
				TeamA.player[1].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_1.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_1.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_1.setBounds(271, 71, 40, 20);
		contentPane.add(btn_Foul_P_1);
		
		tf_Foul_1 = new JTextField();
		tf_Foul_1.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_1.setColumns(10);
		tf_Foul_1.setBounds(312, 71, 40, 20);
		contentPane.add(tf_Foul_1);
		
		btn_Foul_M_1 = new JButton("-");
		btn_Foul_M_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_1.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_1.setText(IntToString(iTmp));
				TeamA.player[1].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_1.getText(),getFoulToString(iTmp));		
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_1.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_1.setBounds(352, 71, 40, 20);
		contentPane.add(btn_Foul_M_1);
		
		btn_Goal_P_2 = new JButton("+");
		btn_Goal_P_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_2.getText());
				iTmp ++ ;
				tf_Goal_2.setText(IntToString(iTmp));
				TeamA.player[2].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_2.getText(),tf_Goal_2.getText());		
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_2.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_2.setBounds(138, 106, 40, 20);
		contentPane.add(btn_Goal_P_2);
		
		tf_Goal_2 = new JTextField();
		tf_Goal_2.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_2.setColumns(10);
		tf_Goal_2.setBounds(179, 106, 40, 20);
		contentPane.add(tf_Goal_2);
		
		btn_Goal_M_2 = new JButton("-");
		btn_Goal_M_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_2.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_2.setText(IntToString(iTmp));
				TeamA.player[2].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_2.getText(),tf_Goal_2.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_2.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_2.setBounds(219, 106, 40, 20);
		contentPane.add(btn_Goal_M_2);
		
		btn_Foul_P_2 = new JButton("+");
		btn_Foul_P_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_2.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_2.setText(IntToString(iTmp));
				TeamA.player[2].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_2.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_2.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_2.setBounds(271, 106, 40, 20);
		contentPane.add(btn_Foul_P_2);
		
		tf_Foul_2 = new JTextField();
		tf_Foul_2.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_2.setColumns(10);
		tf_Foul_2.setBounds(312, 106, 40, 20);
		contentPane.add(tf_Foul_2);
		
		btn_Foul_M_2 = new JButton("-");
		btn_Foul_M_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_2.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_2.setText(IntToString(iTmp));
				TeamA.player[2].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_2.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_2.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_2.setBounds(352, 106, 40, 20);
		contentPane.add(btn_Foul_M_2);
		
		lb_Num_3 = new JLabel("10");
		lb_Num_3.setBounds(40, 141, 20, 20);
		contentPane.add(lb_Num_3);
		
		lb_Name_3 = new JLabel("New label");
		lb_Name_3.setBounds(69, 141, 70, 20);
		contentPane.add(lb_Name_3);
		
		btn_Goal_P_3 = new JButton("+");
		btn_Goal_P_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_3.getText());
				iTmp ++ ;
				tf_Goal_3.setText(IntToString(iTmp));
				TeamA.player[3].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_3.getText(),tf_Goal_3.getText());		
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_3.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_3.setBounds(138, 141, 40, 20);
		contentPane.add(btn_Goal_P_3);
		
		tf_Goal_3 = new JTextField();
		tf_Goal_3.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_3.setColumns(10);
		tf_Goal_3.setBounds(179, 141, 40, 20);
		contentPane.add(tf_Goal_3);
		
		btn_Goal_M_3 = new JButton("-");
		btn_Goal_M_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_3.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_3.setText(IntToString(iTmp));
				TeamA.player[3].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_3.getText(),tf_Goal_3.getText());
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_3.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_3.setBounds(219, 141, 40, 20);
		contentPane.add(btn_Goal_M_3);
		
		btn_Foul_P_3 = new JButton("+");
		btn_Foul_P_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_3.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_3.setText(IntToString(iTmp));
				TeamA.player[3].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_3.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_3.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_3.setBounds(271, 141, 40, 20);
		contentPane.add(btn_Foul_P_3);
		
		tf_Foul_3 = new JTextField();
		tf_Foul_3.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_3.setColumns(10);
		tf_Foul_3.setBounds(312, 141, 40, 20);
		contentPane.add(tf_Foul_3);
		
		btn_Foul_M_3 = new JButton("-");
		btn_Foul_M_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_3.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_3.setText(IntToString(iTmp));
				TeamA.player[3].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_3.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_3.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_3.setBounds(352, 141, 40, 20);
		contentPane.add(btn_Foul_M_3);
		
		lb_Num_4 = new JLabel("10");
		lb_Num_4.setBounds(40, 177, 20, 20);
		contentPane.add(lb_Num_4);
		
		lb_Name_4 = new JLabel("New label");
		lb_Name_4.setBounds(69, 177, 70, 20);
		contentPane.add(lb_Name_4);
		
		btn_Goal_P_4 = new JButton("+");
		btn_Goal_P_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_4.getText());
				iTmp ++ ;
				tf_Goal_4.setText(IntToString(iTmp));
				TeamA.player[4].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_4.getText(),tf_Goal_4.getText());		
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_4.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_4.setBounds(138, 177, 40, 20);
		contentPane.add(btn_Goal_P_4);
		
		tf_Goal_4 = new JTextField();
		tf_Goal_4.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_4.setColumns(10);
		tf_Goal_4.setBounds(179, 177, 40, 20);
		contentPane.add(tf_Goal_4);
		
		btn_Goal_M_4 = new JButton("-");
		btn_Goal_M_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_4.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_4.setText(IntToString(iTmp));
				TeamA.player[4].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_4.getText(),tf_Goal_4.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_4.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_4.setBounds(219, 177, 40, 20);
		contentPane.add(btn_Goal_M_4);
		
		btn_Foul_P_4 = new JButton("+");
		btn_Foul_P_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_4.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_4.setText(IntToString(iTmp));
				TeamA.player[4].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_4.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_4.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_4.setBounds(271, 177, 40, 20);
		contentPane.add(btn_Foul_P_4);
		
		tf_Foul_4 = new JTextField();
		tf_Foul_4.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_4.setColumns(10);
		tf_Foul_4.setBounds(312, 177, 40, 20);
		contentPane.add(tf_Foul_4);
		
		btn_Foul_M_4 = new JButton("-");
		btn_Foul_M_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_4.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_4.setText(IntToString(iTmp));
				TeamA.player[4].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_4.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_4.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_4.setBounds(352, 177, 40, 20);
		contentPane.add(btn_Foul_M_4);
		
		lb_Num_5 = new JLabel("10");
		lb_Num_5.setBounds(40, 211, 20, 20);
		contentPane.add(lb_Num_5);
		
		lb_Name_5 = new JLabel("New label");
		lb_Name_5.setBounds(69, 211, 70, 20);
		contentPane.add(lb_Name_5);
		
		btn_Goal_P_5 = new JButton("+");
		btn_Goal_P_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_5.getText());
				iTmp ++ ;
				tf_Goal_5.setText(IntToString(iTmp));
				TeamA.player[5].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_5.getText(),tf_Goal_5.getText());	
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_5.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_5.setBounds(138, 211, 40, 20);
		contentPane.add(btn_Goal_P_5);
		
		tf_Goal_5 = new JTextField();
		tf_Goal_5.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_5.setColumns(10);
		tf_Goal_5.setBounds(179, 211, 40, 20);
		contentPane.add(tf_Goal_5);
		
		btn_Goal_M_5 = new JButton("-");
		btn_Goal_M_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_5.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_5.setText(IntToString(iTmp));
				TeamA.player[5].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_5.getText(),tf_Goal_5.getText());	
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_5.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_5.setBounds(219, 211, 40, 20);
		contentPane.add(btn_Goal_M_5);
		
		btn_Foul_P_5 = new JButton("+");
		btn_Foul_P_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_5.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_5.setText(IntToString(iTmp));
				TeamA.player[5].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_5.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_5.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_5.setBounds(271, 211, 40, 20);
		contentPane.add(btn_Foul_P_5);
		
		tf_Foul_5 = new JTextField();
		tf_Foul_5.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_5.setColumns(10);
		tf_Foul_5.setBounds(312, 211, 40, 20);
		contentPane.add(tf_Foul_5);
		
		btn_Foul_M_5 = new JButton("-");
		btn_Foul_M_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_5.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_5.setText(IntToString(iTmp));
				TeamA.player[5].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_5.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_5.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_5.setBounds(352, 211, 40, 20);
		contentPane.add(btn_Foul_M_5);
		
		lb_Num_6 = new JLabel("10");
		lb_Num_6.setBounds(40, 246, 20, 20);
		contentPane.add(lb_Num_6);
		
		lb_Name_6 = new JLabel("New label");
		lb_Name_6.setBounds(69, 246, 70, 20);
		contentPane.add(lb_Name_6);
		
		btn_Goal_P_6 = new JButton("+");
		btn_Goal_P_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_6.getText());
				iTmp ++ ;
				tf_Goal_6.setText(IntToString(iTmp));
				TeamA.player[6].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_6.getText(),tf_Goal_6.getText());		
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_6.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_6.setBounds(138, 246, 40, 20);
		contentPane.add(btn_Goal_P_6);
		
		tf_Goal_6 = new JTextField();
		tf_Goal_6.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_6.setColumns(10);
		tf_Goal_6.setBounds(179, 246, 40, 20);
		contentPane.add(tf_Goal_6);
		
		btn_Goal_M_6 = new JButton("-");
		btn_Goal_M_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_6.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_6.setText(IntToString(iTmp));
				TeamA.player[6].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_6.getText(),tf_Goal_6.getText());	
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_6.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_6.setBounds(219, 246, 40, 20);
		contentPane.add(btn_Goal_M_6);
		
		btn_Foul_P_6 = new JButton("+");
		btn_Foul_P_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_6.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_6.setText(IntToString(iTmp));
				TeamA.player[6].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_6.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_6.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_6.setBounds(271, 246, 40, 20);
		contentPane.add(btn_Foul_P_6);
		
		tf_Foul_6 = new JTextField();
		tf_Foul_6.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_6.setColumns(10);
		tf_Foul_6.setBounds(312, 246, 40, 20);
		contentPane.add(tf_Foul_6);
		
		btn_Foul_M_6 = new JButton("-");
		btn_Foul_M_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_6.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_6.setText(IntToString(iTmp));
				TeamA.player[6].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_6.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_6.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_6.setBounds(352, 246, 40, 20);
		contentPane.add(btn_Foul_M_6);
		
		lb_Num_7 = new JLabel("10");
		lb_Num_7.setBounds(40, 281, 20, 20);
		contentPane.add(lb_Num_7);
		
		lb_Name_7 = new JLabel("New label");
		lb_Name_7.setBounds(69, 281, 70, 20);
		contentPane.add(lb_Name_7);
		
		btn_Goal_P_7 = new JButton("+");
		btn_Goal_P_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_7.getText());
				iTmp ++ ;
				tf_Goal_7.setText(IntToString(iTmp));
				TeamA.player[7].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_7.getText(),tf_Goal_7.getText());	
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_7.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_7.setBounds(138, 281, 40, 20);
		contentPane.add(btn_Goal_P_7);
		
		tf_Goal_7 = new JTextField();
		tf_Goal_7.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_7.setColumns(10);
		tf_Goal_7.setBounds(179, 281, 40, 20);
		contentPane.add(tf_Goal_7);
		
		btn_Goal_M_7 = new JButton("-");
		btn_Goal_M_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_7.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_7.setText(IntToString(iTmp));
				TeamA.player[7].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_7.getText(),tf_Goal_7.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_7.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_7.setBounds(219, 281, 40, 20);
		contentPane.add(btn_Goal_M_7);
		
		btn_Foul_P_7 = new JButton("+");
		btn_Foul_P_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_7.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_7.setText(IntToString(iTmp));
				TeamA.player[7].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_7.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_7.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_7.setBounds(271, 281, 40, 20);
		contentPane.add(btn_Foul_P_7);
		
		tf_Foul_7 = new JTextField();
		tf_Foul_7.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_7.setColumns(10);
		tf_Foul_7.setBounds(312, 281, 40, 20);
		contentPane.add(tf_Foul_7);
		
		btn_Foul_M_7 = new JButton("-");
		btn_Foul_M_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_7.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_7.setText(IntToString(iTmp));
				TeamA.player[7].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_7.getText(),getFoulToString(iTmp));
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_7.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_7.setBounds(352, 281, 40, 20);
		contentPane.add(btn_Foul_M_7);
		
		lb_Num_8 = new JLabel("10");
		lb_Num_8.setBounds(40, 316, 20, 20);
		contentPane.add(lb_Num_8);
		
		lb_Name_8 = new JLabel("New label");
		lb_Name_8.setBounds(69, 316, 70, 20);
		contentPane.add(lb_Name_8);
		
		btn_Goal_P_8 = new JButton("+");
		btn_Goal_P_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_8.getText());
				iTmp ++ ;
				tf_Goal_8.setText(IntToString(iTmp));
				TeamA.player[8].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_8.getText(),tf_Goal_8.getText());	
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_8.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_8.setBounds(138, 316, 40, 20);
		contentPane.add(btn_Goal_P_8);
		
		tf_Goal_8 = new JTextField();
		tf_Goal_8.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_8.setColumns(10);
		tf_Goal_8.setBounds(179, 316, 40, 20);
		contentPane.add(tf_Goal_8);
		
		btn_Goal_M_8 = new JButton("-");
		btn_Goal_M_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_8.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_8.setText(IntToString(iTmp));
				TeamA.player[8].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_8.getText(),tf_Goal_8.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_8.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_8.setBounds(219, 316, 40, 20);
		contentPane.add(btn_Goal_M_8);
		
		btn_Foul_P_8 = new JButton("+");
		btn_Foul_P_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_8.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_8.setText(IntToString(iTmp));
				TeamA.player[8].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_8.getText(),getFoulToString(iTmp));
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_8.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_8.setBounds(271, 316, 40, 20);
		contentPane.add(btn_Foul_P_8);
		
		tf_Foul_8 = new JTextField();
		tf_Foul_8.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_8.setColumns(10);
		tf_Foul_8.setBounds(312, 316, 40, 20);
		contentPane.add(tf_Foul_8);
		
		btn_Foul_M_8 = new JButton("-");
		btn_Foul_M_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_8.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_8.setText(IntToString(iTmp));
				TeamA.player[8].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_8.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_8.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_8.setBounds(352, 316, 40, 20);
		contentPane.add(btn_Foul_M_8);
		
		lb_Num_9 = new JLabel("10");
		lb_Num_9.setBounds(40, 351, 20, 20);
		contentPane.add(lb_Num_9);
		
		lb_Name_9 = new JLabel("New label");
		lb_Name_9.setBounds(69, 351, 70, 20);
		contentPane.add(lb_Name_9);
		
		btn_Goal_P_9 = new JButton("+");
		btn_Goal_P_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_9.getText());
				iTmp ++ ;
				tf_Goal_9.setText(IntToString(iTmp));
				TeamA.player[9].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_9.getText(),tf_Goal_9.getText());		
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_9.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_9.setBounds(138, 351, 40, 20);
		contentPane.add(btn_Goal_P_9);
		
		tf_Goal_9 = new JTextField();
		tf_Goal_9.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_9.setColumns(10);
		tf_Goal_9.setBounds(179, 351, 40, 20);
		contentPane.add(tf_Goal_9);
		
		btn_Goal_M_9 = new JButton("-");
		btn_Goal_M_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_9.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_9.setText(IntToString(iTmp));
				TeamA.player[9].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_9.getText(),tf_Goal_9.getText());	
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_9.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_9.setBounds(219, 351, 40, 20);
		contentPane.add(btn_Goal_M_9);
		
		btn_Foul_P_9 = new JButton("+");
		btn_Foul_P_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_9.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_9.setText(IntToString(iTmp));
				TeamA.player[9].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_9.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_9.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_9.setBounds(271, 351, 40, 20);
		contentPane.add(btn_Foul_P_9);
		
		tf_Foul_9 = new JTextField();
		tf_Foul_9.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_9.setColumns(10);
		tf_Foul_9.setBounds(312, 351, 40, 20);
		contentPane.add(tf_Foul_9);
		
		btn_Foul_M_9 = new JButton("-");
		btn_Foul_M_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_9.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_9.setText(IntToString(iTmp));
				TeamA.player[9].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_9.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_9.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_9.setBounds(352, 351, 40, 20);
		contentPane.add(btn_Foul_M_9);
		
		lb_Num_10 = new JLabel("10");
		lb_Num_10.setBounds(40, 386, 20, 20);
		contentPane.add(lb_Num_10);
		
		lb_Name_10 = new JLabel("New label");
		lb_Name_10.setBounds(69, 386, 70, 20);
		contentPane.add(lb_Name_10);
		
		btn_Goal_P_10 = new JButton("+");
		btn_Goal_P_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_10.getText());
				iTmp ++ ;
				tf_Goal_10.setText(IntToString(iTmp));
				TeamA.player[10].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_10.getText(),tf_Goal_10.getText());	
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_10.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_10.setBounds(138, 386, 40, 20);
		contentPane.add(btn_Goal_P_10);
		
		tf_Goal_10 = new JTextField();
		tf_Goal_10.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_10.setColumns(10);
		tf_Goal_10.setBounds(179, 386, 40, 20);
		contentPane.add(tf_Goal_10);
		
		btn_Goal_M_10 = new JButton("-");
		btn_Goal_M_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_10.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_10.setText(IntToString(iTmp));
				TeamA.player[10].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_10.getText(),tf_Goal_10.getText());	
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_10.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_10.setBounds(219, 386, 40, 20);
		contentPane.add(btn_Goal_M_10);
		
		btn_Foul_P_10 = new JButton("+");
		btn_Foul_P_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_10.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_10.setText(IntToString(iTmp));
				TeamA.player[10].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_10.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_10.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_10.setBounds(271, 386, 40, 20);
		contentPane.add(btn_Foul_P_10);
		
		tf_Foul_10 = new JTextField();
		tf_Foul_10.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_10.setColumns(10);
		tf_Foul_10.setBounds(312, 386, 40, 20);
		contentPane.add(tf_Foul_10);
		
		btn_Foul_M_10 = new JButton("-");
		btn_Foul_M_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_10.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_10.setText(IntToString(iTmp));
				TeamA.player[10].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_10.getText(),getFoulToString(iTmp));		
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_10.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_10.setBounds(352, 386, 40, 20);
		contentPane.add(btn_Foul_M_10);
		
		lb_Num_11 = new JLabel("10");
		lb_Num_11.setBounds(40, 421, 20, 20);
		contentPane.add(lb_Num_11);
		
		lb_Name_11 = new JLabel("New label");
		lb_Name_11.setBounds(69, 421, 70, 20);
		contentPane.add(lb_Name_11);
		
		btn_Goal_P_11 = new JButton("+");
		btn_Goal_P_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_11.getText());
				iTmp ++ ;
				tf_Goal_11.setText(IntToString(iTmp));
				TeamA.player[11].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_11.getText(),tf_Goal_11.getText());	
				showMain.setHostTeamPoint_P();
			}
		});
		btn_Goal_P_11.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_P_11.setBounds(138, 421, 40, 20);
		contentPane.add(btn_Goal_P_11);
		
		tf_Goal_11 = new JTextField();
		tf_Goal_11.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Goal_11.setColumns(10);
		tf_Goal_11.setBounds(179, 421, 40, 20);
		contentPane.add(tf_Goal_11);
		
		btn_Goal_M_11 = new JButton("-");
		btn_Goal_M_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Goal_11.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Goal_11.setText(IntToString(iTmp));
				TeamA.player[11].setPlayerGoal(iTmp);
				SP.setGoal(lb_Num_11.getText(),tf_Goal_11.getText());		
				showMain.setHostTeamPoint_M();
			}
		});
		btn_Goal_M_11.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Goal_M_11.setBounds(219, 421, 40, 20);
		contentPane.add(btn_Goal_M_11);
		
		btn_Foul_P_11 = new JButton("+");
		btn_Foul_P_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_11.getText());
				iTmp ++ ;
				if (iTmp >= 6){
					iTmp = 6;
				}
				tf_Foul_11.setText(IntToString(iTmp));
				TeamA.player[11].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_11.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_P();
			}
		});
		btn_Foul_P_11.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_P_11.setBounds(271, 421, 40, 20);
		contentPane.add(btn_Foul_P_11);
		
		tf_Foul_11 = new JTextField();
		tf_Foul_11.setHorizontalAlignment(SwingConstants.CENTER);
		tf_Foul_11.setColumns(10);
		tf_Foul_11.setBounds(312, 421, 40, 20);
		contentPane.add(tf_Foul_11);
		
		btn_Foul_M_11 = new JButton("-");
		btn_Foul_M_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iTmp = StringToInt(tf_Foul_11.getText());
				iTmp -- ;
				if (iTmp <= 0){
					iTmp = 0;
				}
				tf_Foul_11.setText(IntToString(iTmp));
				TeamA.player[11].setPlayerFoull(iTmp);
				SP.setFoull(lb_Num_11.getText(),getFoulToString(iTmp));	
				showMain.setHostTeamFoul_M();
			}
		});
		btn_Foul_M_11.setFont(new Font(FONT_STYLE, Font.PLAIN, 8));
		btn_Foul_M_11.setBounds(352, 421, 40, 20);
		contentPane.add(btn_Foul_M_11);
		
		JLabel lblNewLabel_1 = new JLabel("Team  A controller");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font(FONT_STYLE, Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(8, 0, 157, 32);
		contentPane.add(lblNewLabel_1);
		

		
		
		// 队员名称载入
		lb_Name_0.setText(TeamA.player[0].getPlayerName());
		lb_Name_1.setText(TeamA.player[1].getPlayerName());
		lb_Name_2.setText(TeamA.player[2].getPlayerName());
		lb_Name_3.setText(TeamA.player[3].getPlayerName());
		lb_Name_4.setText(TeamA.player[4].getPlayerName());
		lb_Name_5.setText(TeamA.player[5].getPlayerName());
		lb_Name_6.setText(TeamA.player[6].getPlayerName());
		lb_Name_7.setText(TeamA.player[7].getPlayerName());
		lb_Name_8.setText(TeamA.player[8].getPlayerName());
		lb_Name_9.setText(TeamA.player[9].getPlayerName());
		lb_Name_10.setText(TeamA.player[10].getPlayerName());
		lb_Name_11.setText(TeamA.player[11].getPlayerName());
		
		// 队员号码载入
		lb_Num_0.setText(TeamA.player[0].getPlayerNo());
		lb_Num_1.setText(TeamA.player[1].getPlayerNo());
		lb_Num_2.setText(TeamA.player[2].getPlayerNo());
		lb_Num_3.setText(TeamA.player[3].getPlayerNo());
		lb_Num_4.setText(TeamA.player[4].getPlayerNo());
		lb_Num_5.setText(TeamA.player[5].getPlayerNo());
		lb_Num_6.setText(TeamA.player[6].getPlayerNo());
		lb_Num_7.setText(TeamA.player[7].getPlayerNo());
		lb_Num_8.setText(TeamA.player[8].getPlayerNo());
		lb_Num_9.setText(TeamA.player[9].getPlayerNo());
		lb_Num_10.setText(TeamA.player[10].getPlayerNo());
		lb_Num_11.setText(TeamA.player[11].getPlayerNo());

		//得分初始化
		tf_Goal_0.setText("0");
		tf_Goal_1.setText("0");
		tf_Goal_2.setText("0");
		tf_Goal_3.setText("0");
		tf_Goal_4.setText("0");
		tf_Goal_5.setText("0");
		tf_Goal_6.setText("0");
		tf_Goal_7.setText("0");
		tf_Goal_8.setText("0");
		tf_Goal_9.setText("0");
		tf_Goal_10.setText("0");
		tf_Goal_11.setText("0");
		tf_Goal_0.setEditable(false);
		tf_Goal_1.setEditable(false);
		tf_Goal_2.setEditable(false);
		tf_Goal_3.setEditable(false);
		tf_Goal_4.setEditable(false);
		tf_Goal_5.setEditable(false);
		tf_Goal_6.setEditable(false);
		tf_Goal_7.setEditable(false);
		tf_Goal_8.setEditable(false);
		tf_Goal_9.setEditable(false);
		tf_Goal_10.setEditable(false);
		tf_Goal_11.setEditable(false);
		
		//犯规初始化
		tf_Foul_0.setText("0");
		tf_Foul_1.setText("0");
		tf_Foul_2.setText("0");
		tf_Foul_3.setText("0");
		tf_Foul_4.setText("0");
		tf_Foul_5.setText("0");
		tf_Foul_6.setText("0");
		tf_Foul_7.setText("0");
		tf_Foul_8.setText("0");
		tf_Foul_9.setText("0");
		tf_Foul_10.setText("0");
		tf_Foul_11.setText("0");
		tf_Foul_0.setEditable(false);
		tf_Foul_1.setEditable(false);
		tf_Foul_2.setEditable(false);
		tf_Foul_3.setEditable(false);
		tf_Foul_4.setEditable(false);
		tf_Foul_5.setEditable(false);
		tf_Foul_6.setEditable(false);
		tf_Foul_7.setEditable(false);
		tf_Foul_8.setEditable(false);
		tf_Foul_9.setEditable(false);
		tf_Foul_10.setEditable(false);
		tf_Foul_11.setEditable(false);
		
		// 按钮初始化
		btn_Goal_P_0.setEnabled(false);
		btn_Goal_P_1.setEnabled(false);
		btn_Goal_P_2.setEnabled(false);
		btn_Goal_P_3.setEnabled(false);
		btn_Goal_P_4.setEnabled(false);
		btn_Goal_P_5.setEnabled(false);
		btn_Goal_P_6.setEnabled(false);
		btn_Goal_P_7.setEnabled(false);
		btn_Goal_P_8.setEnabled(false);
		btn_Goal_P_9.setEnabled(false);
		btn_Goal_P_10.setEnabled(false);
		btn_Goal_P_11.setEnabled(false);
		btn_Goal_M_0.setEnabled(false);
		btn_Goal_M_1.setEnabled(false);
		btn_Goal_M_2.setEnabled(false);
		btn_Goal_M_3.setEnabled(false);
		btn_Goal_M_4.setEnabled(false);
		btn_Goal_M_5.setEnabled(false);
		btn_Goal_M_6.setEnabled(false);
		btn_Goal_M_7.setEnabled(false);
		btn_Goal_M_8.setEnabled(false);
		btn_Goal_M_9.setEnabled(false);
		btn_Goal_M_10.setEnabled(false);
		btn_Goal_M_11.setEnabled(false);
		
		btn_Foul_P_0.setEnabled(false);
		btn_Foul_P_1.setEnabled(false);
		btn_Foul_P_2.setEnabled(false);
		btn_Foul_P_3.setEnabled(false);
		btn_Foul_P_4.setEnabled(false);
		btn_Foul_P_5.setEnabled(false);
		btn_Foul_P_6.setEnabled(false);
		btn_Foul_P_7.setEnabled(false);
		btn_Foul_P_8.setEnabled(false);
		btn_Foul_P_9.setEnabled(false);
		btn_Foul_P_10.setEnabled(false);
		btn_Foul_P_11.setEnabled(false);
		btn_Foul_M_0.setEnabled(false);
		btn_Foul_M_1.setEnabled(false);
		btn_Foul_M_2.setEnabled(false);
		btn_Foul_M_3.setEnabled(false);
		btn_Foul_M_4.setEnabled(false);
		btn_Foul_M_5.setEnabled(false);
		btn_Foul_M_6.setEnabled(false);
		btn_Foul_M_7.setEnabled(false);
		btn_Foul_M_8.setEnabled(false);
		btn_Foul_M_9.setEnabled(false);
		btn_Foul_M_10.setEnabled(false);
		btn_Foul_M_11.setEnabled(false);
		
		btn_show = new JButton("主队名单显示");
		btn_show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ( iStartFlg == 0){
					SP.getPingMu(PINGMU);
					SP.run();
					iStartFlg = 1;
					btn_show.setText("主队名单关闭");
				}else{
					SP.dispose();
					btn_show.setText("主队名单显示");
					iStartFlg = 0;
				}
			}
		});
		btn_show.setBounds(31, 450, 150, 25);
		contentPane.add(btn_show);
		

		
	}
	


	
	
	public static boolean checkPlayerNum(Checkbox cbt){
		if (cbt.getState() == true) {
			if (iNum < 5) {
				iNum++;
				return true;
			} else {
				cbt.setState(false);
				msgBox msg = new msgBox();
				msg.showStr("只能允许5名球员上场");
				return false;
			}
		}else{
			iNum --;
			return true;
		}
		
	}
	
	public static void makeSubPing(team tShow, subPingMu subShow){
		
		String [] strTmp1 = new String[MEMBER_MAX];
		String [] strTmp2 = new String[MEMBER_MAX];
		String [] strTmp3= new String[MEMBER_MAX];
		String [] strTmp4 = new String[MEMBER_MAX];
		
		for (int p = 0; p < MEMBER_MAX; p++){
			strTmp1[p] = tShow.player[p].getPlayerNo();
			strTmp2[p] = tShow.player[p].getPlayerName();
			strTmp3[p] = getFoulToString(tShow.player[p].getPlayerFoull());
			strTmp4[p] = String.valueOf(tShow.player[p].getPlayerGoal());
		}
		subShow.setStrPlayerNo(strTmp1);
		subShow.setStrPlayerName(strTmp2);
		subShow.setStrPlayerGoal(strTmp4);
		subShow.setStrPlayerFoul(strTmp3);
		
	}
	// 设置显示用球队数组
	public static void makeShowTeam (team teamOrg, team teamShow){
		// 显示数组初始化
		teamShow.init();
		int tp = 0;
		int fp = 5;
		
		for (int i=0; i < MEMBER_MAX ; i ++){
			if ( teamOrg.player[i].getPlayerStatus() == 1){
				  teamShow.player[tp] = teamOrg.player[i];
				  tp ++;
			}else {
				teamShow.player[fp] = teamOrg.player[i];
				fp ++;
			}
		}	
	}
	// 字符串转换为INT
	public static int StringToInt (String str){
		return Integer.valueOf(str);
	}
	
	// INT转换为字符串
	
	public static String IntToString(int val){
		return String.valueOf(val);
	}
	public static String getFoulToString(int iFour) {


		switch (iFour) {
		case 0:
			return "OOOOOO";
		case 1:
			return "XOOOOO";
		case 2:
			return "XXOOOO";
		case 3:
			return "XXXOOO";
		case 4:
			return "XXXXOO";
		case 5:
			return "XXXXXO";
		case 6:
			return "XXXXXX";
		default:
			return "XXXXXX";
		}

	}
}
