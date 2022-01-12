
public class Connect {
	
	int[][] table = { {0,0,0,0,0,0,0} ,
				      {0,0,0,0,0,0,0} ,
				      {0,0,0,0,0,0,0} ,
				      {0,0,0,0,0,0,0} ,
				      {0,0,0,0,0,0,0} ,
				      {0,0,0,0,0,0,0} };
	
	int turn=1;
	String result = "";
	boolean winner = false;
	public String play(int column) {
		
		if(winner)
		{
			result = "Game has finished!" ;
			turn=1;
		}
		else
		{
			if(turn==1)
			{
				if(table[0][column] != 0)
				{
					result="Column full!";
					turn=1;
				}
				else
				{
					for(int row=table.length-1 ; row >= 0 ; row--)
					{
						if( table[row][column] ==0 )
						{
							table[row][column] = turn;
							break;
						}
					}
					
					winner = isWinner(turn,table);
					if(winner)
					{
						result="Player 1 wins!";
						turn=1;
					}
					else
					{
						result="Player 1 has a turn";
						turn=2;
					}
				}
			}
			else
			{
				if(table[0][column] != 0)
				{
					result="Column full!";
					turn=2;
				}
				else
				{
					for(int row=table.length-1 ; row >= 0 ; row--)
					{
						if( table[row][column] ==0 )
						{
							table[row][column] = turn;
							break;
						}
					}
					
					winner = isWinner(turn,table);
					if(winner)
					{
						result="Player 2 wins!";
						turn=1;
					}
					else
					{
						result="Player 2 has a turn";
						turn=1;
					}
				}
			}	
		}
		
		return result;
	    
	  }
	
	
	public static boolean isWinner(int player, int[][] grid){
		
		for(int row = 0; row<grid.length; row++){
			for (int col = 0;col < grid[0].length - 3;col++){
				if (grid[row][col] == player   && 
					grid[row][col+1] == player &&
					grid[row][col+2] == player &&
					grid[row][col+3] == player){
					return true;
				}
			}			
		}
		for(int row = 0; row < grid.length - 3; row++){
			for(int col = 0; col < grid[0].length; col++){
				if (grid[row][col] == player   && 
					grid[row+1][col] == player &&
					grid[row+2][col] == player &&
					grid[row+3][col] == player){
					return true;
				}
			}
		}
		for(int row = 3; row < grid.length; row++){
			for(int col = 0; col < grid[0].length - 3; col++){
				if (grid[row][col] == player   && 
					grid[row-1][col+1] == player &&
					grid[row-2][col+2] == player &&
					grid[row-3][col+3] == player){
					return true;
				}
			}
		}
		for(int row = 0; row < grid.length - 3; row++){
			for(int col = 0; col < grid[0].length - 3; col++){
				if (grid[row][col] == player   && 
					grid[row+1][col+1] == player &&
					grid[row+2][col+2] == player &&
					grid[row+3][col+3] == player){
					return true;
				}
			}
		}
		return false;
		
	}
}
