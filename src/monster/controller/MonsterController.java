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
		armEat(guillermo);
	}
	
	private void interactWithMonster(MarshmalloMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want eat, please type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		myScanner.close();
		
	}
	
	private void armEat(MarshmalloMonster myMonster)
	{
		Scanner armScanner = new Scanner(System.in);
		System.out.println(myMonster.getName() + " wants to know how many arms you want to eat, please type in how many");
		int eaten = armScanner.nextInt();
		myMonster.setArmCount(myMonster.getArmCount() - eaten);
		System.out.println(myMonster);
		
		armScanner.close();
	}
}
