package _04_gui_from_scratch._3_sound_effects_machine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SOUNDAFFECTMACHINE implements ActionListener {
	
	JButton button = new JButton();
	JButton glutton = new JButton();
	JButton g = new JButton();
	public void showButton(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		button.addActionListener(this);
		glutton.addActionListener(this);
		g.addActionListener(this);
		frame.add(panel);
		panel.add(g);
		panel.add(glutton);
		panel.add(button);
		frame.setVisible(true);
		frame.pack();
	}
	
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
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


	@Override
	public void actionPerformed(ActionEvent arg0) {
if(button.equals(arg0.getSource())) {
	playSound("aaaahh.wav");
}
if(glutton.equals(arg0.getSource())) {
	playSound("awesomeTrack.mp3");
}
if(g.equals(arg0.getSource())) {
	playSound("fart-01.wav");
}
	}
}
