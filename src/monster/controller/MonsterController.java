package monster.controller;

import monster.model.MarshmalloMonster;

public class MonsterController
{
	public void start()
	{
		MarshmalloMonster basic = new MarshmalloMonster();
		System.out.println(basic);
		MarshmalloMonster guillermo = new MarshmalloMonster("Guillermo", 4, 4, 2.1, true);
		System.out.println(guillermo);
		System.out.println("I am feeling hungry, I am going to eat one of Guillermo's arms.");
		
	}
}
