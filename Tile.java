public class Tile
{
	int rank;
	char suit; //suit value guide: m=manzu, p=pinzu, s=souzu, h=honour, n=null, i=invalid
	
	
	//if no params are given, makes a tile with a suit of null and a rank of zero
	public Tile() 
	{
		rank = 0;
		suit = 'n'; //n for null... dont get confused with man
	}
	
	//proper constructor based on inputs. If either rank or suit is invalid makes them null 
	public Tile(int r, char s)
	{
		
		//gives the tile the inputted rank, unless the rank is not 1-9. honour tiles will be dealt with in the next if block.
		if(r<1||r>9) 
		{
			rank = -1; //invalid input!
		}
		else
		{
		rank = r;
		}
		
		//if the input is an honour tile but an 8 or a 9, rank is -1. the suit is still declared honour right below
		if(s=='h'&&r>7) //for honour tiles: 1=east,2=south,3=west,4=north,5=hatsu,6=chun,7=haku
		{
			rank = -1;
		} 
		
		//gives tile inputted suit
		if(((s!='m'&&s!='p')&&s!='s')&&s!='h')
		{
			suit = 'i'; //i for invalid, different from null
		}
		else
		{
		suit = s;
		}
		
	}
	
	public String toString()
	{
		String tileString = ""+rank+suit;
		return tileString;
	}
	
}