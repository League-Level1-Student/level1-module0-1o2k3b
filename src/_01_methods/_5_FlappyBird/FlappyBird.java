package _01_methods._5_FlappyBird;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class FlappyBird extends PApplet  {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

int upperPipeHeight = (int) random(100, 400);
    int y = 0;
    int gravity = 1;
    int v = 0;
    int e = 0;
    int x = 698;		
    int pg = 0;
	int lowerY = 0;
	int high = 0;
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        size(width, height);
     String w = JOptionPane.showInputDialog("select a pixel amount, that will be the pixel gap");
   pg = Integer.parseInt(w);
   lowerY = upperPipeHeight + pg;
   high = HEIGHT-lowerY;
    }

    @Override
    public void draw() {

    	Random R = new Random();
    	fill(0, 0, 100); 
    	background(70, 85, 30);
    	fill(0, 120, 55);
 rect(x-=5, 0, 100, upperPipeHeight);
   fill(0, 120, 55);
   rect(x-=3, lowerY, 100, high);
 
   if(x<=0) {
	 x=698;
	 upperPipeHeight = R.nextInt(400);
	 lowerY = upperPipeHeight + pg;
	   high = HEIGHT-lowerY;
   }
	 
if(mousePressed) {
	v= -10;
}
if(y<0) {
	y=0;
	
}
if(y == 600 || intersectsPipes()==true) {
	JOptionPane.showMessageDialog(null, "game overrrrr.");
	System.exit(0);
}
 v+=gravity;
 y+=v;
 if(y>HEIGHT) {
  y =HEIGHT;
  
 }
 fill(0, 32, 58);
      ellipse(100, y, 25, 25);
 
    

     
      
    }
 
    boolean intersectsPipes() { 
        if (y < upperPipeHeight && 100 > x && 100 < (x+100)){
        	System.out.println(y + " " + upperPipeHeight);
           return true; }
       else if (y>lowerY && 100 > x && 100 < (x+100)) {
           return true; }
       else {System.out.println("no"); return false; }
}

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }


	}

