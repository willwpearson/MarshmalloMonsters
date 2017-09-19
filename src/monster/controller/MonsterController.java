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
		System.out.println(currentMonster.getName() + " wants to know how many tentacles you want eat, please type in how many");
		double consumed = myScanner.nextDouble();
		if (consumed == 0)
		{
			System.out.println("You don't want any???");
		}
		else if (consumed < 0)
		{
			System.out.println("You can't do that...");
		}
		else if (consumed > currentMonster.getTentacleAmount())
		{
			System.out.println("It doesn't have that many...");
		}
		else
		{
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - consumed);
		System.out.println(currentMonster);
		}
		
		
		System.out.println("How many arms are you interested in eating? It has " + currentMonster.getArmCount());
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
			System.out.println("You are not allowed to eat more than exist on him xD ");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("OK, now it has this many arms: " + currentMonster.getArmCount());
		}
		
		System.out.println("How many eyes are you interested in eating? It has " + currentMonster.getEyeCount());
		int eyeEat = myScanner.nextInt();
		
		if(eyeEat == 0)
		{
			System.out.println("Really not hungry???" );
		}
		else if(eyeEat < 0)
		{
			System.out.println("Come on, you should know better by now");
		}
		else if(eyeEat > currentMonster.getEyeCount())
		{
			System.out.println("I thought you would have this by now...");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeEat);
			System.out.println("OK, now it has this many eyes: " + currentMonster.getEyeCount());
		}
		
		
		
		
		myScanner.close();
		
	}
}
