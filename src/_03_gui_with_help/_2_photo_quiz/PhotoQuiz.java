package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
String holycow = "https://i.pinimg.com/736x/fb/0e/b5/fb0eb5ca2491dd57e737705c615b723a.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component Imagee = createImage(holycow);
		// 3. use the "createImage()" method below to initialize your Component
quizWindow.add(Imagee);
		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("what animal is this");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("holy cow")) {
	JOptionPane.showMessageDialog(null, "Holy cow, you got it");
} else {
	JOptionPane.showMessageDialog(null, "you messd up, now da greater cow (holy cow) shall kill you");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(Imagee);
		// 10. find another image and create it (might take more than one line
		// of code)
String fits = "https://i.pinimg.com/236x/1d/38/71/1d38713804ad0c4dd97d50623a01ed83--food-bowl-food-networktrisha.jpg";
Component image = createImage(fits);
		// 11. add the second image to the quiz window
quizWindow.add(image);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answe2 = JOptionPane.showInputDialog("what animal is curled up");
		// 14+ check answer, say if correct or incorrect, etc.
if(answe2.equals("cat")) {
	JOptionPane.showMessageDialog(null, "yu gotted it");
} else {
	JOptionPane.showMessageDialog(null, "yu scred up");
}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
