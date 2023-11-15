import java.util.*;
public class GamePlay {
	private static final int ROW = 5;
	private static final int COLUMN = 3;
	private static int colorChoice[] = {0,1,2};
	private static String color[] = {"Xanh","Vàng","Đỏ"};
	private String colorBox[][];
	private int numBox[][];
	
	public GamePlay() {
		colorBox = new String[ROW][COLUMN];
		numBox = new int[ROW][COLUMN];
		for (int i =0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				colorBox[i][j] = "";
				numBox[i][j] = 0;
			}
		}
	}
	public boolean duplicateCheck(int numBox[][], int value, int rowNum, int colNum) {
		for (int i = 0; i < colNum; i++) {
			if (numBox[rowNum][i] == value) {
				return false;
			}
		}
		return true;
	}
	
	public void colorGenerate() {
		Random random = new Random();
		for (int i =0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				numBox[i][j] = random.nextInt(colorChoice.length);
				
				while (!duplicateCheck(numBox, numBox[i][j], i, j)) {
					numBox[i][j] = random.nextInt(colorChoice.length);
				}
				colorBox[i][j] = color[numBox[i][j]];
			}
		}
	}
	
	public void displayColorBox() {
		for (int i = 0; i < 21; i++) {
			System.out.print("_");
		}
		System.out.println("");
		for (int i =0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.printf(" %-4s |", colorBox[i][j]);
			}
			System.out.println("");
			for (int x = 0; x < 21; x++) {
				if (x == 6 || x == 13 || x == 20) {
					System.out.print("|");
				}
				else {
					System.out.print("_");
				}
				
			}
			System.out.println("");
		}
	System.out.println("");
	}
	
	public void colorChange() {
		Scanner input = new Scanner(System.in);
		String temp;
		int row, col, altColor; 
		
		System.out.print("Nhập số hàng muốn thay đổi màu: ");
		row = input.nextInt();
		while(row < 1 || row > ROW) {
			System.out.print("Giá trị không hợp lệ, vui lòng nhập từ 1 - " + ROW +" :");
			row = input.nextInt();
		}
		System.out.print("Nhập số cột muốn thay đổi màu: ");
		col = input.nextInt();
		while(col < 1 || col > COLUMN) {
			System.out.print("Giá trị không hợp lệ, vui lòng nhập từ 1 - " + COLUMN +" :");
			row = input.nextInt();
		}
		
		System.out.print("Nhập giá trị tương ứng với màu bạn muốn đổi"
						 +" (0 - Xanh, 1 - Vàng, 2 - Đỏ) ");
		altColor = input.nextInt();
		while(altColor == numBox[row-1][col-1] || altColor < 0 || altColor > 2) {
			if (altColor < 0 || altColor > 2) {
				System.out.print("Giá trị không hợp lệ, vui lòng nhập từ 0 - 2: ");
				altColor = input.nextInt();
			}
			else if (altColor == numBox[row-1][col-1]) {
				System.out.print("Bạn chọn trùng với màu của ô hiện có ! Xin hãy chọn lại :");
				altColor = input.nextInt();
			}
		}
		
		for (int i = 0; i < COLUMN; i++) {
			if (numBox[row - 1][i] == altColor) {
				temp = colorBox[row - 1][col - 1];
				colorBox[row - 1][col - 1] = colorBox[row - 1][i];
				colorBox[row - 1][i] = temp;
				break;
			}
		}
		System.out.println("\nBảng chơi sau khi đổi màu: ");
		
		for (int i = 0; i < 21; i++) {
			System.out.print("_");
		}
		System.out.println("");
		for (int i =0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.printf(" %-4s |", colorBox[i][j]);
			}
			System.out.println("");
			for (int x = 0; x < 21; x++) {
				if (x == 6 || x == 13 || x == 20) {
					System.out.print("|");
				}
				else {
					System.out.print("_");
				}
				
			}
			System.out.println("");
		}	
		System.out.println("");
	}
	
	public String getColorBox(int row, int col) {
		return colorBox[row][col];
	}
}
