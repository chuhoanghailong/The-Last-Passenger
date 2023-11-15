public class TheLastPassenger {
	public static void main(String[] args) {
		int choice;
		StartGame startgame = new StartGame();
		
		do {
			startgame.showMenu();
			choice = startgame.getChoice();
			if (choice != 5) {
				switch (choice) {
					case 1: 
						startgame.generateBoard();
						break;
					case 2:
						startgame.changeColorBoard();
						break;
					case 3:
						startgame.newGame();
						break;
					case 4:
						startgame.result();
						break;
					default:
						System.out.println("Thoát chương trình... Cảm ơn bạn đã chơi !");
				}
			}
		}while (choice !=5);
	}
}
