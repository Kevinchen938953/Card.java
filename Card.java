/* Deck of Cards
52 Cards
4 sets of thirteen faces
foursuits of thirteen ranks
String suit = {"hearts",diamonds","spades","clubls"}
String ranks = {"2", "3"}
int[] value = {1, 2, 3, 4,5, 6}

Card object            
suit
rank 
int value
Deck object
* collection of cards
* 
* Come up with a solution that creates a deck of cards and prints out that deck
* can I compare one card to another
* 
*/

public class Cards
{
	String suits;
	int values;
	int ranks;
	public Cards(String suits, int values, int ranks)
	{
		this.suits = suits;
		this.values = values;
		this.ranks = ranks;
	}
	public String toString()
	{
		return(" " + suits + " " + values + " " + ranks + " ");
	}

}
	
