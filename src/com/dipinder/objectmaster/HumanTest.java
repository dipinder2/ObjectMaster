package com.dipinder.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human driod = new Human();
		Human Adam = new Human();
		driod.attack(driod);
		System.out.println("Health of the driod went "+driod.getHealth());
	}

}
