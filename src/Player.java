public class Player {
	private String playerName;
	private String playerChoice;
	private int score;
	
		public Player() {
			playerName ="";
			playerChoice="";
			score=0;
		}
		public void setPlayerName(String altPlayerName) {
			playerName = altPlayerName;
		}
		
		public String getPlayerName() {
				return playerName;
		}
		
		public void setPlayerChoice(String altPlayerChoice) {
			playerChoice = altPlayerChoice;
		}
		public String getPlayerChoice() {
			return playerChoice;
		}
		
		public int getScore() {
			return score;
		}
		public int plusSc() {
			return score++;
		}
}
