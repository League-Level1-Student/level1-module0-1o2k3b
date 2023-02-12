package _01_methods._5_FlappyBird;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class FlappyBird extends PApplet  {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int y = 0;
    int gravity = 1;
    int v = 0;
    int e = 0;
    		
    
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        size(width, height);
     
    }

    @Override
    public void draw() {
      fill(0, 200, 55);
      rect()
    	background(70, 85, 30);  
      fill(0, 0, 100);
  stroke(0, 39, 52);
 int x = 25;
if(mousePressed) {
	v= -10;
}
if(y<0) {
	y=0;
	
}
if(y == 600) {
	JOptionPane.showMessageDialog(null, "game overrrrr.");
	System.exit(0);
}
 v+=gravity;
 y+=v;
 if(y>HEIGHT) {
  y =HEIGHT;
  
 }
 
      ellipse(x, y, 25, 25);
 
    

     
      
    }
 


    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }


	}

