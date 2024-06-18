package TongLi;

public class TeamPlayer {
	private String playerNo;
	private String playerName;
	private int playerGoal;
	private int playerFoull;
	private int playerStatus;
	public String getPlayerNo() {
		return playerNo;
	}
	public void setPlayerNo(String playerNo) {
		this.playerNo = playerNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerGoal() {
		return playerGoal;
	}
	public void setPlayerGoal(int playerGoal) {
		this.playerGoal = playerGoal;
	}
	public int getPlayerFoull() {
		return playerFoull;
	}
	public void setPlayerFoull(int playerFoull) {
		if (playerFoull < 5){
			this.playerFoull = playerFoull;
		}else {
			return ;
		}
	}
	public int getPlayerStatus() {
		return playerStatus;
	}
	public void setPlayerStatus(int playerStatus) {
		this.playerStatus = playerStatus;
	}
	
	


	
	


	
}
