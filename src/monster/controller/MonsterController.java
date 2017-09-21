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
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many arms you want to eat, please type in how many");
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		//int consumed = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
		//System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
		//System.out.println("How many arms are you interested in eating? It has " + currentMonster.getArmCount());
		int eyeEat = 0;
		String eyes = popup.getResponse("How many eyes are you interested in eating? It has " + currentMonster.getEyeCount());
		
		if(isValidInteger(eyes))
		{
			eyeEat = Integer.parseInt(eyes);
		}
		currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeEat);
		//System.out.println("OK, now it has this many arms: " + currentMonster.getArmCount());
		popup.displayText("OK, now it has this many eyes: " + currentMonster.getEyeCount());
		
		//System.out.println("How many eyes are you interested in eating? It has " + currentMonster.getEyeCount());
		String tentacleResponse= popup.getResponse("How many tentacles are you interested in eating? It has " + currentMonster.getTentacleAmount());
		double food = 0.0;
		
		if(isValidDouble(tentacleResponse))
		{
			food = Integer.parseDouble(tentacleResponse);
		}
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - food);
		//System.out.println("OK, now it has this many eyes: " + currentMonster.getEyeCount());
		popup.displayText("OK, now it has this many tentacles: " + currentMonster.getTentacleAmount()));
		
		popup.displayText("Hi there ready to play???");
		
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
	
}
