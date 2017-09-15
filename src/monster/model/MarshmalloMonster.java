package monster.model;

public class MarshmalloMonster
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmalloMonster()
	{
		//initializes everything to 0, false or null.
	}
	
	public MarshmalloMonster(String name, int eyeCount, int arms, int tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Yo soy un monstruo, me llamo es " + name + ", yo tengo " + eyeCount + " ojos y " ;
		description += tentacleAmount + " 'tentacles', y yo tengo " + armCount + " brazos!. " + hasBloop + " habla tu ";
		description += " si tengo bloop.";
		return description;
	}
}
