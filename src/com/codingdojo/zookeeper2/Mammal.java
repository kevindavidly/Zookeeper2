package com.codingdojo.zookeeper2;

public class Mammal {
	int energyLevel = 300;
	
	public int displayEnergy() {
		System.out.println("Energy level:" + energyLevel);
		return energyLevel;
	}
}
