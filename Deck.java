/* Deck of cards
52 cards
4 sets of 13 faces
4 suits of 13 ranks
String[] suit = {"hearts", "diamonds", "spades", "clubs"};
String[] ranks = {"2","3", "4", "5"};
* int[] value = {1,2,3,4};

Card Object						Deck Object
  
  suit							  'collection' of cards
  rank							  
  int value						??build a deck of cards?
  */
  import java.util.ArrayList;
  public class Deck{
	  
	 
	
		  
		String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"9", "10", "J", "Q", "K", "A"};
		int[] points = {1,2,3,4,5,6};
	  
		ArrayList<Card> d1 = new ArrayList<Card>();
		  
	  public Deck() {
	  
		for(int i = 0; i < suit.length; i++)
		{
			for(int k = 0; k < ranks.length; k++)
			{
				d1.add(new Card(suit[i], ranks[k]));
			
			  	  
			}
			  
		}
	  }
	  
	  public void print(){
		  
		  for(int i = 0; i < d1.size(); i++)
		  {
			  System.out.println(d1.get(i).toString());
		  }
	  }
  
  
	  
	 
  
  
  
  
  }
