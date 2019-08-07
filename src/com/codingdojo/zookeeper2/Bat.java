package com.codingdojo.zookeeper2;

public class Bat extends Mammal{
    
	public void fly() {
		energyLevel -= 50;
		System.out.println("ZZZZZOOOOOOMMMM!");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel +=25;
		System.out.println("NOM NOM");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -=100;
		System.out.println("BURN BABY BURN!!! HAHAHAHAHAH");
		displayEnergy();
	}
}
