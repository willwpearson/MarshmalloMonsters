package monster.controller;

import monster.model.MarshmalloMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	public void start()
	{
		MarshmalloMonster basic = new MarshmalloMonster();
		//System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmalloMonster guillermo = new MarshmalloMonster("Guillermo", 4, 4, 2, true);
		//System.out.println(guillermo);
		popup.displayText(guillermo.toString());
		//System.out.println("I am feeling hungry, I am going to eat one of Guillermo's arms.");
		popup.displayText("I am feeling hungry, I am going to eat one of Guillermo's arms.");
		guillermo.setArmCount(guillermo.getArmCount() - 1);
		//System.out.println(guillermo);
		popup.displayText(guillermo.toString());
		
		interactWithMonster(guillermo);
	}
	
	private void interactWithMonster(MarshmalloMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		//System.out.println(currentMonster.getName() + " wants to know how many tentacles you want eat, please type in how many");
		int consumed;
		String response = popup.getResponse(currentMonster.getName() + "wants to know how many tentacles you want to eat, please type in how many");
		
		consumed = Integer.parseInt(response);
		
		//int consumed = myScanner.nextInt();
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - consumed);
		System.out.println(currentMonster);
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
		
		popup.displayText("Hi there ready to play???");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
		System.out.println(answer);
		
		myScanner.close();
		
	}
	
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input an int, " + sample + " is not valid.");
		}
		return valid;
	}
}
