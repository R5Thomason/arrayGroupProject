package array.controller;

import array.model.PiranhaPlant;

public class ArrayController
{
	private String [][] myStrings;
	private int [][] myNumbers;
	private PiranhaPlant [][] myGarden;
	 
	public ArrayController()
	{
		myStrings = new String [4][4];
		myNumbers = new int [5][3];
		myGarden = new PiranhaPlant [6][4];
	}
	
	public void start()
	{
		fillStringList();
		fillNumberList();
		growPiranhaPlants();
		changeOddNumbers();
		changeGarden();
	}
	
	public void fillStringList()
	{
		for(int row = 0; row < myStrings.length; row++)
		{
			for(int col = 0; col < myStrings[0].length; col++)
			{
				myStrings[row][col] = "Wooooooooo";
			}
		}
	}
	
	public void fillNumberList()
	{
		myNumbers [0][0] = 0;
		myNumbers [0][1] = 1;
		myNumbers [0][2] = 2;
		myNumbers [1][0] = 3;
		myNumbers [1][1] = 4;
		myNumbers [1][2] = 5;
		myNumbers [2][0] = 6;
		myNumbers [2][1] = 7;
		myNumbers [2][2] = 8;
		myNumbers [3][0] = 9;
		myNumbers [3][1] = 10;
		myNumbers [3][2] = 11;
		myNumbers [4][0] = 12;
		myNumbers [4][1] = 13;
		myNumbers [4][2] = 14;
	}
	
	public void growPiranhaPlants()
	{
		for(int row = 0; row < myGarden.length; row++)
		{
			for(int col = 0; col < myGarden[0].length; col++)
			{
				myGarden[row][col] = new PiranhaPlant();
			}
		}
	}
	
	public void changeOddNumbers()
	{
		for(int row = 0; row < myNumbers.length; row++)
		{
			for(int col = 0; col < myNumbers[0].length; col++)
			{
				if(myNumbers[row][col] % 2 == 1)
				{
					myNumbers[row][col] = myNumbers[row][col] * 2;
				}
			}
		}
	}
	
	public void changeGarden()
	{
		for(int row = 0; row < myGarden.length; row++)
		{
			for(int col = 0; col < myGarden[0].length; col++)
			{
				myGarden[row][col].setTeeth(row + 5);
				myGarden[row][col].setSpots(col * 3);
				myGarden[row][col].setHasFire(true);
			}
		}
	}
}
