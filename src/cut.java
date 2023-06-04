import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cut implements ActionListener {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton buton = new JButton();
	JButton butto = new JButton();
	public void showButton() {
        System.out.println("Button clicked");
        frame.setVisible(true);
        frame.add(panel);
        panel.add(buton);
        panel.add(butto);
        panel.add(button);
        button.addActionListener(this);
        butto.addActionListener(this);
        buton.addActionListener(this);
        button.setText("Ducks");
        buton.setText("Ugly Frogs");
        butto.setText("Unicorns");
        frame.pack();
   }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(button.equals(arg0.getSource())) {
			showDucks();
		}
		if(buton.equals(arg0.getSource())) {
			showFrog();
		}
		if(butto.equals(arg0.getSource())) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
