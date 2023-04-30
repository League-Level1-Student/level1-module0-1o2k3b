import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jackybox {
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		frame.add(panel);
		panel.add(button);
		frame.pack();
		button.addActionListener((ActionListener) this);
		if(buttonPressed == 5) {
			
		}
		}
	private void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
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

	private JLabel createLabelImage(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
	}

