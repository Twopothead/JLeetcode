
public class S130_surrounded_regions {
    public void solve(char[][] board) {
        board[1][1]='S';
    }
	public static void main(String[] args) {
		S130_surrounded_regions s = new S130_surrounded_regions();
		s.testcasea();
	}
	private void test(char[][] board) {
		System.out.println("Input: ");
		for (char[] cs : board) {
			for (char c : cs) {
				System.out.print(c+" ");
			}
			System.out.println("");
		}
		solve(board);
		System.out.println("Output: ");
		for (char[] cs : board) {
			for (char c : cs) {
				System.out.print(c+" ");
			}
			System.out.println("");
		}
	}
	private void testcasea() {
//		Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
//
//		A region is captured by flipping all 'O's into 'X's in that surrounded region.
//
//		Example:
//
//		X X X X
//		X O O X
//		X X O X
//		X O X X
//
//		After running your function, the board should be:
//
//		X X X X
//		X X X X
//		X X X X
//		X O X X
//
//		Explanation:
//
//		Surrounded regions shouldn¡¯t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.		
		char[][] board = {{'X', 'X', 'X', 'X'},{'X', 'O', 'O', 'X'},{'X', 'X', 'O', 'X'},{'X', 'O', 'X', 'X'}};
		test(board);
	}
}
