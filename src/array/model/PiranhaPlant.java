package array.model;

public class PiranhaPlant
{
	private int teeth;
	private int spots;
	private boolean hasFire;
	
	public PiranhaPlant()
	{
		teeth = 8;
		spots = 10;
		hasFire = false;
	}

	public int getTeeth()
	{
		return teeth;
	}

	public int getSpots()
	{
		return spots;
	}

	public boolean isHasFire()
	{
		return hasFire;
	}

	public void setTeeth(int teeth)
	{
		this.teeth = teeth;
	}

	public void setSpots(int spots)
	{
		this.spots = spots;
	}

	public void setHasFire(boolean hasFire)
	{
		this.hasFire = hasFire;
	}

}
