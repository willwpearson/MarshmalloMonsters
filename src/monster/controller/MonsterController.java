package monster.controller;

import monster.model.MarshmalloMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	//creates method that calls on MonsterDisplay popups.
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	//creates display for the first few popups. Samples of coding with loops.
	public void start()
	{
//		int count = 0;
//		while(count < 10)
//		{
//			popup.displayText("Am I not the coolest???");
//			count += 2;
//		}
		
//		for(int loop = 0; loop < 10; loop += 1)
//		{
//			popup.displayText("This is loop #" + (loop + 1) + " of 10.");
//		}
//		
		
		MarshmalloMonster basic = new MarshmalloMonster();
		//System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmalloMonster guillermo = new MarshmalloMonster("Guillermo", 4, 4, 2.1, true);
		//System.out.println(guillermo);
		popup.displayText(guillermo.toString());
		//System.out.println("I am feeling hungry, I am going to eat one of Guillermo's arms.");
		popup.displayText("I am feeling hungry, I am going to eat one of Guillermo's arms.");
		guillermo.setArmCount(guillermo.getArmCount() - 1);
		//System.out.println(guillermo);
		popup.displayText(guillermo.toString());
		
		interactWithMonster(guillermo);
	}
	//creates display and popups based on user input.
	private void interactWithMonster(MarshmalloMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		//System.out.println(currentMonster.getName() + " wants to know how many tentacles you want eat, please type in how many");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many arms you want to eat, please type in how many");
		
		//checks if response is Integer.
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		//creates popups based on what the user input was.
		if(consumed == 0)
		{
			popup.displayText("Not hungry???");
		}
		else if(consumed < 0)
		{
			popup.displayText("You can't do that.");
		}
		else if(consumed > currentMonster.getArmCount())
		{
			popup.displayText("You can't eat more than what he has.");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			popup.displayText(currentMonster.toString());
		}
		//int consumed = myScanner.nextInt();
		//System.out.println(currentMonster.getArmCount();
		//System.out.println("How many arms are you interested in eating? It has " + currentMonster.getArmCount());
		int eyeEat = 0;
		String eyeResponse = popup.getResponse("How many eyes are you interested in eating? It has " + currentMonster.getEyeCount());
		
		//checks if response is integer.
		if(isValidInteger(eyeResponse))
		{
			eyeEat = Integer.parseInt(eyeResponse);
		}
		
		//creates popups based on what the user input was.
		if(eyeEat == 0)
		{
			popup.displayText("Really not hungry???");
		}
		else if(eyeEat < 0)
		{
			popup.displayText("C'mon, you can't do that...");
		}
		else if(eyeEat > currentMonster.getEyeCount())
		{
			popup.displayText("dood, c'mon...");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeEat);
			popup.displayText("OK, now it has this many eyes: " + currentMonster.getEyeCount());
		}
		//System.out.println("OK, now it has this many arms: " + currentMonster.getArmCount());
		
		//System.out.println("How many eyes are you interested in eating? It has " + currentMonster.getEyeCount());
		String tentacleResponse= popup.getResponse("How many tentacles are you interested in eating? It has " + currentMonster.getTentacleAmount());
		double food = 0.0;
		
		//checks if user input a Double.
		if(isValidDouble(tentacleResponse))
		{
			food = Double.parseDouble(tentacleResponse);
		}
		
		//creates popups based on what the user input was.
		if(food == 0)
		{
			popup.displayText("Not ever hungry???");
		}
		else if(food < 0)
		{
			popup.displayText("You really should have this by now");
		}
		else if(food > currentMonster.getTentacleAmount())
		{
			popup.displayText("xD nope");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - food);
			popup.displayText("OK, now it has this many tentacles: " + currentMonster.getTentacleAmount());
		}
		//System.out.println("OK, now it has this many eyes: " + currentMonster.getEyeCount());
		
		myScanner.close();
		
	}
	//creates helper method for Int
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
	//creates helper method for Double
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input a double, " + sampleDouble + "is not valid.");
		}
		return valid;
	}
	//creates helper method for Boolean
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Type in a boolean value" + sampleBoolean + "does not count.");
		}
		
		return valid;
	}
}
