package TongLi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import TongLi.*;

public class readManger {

	private static final int MEMBER_MAX = 12;
	private static final String SPLITSTR = "#";
	private static final String ENCODING = "UTF-8";
//	private static final String ENCODING = "Unicode";
	private static BufferedReader buffRead;
	private static String ERR01 = "文件不存在";
	private static String ERR02 = "读取文件失败";
	
	 private static final String FILEPATH_A = "C:\\TONGLI\\a.txt";
	// private static final String FILEPATH_B = "C:\\b.txt";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		team TeamA = new team();
		team TeamB = new team();
		TeamA.init();
		TeamB.init();

		LoadTeam(FILEPATH_A,TeamA);
		

		for (int i = 0; i < MEMBER_MAX; i++) {

			System.out.println(TeamA.player[i].getPlayerNo());
			System.out.println(TeamA.player[i].getPlayerName());
		}
//		for (int i = 0; i < MEMBER_MAX; i++) {
//
//			System.out.println(TeamB.player[i].getPlayerNo());
//			System.out.println(TeamB.player[i].getPlayerName());
//		}

	}

	public static void LoadTeam(String FILEPATH, team t) {

		// 检查队员名单文件是否存在
		if (!fileIsTrue(FILEPATH)) {
			msgBox msg = new msgBox();
			msg.showStr(FILEPATH+"     "+ERR01);
			//msg.setVisible(true);
			return;
		}

		// 读取文件开始
		try {
			File file = new File(FILEPATH);
			InputStreamReader read = new InputStreamReader(new FileInputStream(
					file), ENCODING);
			buffRead = new BufferedReader(read);
			String strLine = "";
			int i = 0;
			while (((strLine = buffRead.readLine()) != null)
					|| (i < MEMBER_MAX)) {

				// 分割字符串 strTmp[0]: 队员号码 strTmp[1]: 队员姓名
				String[] strTmp = strLine.split(SPLITSTR);
				t.player[i].setPlayerNo(strTmp[0]);
				if (getChineseCharacterCount(strTmp[1]) == 2) {
					t.player[i].setPlayerName(String2TO3(strTmp[1]));
				} else {
					t.player[i].setPlayerName(strTmp[1]);
				}
				i++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(FILEPATH + "读取文件失败");
			e.printStackTrace();
			msgBox msg = new msgBox();
			msg.showStr(FILEPATH +"   "+ERR02);
			msg.setVisible(true);
				
		}

	}

	/*
	 * 判定文件是否存在 参数·：文件路径 返回值 ： 存在→ture 不存在→ false
	 */
	public static boolean fileIsTrue(String strFilePath) {

		File file = new File(strFilePath);
		if (file.isFile() && file.exists()) {
			return true;
		} else {
			return false;
		}

	}

	public static int getChineseCharacterCount(String text) {
		int amount = 0;// 创建汉字数量计数器
		for (int i = 0; i < text.length(); i++) {// 遍历字符串每一个字符
			// 使用正则表达式判断字符是否属于汉字编码
			boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", ""
					+ text.charAt(i));
			if (matches) {// 如果是汉字
				amount++;// 累加计数器
			}
		}
		return amount;
	}

	// 2个汉字中间加入全角空格
	public static String String2TO3(String str) {
		String strTmp = "";

		strTmp = str.substring(0, 1) + "   " + str.substring(1, 2);

		return strTmp;
	}
	


}
