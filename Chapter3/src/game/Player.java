package game;

public class Player{
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.ShowLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.ShowLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
