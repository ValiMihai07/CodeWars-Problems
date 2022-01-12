
public class joc {
	int position1=0;
	int position2=0;
	int roll =1; // who is rolling if it's divisible with 2 roll player 2 else player1
	String result ="";
	
	public String play(int die1, int die2) {
		if(result.equals("Player 1 Wins!") || result.equals("Player 2 Wins!"))
		{
			result = "Game over!";
			position1=0;
			position2=0;
			roll=1;
		}
		else
		{
			int sum = die1+die2;
			if (roll==1 )
			{
				position1 += sum;
				if(die1 == die2)
				{
					roll=1;
				}
				else
				{
					roll=2;
				}
				if( position1==2)
				{
					position1=38;
					result = "Player 1 is on square 38";
				}
				else if(position1==7)
				{
					position1=14;
					result = "Player 1 is on square 14";
				}
				else if(position1==8)
				{
					position1=31;
					result = "Player 1 is on square 31";
				}
				else if(position1==15)
				{
					position1=26;
					result = "Player 1 is on square 26";
				}
				else if(position1==21)
				{
					position1=42;
					result = "Player 1 is on square 42" ;
				}
				else if(position1==28)
				{
					position1=84;
					result = "Player 1 is on square 84";
				}
				else if(position1==36)
				{
					position1=44;
					result = "Player 1 is on square 44";
				}
				else if(position1==51)
				{
					position1=67;
					result = "Player 1 is on square 67";
				}
				else if(position1==71)
				{
					position1=91;
					result = "Player 1 is on square 91";
				}
				else if(position1==78)
				{
					position1=98;
					result = "Player 1 is on square 98";
				}
				else if(position1==87)
				{
					position1=94;
					result = "Player 1 is on square 94";
				}
				else if(position1==16)
				{
					position1=6;
					result = "Player 1 is on square 6";
				}
				else if(position1==46)
				{
					position1=25;
					result = "Player 1 is on square 25";
				}
				else if(position1==49)
				{
					position1=11;
					result = "Player 1 is on square 11";
				}
				else if(position1==62)
				{
					position1=19;
					result = "Player 1 is on square 19";
				}
				else if(position1==64)
				{
					position1=60;
					result = "Player 1 is on square 60";
				}
				else if(position1==74)
				{
					position1=53;
					result = "Player 1 is on square 53";
				}
				else if(position1==89)
				{
					position1=68;
					result = "Player 1 is on square 68";
				}
				else if(position1==92)
				{
					position1=88;
					result = "Player 1 is on square 88";
				}
				else if(position1==95)
				{
					position1=75;
					result = "Player 1 is on square 75";
				}
				else if(position1==99)
				{
					position1=80;
					result = "Player 1 is on square 80";
				}
				else if(position1>100)
				{
					position1= 100 - ( position1 -100);
					if(position1==99)
					{
						position1=80;
						result = "Player 1 is on square 80";
					}
					else if(position1==95)
					{
						position1=75;
						result = "Player 1 is on square 75";
					}
					else if(position1==92)
					{
						position1=88;
						result = "Player 1 is on square 88";
					}
					else if(position1==89)
					{
						position1=68;
						result = "Player 1 is on square 68";
					}
					else
					{
						result= "Player 1 is on square " + String.valueOf(position1);
					}
				}
				else if(position1==100)
				{
					result = "Player 1 Wins!";
				}
				else
				{
					result = "Player 1 is on square " + String.valueOf(position1) ;
				}
				
				
			}
			else
			{
				position2 += sum;
				if(die1 == die2)
				{
					roll=2;
				}
				else
				{
					roll=1;
				}
				if( position2==2)
				{
					position2=38;
					result = "Player 2 is on square 38";
				}
				else if(position2==7)
				{
					position2=14;
					result = "Player 2 is on square 14";
				}
				else if(position2==8)
				{
					position2=31;
					result = "Player 2 is on square 31";
				}
				else if(position2==15)
				{
					position2=26;
					result = "Player 2 is on square 26";
				}
				else if(position2==21)
				{
					position2=42;
					result = "Player 2 is on square 42";
				}
				else if(position2==28)
				{
					position2=84;
					result = "Player 2 is on square 84";
				}
				else if(position2==36)
				{
					position2=44;
					result = "Player 2 is on square 44";
				}
				else if(position2==51)
				{
					position2=67;
					result = "Player 2 is on square 67";
				}
				else if(position2==71)
				{
					position2=91;
					result = "Player 2 is on square 91";
				}
				else if(position2==78)
				{
					position2=98;
					result = "Player 2 is on square 98";
				}
				else if(position2==87)
				{
					position2=94;
					result = "Player 2 is on square 94";
				}
				else if(position2==16)
				{
					position2=6;
					result = "Player 2 is on square 6";
				}
				else if(position2==46)
				{
					position2=25;
					result = "Player 2 is on square 25";
				}
				else if(position2==49)
				{
					position2=11;
					result = "Player 2 is on square 11";
				}
				else if(position2==62)
				{
					position2=19;
					result = "Player 2 is on square 19";
				}
				else if(position2==64)
				{
					position2=60;
					result = "Player 2 is on square 60";
				}
				else if(position2==74)
				{
					position2=53;
					result = "Player 2 is on square 53";
				}
				else if(position2==89)
				{
					position2=68;
					result = "Player 2 is on square 68";
				}
				else if(position2==92)
				{
					position2=88;
					result = "Player 2 is on square 88";
				}
				else if(position2==95)
				{
					position2=75;
					result = "Player 2 is on square 75";
				}
				else if(position2==99)
				{
					position2=80;
					result = "Player 2 is on square 80";
				}
				else if(position2>100)
				{
					position2= 100 - ( position2 -100);
					if(position2==99)
					{
						position2=80;
						result = "Player 2 is on square 80";
					}
					else if(position2==95)
					{
						position2=75;
						result = "Player 2 is on square 75";
					}
					else if(position2==92)
					{
						position2=88;
						result = "Player 2 is on square 88";
					}
					else if(position2==89)
					{
						position2=68;
						result = "Player 2 is on square 68";
					}
					else
					{
						result= "Player 2 is on square " + String.valueOf(position2);
					}
	
				}
				else if(position2==100)
				{
					result = "Player 2 Wins!";
				}
				else
				{
					result = "Player 2 is on square " + String.valueOf(position2);
				}
			}
		}
		return result;
    }
}
