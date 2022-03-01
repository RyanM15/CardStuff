import java.util.ArrayList;

public class Card{
	
	 String suit = "";
	 String ranks = "";
	 int point = 0;
	 public Card (String suit, String ranks, int point){
		 this.suit = suit;
		 this.ranks = ranks;
		 this.point = point;
	 }
	 public String toString() {
		 return (ranks + " of " + suit +  ", is point value " + point);
	 }







}
