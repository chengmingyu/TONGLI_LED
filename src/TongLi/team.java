package TongLi;
import TongLi.*;
import java.util.*;

public class team {
	
	private static final int MEMBER_MAX = 12;
	TeamPlayer[] player = new TeamPlayer[MEMBER_MAX];
	
	public void init(){
		for (int i=0; i< MEMBER_MAX; i++){
			player[i] = new TeamPlayer();
			player[i].setPlayerFoull(0);
			player[i].setPlayerGoal(0);
			player[i].setPlayerName("");
			player[i].setPlayerNo("");
			player[i].setPlayerStatus(0);		
		}	
	}
	
	
	
}
