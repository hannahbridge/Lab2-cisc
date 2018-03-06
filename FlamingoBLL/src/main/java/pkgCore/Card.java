package pkgCore;
import pkgEnum.*;
public class Card implements Comparable 
{

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eSuit eSuit;
	private eRank eRank;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(pkgEnum.eSuit eSuit, pkgEnum.eRank eRanks)
	{
		super();
		this.eSuit = eSuit;
		this.eRank = eRanks;
	}
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	
	@Override
	public int compareTo(Object o) 
	{
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

	}

	public eSuit geteSuit() 
	{
		return eSuit;
	}

	private void seteSuit(eSuit eSuit) 
	{
		this.eSuit = eSuit;
	}
	
	public eRank geteRank() 
	{
		return eRank;
	}

	private void seteRank(eRank eRank) 
	{
		this.eRank = eRank;
	}
	
}
