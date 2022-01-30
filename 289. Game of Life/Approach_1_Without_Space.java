public class Approach_1_Without_Space{
	public static void main(String[] args) {
		int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		gameOfLife(board);
		print(board);
	}

	public static void print(int[][] board){
		for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
            	System.out.print(board[i][j]+" ");
            }System.out.println();
        }
	}

	static int die = -1;
	static int rise = 2;

	public static int countLive(int i, int j, int[][] board){
		int live = 0;
		int[][] neighbours = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};

		for(int[] neighbour : neighbours){
			int m = i+neighbour[0];
			int n = j+neighbour[1];

			if(m>=0 && n>=0 && m<board.length && n<board[0].length && (board[m][n]==1 || board[m][n]==die))
				live++;
		}

		return live;
	}

	public static void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){

                int live = countLive(i,j,board);
                
                int curr = board[i][j];
                if(curr==1 && (live<2 || live>3)) board[i][j] = die;
                if(curr==0 && live==3) board[i][j] = rise;
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==die) board[i][j]=0;
                else if(board[i][j]==rise) board[i][j]=1;
            }
        }
    }
}