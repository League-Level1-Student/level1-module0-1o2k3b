package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        size(width, height);
    }

    @Override
    public void draw() {
      
    	background(70, 85, 30);  
      fill(0, 0, 100);
      stroke(0, 39, 52);
      while(1==1) {
    	  
    	  ellipse(x, y, 25, 25);
      }
     
      
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
