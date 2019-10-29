public class Wilder 
{
	//Attributs
	private String name;
    private boolean aware;
    
    //Constructeur
	public Wilder(String name, boolean aware)
	{
		this.name = name;
		this.aware = aware;
    }
	
    //Getters
	public String getName() 
	{
		return this.name;
	}
	
	public boolean getAware()
	{
		return this.aware;
	}

	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	//Méthodes
	public String whoAmI() 
	{	
		if(this.getAware()) 
		{
			return " Je m'appelle " + this.getName() + " et je suis aware";
		}
		else 
		{ 
			return " Je m'appelle " + this.getName() + " et je ne suis pas aware";
		}
	}
}

