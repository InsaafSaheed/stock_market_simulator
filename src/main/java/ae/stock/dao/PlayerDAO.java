package ae.stock.dao;


import java.util.ArrayList;
import java.util.List;

import ae.stock.entities.Player; 

public class PlayerDAO {
	private static List<Player> playerList = new ArrayList<Player>();
	public static List<Player> getAll(){
		
		return playerList;
	}
	

}