import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SOUNDAFFECTMACHINE {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton glutton = new JButton();
		JButton g = new JButton();
		button.addActionListener(this);
		glutton.addActionListener(this);
		g.addActionListener(this);
		frame.add(panel);
		panel.add(g);
		panel.add(glutton);
		panel.add(button);
		frame.pack();
	}
	
	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
}
