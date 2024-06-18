package TongLi;

public class subPingMu {
	private static final int MEMBER_MAX = 12;
	
	private String[] strPlayerName = new String[MEMBER_MAX];
	private String[] strPlayerNo = new String[MEMBER_MAX];
	private String[] strPlayerGoal = new String[MEMBER_MAX];
	private String[] strPlayerFoul = new String[MEMBER_MAX];
	
	public void init(){
		for (int i = 0 ; i < MEMBER_MAX; i ++){
			strPlayerName[i] = "";
			strPlayerNo[i] = "";
			strPlayerGoal[i] = "";
			strPlayerFoul[i] = "";
		}
	}

	public String[] getStrPlayerName() {
		return strPlayerName;
	}

	public void setStrPlayerName(String[] strPlayerName) {
		this.strPlayerName = strPlayerName;
	}

	public String[] getStrPlayerNo() {
		return strPlayerNo;
	}

	public void setStrPlayerNo(String[] strPlayerNo) {
		this.strPlayerNo = strPlayerNo;
	}

	public String[] getStrPlayerGoal() {
		return strPlayerGoal;
	}

	public void setStrPlayerGoal(String[] strPlayerGoal) {
		this.strPlayerGoal = strPlayerGoal;
	}

	public String[] getStrPlayerFoul() {
		return strPlayerFoul;
	}

	public void setStrPlayerFoul(String[] strPlayerFoul) {
		this.strPlayerFoul = strPlayerFoul;
	}
	
	
}
