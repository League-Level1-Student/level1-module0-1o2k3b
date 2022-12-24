package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot("mini");	
	Random ran = new Random();
	public void run() {
		// Check the recipe to find out what code to put here

		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		for(int i = 0; i < 9; i++) {
		int r = ran.nextInt(2);
		if(r == 1) {
			flat(ran.nextInt(101)+100, ran.nextInt(255),  ran.nextInt(255),  ran.nextInt(255));
		}
		if(r == 0) {
			tri(ran.nextInt(21)+50, ran.nextInt(255),  ran.nextInt(255),  ran.nextInt(255));
		}
		}
		
	
	}
		public void flat(int height, int red, int green, int blue){
			
			rob.setSpeed(100);
			rob.setPenColor(red, green, blue);
			rob.move(height);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
			rob.setPenColor(0, 165, 55);
			rob.move(25);
			rob.turn(-90);
		}
		public void tri(int height, int red, int green, int blue){
			
			rob.setSpeed(100);
			rob.setPenColor(red, green, blue);
			rob.move(height);
			rob.turn(45);
			rob.move(30);
			rob.turn(90);
			rob.move(30);
			rob.turn(45);
			rob.move(height);
			rob.turn(-90);
			rob.setPenColor(0, 165, 55);
			rob.move(25);
			rob.turn(-90);
		}
			
		}
	

