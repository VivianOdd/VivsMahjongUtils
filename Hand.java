public class Hand
{
	final int HAND_SIZE = 13;
	Tile[] hand = new Tile[HAND_SIZE]; 
	//creates a hand with nothing in it
	public Hand()
	{
		
	}
	
	//creates a hand based on a single string as input
	public Hand(String h)
	{
		if(h.length() == HAND_SIZE*2)
		{
			//this sucks LMFAO
			//parses a string and makes it into a hand. checks for valid input length but thats about it
			
			
			String t;
			int rank;
			char suit;
			
			for(int i =0;i<h.length();i+=2)
			{
				t = h.substring(i,i+2);
				rank = h.charAt(0);
				suit = h.charAt(1);
				hand[i/2] = new Tile(rank, suit);
			}
			
		}
		else
		{
			System.out.println("ERROR: INCORRECT SIZE! PLEASE ENTER 26 CHARACTERS IN THE FORMAT 2m3m4m5p9s5h(does not need to be sorted)");
		}
	}
	 public void sort() //sorts the hand by rank and suit (m,p,s,h)
	 {
		 
	 }
	 
	 //checks whether or not the hand is a valid hand
	 public boolean validCheck()
	 {
		 //REMOVE
		 return true;
	 }
	 
	 public String printHand()
	 {
		 String handString = "";
		 for(int i =0;i<hand.length;i++)
		 {
			 handString = handString + hand[i].toString();
		 }
		 return handString;
	 }
}