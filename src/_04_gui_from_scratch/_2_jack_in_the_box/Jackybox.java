package _04_gui_from_scratch._2_jack_in_the_box;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jackybox implements ActionListener {
	int num = 0;
	public void showButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.setVisible(true);
	
		button.setVisible(true);
frame.add(button);
	
		button.addActionListener(this);
	frame.pack();	
			
		}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		num ++;
		if(num>4) {
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
	}
	private void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage1(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage1(String fileName) {
	     try {
	          java.net.URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();}
	     }



	private JLabel createLabelImage(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

