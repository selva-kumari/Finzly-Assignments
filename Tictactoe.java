import java.util.*;
public class Tictactoe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char[][] board=new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]='-';
			}
		}
		boolean player1=true;
		boolean End=false;
		while(!End) {
		showboard(board);
		
		char position=' ';
		if(player1) {
			position='X';
		}
		else {
			position='O';
		}
		if(player1) {
			System.out.println(a+"turn");
		}
		else {
			System.out.println(b+"turn");
		}
		int row=0;
		int col=0;
		while(true) {
		System.out.println("Enter row");
		row=sc.nextInt();
		System.out.println("Enter col");
		col=sc.nextInt();
		if(row<0 || col<0 || row>0 ||  col>2) {
		  System.out.println("Out of bounds");
		}
		else if(board[row][col]!='-'){
			System.out.println("No space");
		}
		else {
			break;
		}
		}
		board[row][col]=position;
		showboard(board);
		checkwon(board);
		if(checkwon(board)=='X') {
			System.out.println("X won");
			break;
		}
		else if(checkwon(board)=='O'){
			System.out.println("O won");
			break;
		}
		else {
		    if(hastie(board)) {
		    	System.out.println("Tie");
		    }
		    else {
		    	player1=!player1;
		    }

	
	}
		}
	}
		
		public static void showboard(char board[][]){
		for(int i=0;i<board.length;i++) {
			
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
			
		}
		}

		
	public static char checkwon(char[][] board){
		for(int i=0;i<3;i++) {
			if(board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
				return board[i][0];
			}
		}
		for(int j=0;j<3;j++) {
			if(board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
				return board[0][j];
			}
		}
		if(board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
			return board[0][0];
		}
		if(board[2][0]==board[1][1] && board[1][1]==board[0][2]) {
			return board[2][0];
		}
		return '-';
	}
	public static boolean hastie(char[][] board) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}

}
