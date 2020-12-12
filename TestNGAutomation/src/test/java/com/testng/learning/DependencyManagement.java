package com.testng.learning;

import org.testng.annotations.Test;

public class DependencyManagement {

	@Test(enabled=true)
	public void startCar() {
		System.out.println("Start the car");
	}
	
	@Test(dependsOnMethods="startCar")
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	
	@Test(dependsOnMethods="putFirstGear")
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(dependsOnMethods="putSecondGear")
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(dependsOnMethods="putThirdGear")
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}
	
	@Test(dependsOnMethods="startCar")
	public void stopCar() {
		System.out.println("Stop the car");
	}
	
}
