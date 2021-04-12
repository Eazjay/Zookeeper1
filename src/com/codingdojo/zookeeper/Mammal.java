package com.codingdojo.zookeeper;

public class Mammal {
	private boolean satisfaction = false;
	int energyLevel = 100;
	
	public void displayEnergy() {
		int showEnergyLevel = energyLevel;
		System.out.println(showEnergyLevel);
	}
	public void eatSomething() {
		satisfaction = true;
		System.out.println("Yummy!");
	}
	public boolean isSatisfied() {
		return satisfaction;
	}
}
