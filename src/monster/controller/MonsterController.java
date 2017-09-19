package monster.controller;

import monster.model.MarshmalloMonster;
import java.util.Scanner;

public class MonsterController
{
	public void start()
	{
		MarshmalloMonster basic = new MarshmalloMonster();
		System.out.println(basic);
		MarshmalloMonster guillermo = new MarshmalloMonster("Guillermo", 4, 4, 2.1, true);
		System.out.println(guillermo);
		System.out.println("I am feeling hungry, I am going to eat one of Guillermo's arms.");
		guillermo.setArmCount(guillermo.getArmCount() - 1);
		System.out.println(guillermo);
		
		interactWithMonster(guillermo);
	}
	
	private void interactWithMonster(MarshmalloMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want eat, please type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println("How many arms are you interested in eating?, It has " + currentMonster.getArmCount());
		int armEat = myScanner.nextInt();
		
		if(armEat == 0)
		{
			System.out.println("Not hungry? Oh so sad... ");
		}
		else if(armEat < 0)
		{
			System.out.println("Reality is hard for you - it is impossible to eat a negative amount");
		}
		else if(armEat > currentMonster.getArmCount())
		{
			System.out.println("You are not allowed to eat more than exist on me xD ");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("OK, now it has this many arms: " + currentMonster.getArmCount());
		}
		
		
		myScanner.close();
		
	}
}
