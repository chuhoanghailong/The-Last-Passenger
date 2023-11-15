import java.util.*;
public class StartGame {
	private static final int PLAYER_NUM = 4;
	private Player player[];
	private GamePlay gameplay;
	private static Scanner input;
	public StartGame() {
		player = new Player[PLAYER_NUM];
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
		}
		gameplay = new GamePlay();
		gameplay.colorGenerate();
		input  = new Scanner(System.in);
	}
	
	public void showMenu() {
		System.out.println("\t--------------GameShow Hành Khách Cuối Cùng--------------\n"); 
		System.out.println("1. Hiện bảng chơi"); 
		System.out.println("2. Thay đổi màu của bảng chơi"); 
		System.out.println("3. Bắt đầu trò chơi"); 
		System.out.println("4. Kết quả "); 
		System.out.println("5. Thoát chương trình\n");
	}
	public int getChoice() {
		int choice;
		System.out.print("Hãy đưa ra lựa chọn của bạn: ");
		choice = input.nextInt();
		while (choice < 1 || choice > 5) {
			System.out.print("Lựa chọn đưa ra không hơp lệ. Xin hãy chọn từ 1 - 5: ");
			choice = input.nextInt();
		}
		
		return choice;
	}
	public void newGame() {
		input.nextLine();
		System.out.println("");
		
		for (int i = 0; i < player.length; i++) {
			int count = 0;
			System.out.print("Điền tên của người chơi số " +(i + 1)+": ");
			player[i].setPlayerName(getName());
			System.out.print("Màu mà người chơi " +(i+1)+ " chọn là màu gì?(0 - Xanh, 1 - Vàng, 2 - Đỏ) ");
			player[i].setPlayerChoice(getColor());
			System.out.print("Chọn ô để đi lên hàng " + (count + 1) + "(lựa chọn từ 1-3): " ); 
			while(gameplay.getColorBox(count, (input.nextInt() - 1)).equals(player[i].getPlayerChoice())) {
				player[i].plusSc();
				count++;
				if (count == 5) {
					break;
				}
				System.out.print("Chọn ô để đi lên hàng " + (count + 1) + ": ");
			}	
			input.nextLine();
			System.out.println("");
		}
	}
	public void generateBoard() {
		gameplay.displayColorBox();
	}
	public void changeColorBoard() {
		gameplay.colorChange();
	}
	
	public String getName() {
		String name = input.nextLine();
		String[] stringSplit = name.split(" ");
		String altName = "";
		for (String aString: stringSplit) {
			altName += Character.toUpperCase(aString.charAt(0)) + aString.substring(1) + " " ;
		}
		return altName.trim();
	}
	public String getColor() {
		int color = input.nextInt();
		while(color < 0 || color > 2) {
			System.out.print("Lựa chọn không hợp lệ, vui lòng chọn từ 0 - 2: ");
			 color = input.nextInt();
		}
		String red = "Đỏ";
		String yellow = "Vàng";
		String green = "Xanh";
		if (color == 0)
			return green;
		else if (color == 1)
			return yellow;
		else
			return red;
	}
	
	public void result() {
		int max,min;
		int maxPl = 0, minPl = 0;
		max = player[0].getScore();
		min = player[0].getScore();
		
		for (int i = 1; i < player.length; i++) {
			if (player[i].getScore() > max) {
				max = player[i].getScore();
				maxPl = i;
			}
		}
		for (int j = 1; j < player.length; j++) {
				if (player[j].getScore() < min) {
					min = player[j].getScore();
					minPl = j;
				}
		}
		for(int i = 0; i < 58; i++) {
			System.out.print("_");
		}
		System.out.println("");
		System.out.printf("%-12s%-23s%-15s%s\n", "Lươt chơi |", 
		"Người chơi ", "| Màu đã chọn  |", " Điểm |"); 
		for (int i = 0; i < 58; i++) {
			if (i == 10 || i == 35 || i == 50 || i == 57) {
				System.out.print("|");
			}
			else {
			System.out.print("_");
			}
		}
		System.out.println("");
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%-10d| %-22s | %-13s| %-5d|\n",(i+1), player[i].getPlayerName(),player[i].getPlayerChoice(), player[i].getScore());
			for (int j = 0; j < 58; j++) {
				if (j == 10 || j == 35 || j == 50 || j == 57) {
					System.out.print("|");
				} 
				else {
					System.out.print("_");
				}
			}
			System.out.println("");

		}
		System.out.println("Người chơi đạt số điểm cao nhất là "
				   + player[maxPl].getPlayerName() );
		System.out.println("Người chơi đạt số điểm thấp nhất là "
				   + player[minPl].getPlayerName() );
	}
	
}		
	
