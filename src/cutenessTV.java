import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {

	public static void main(String[] args) {
		new cutenessTV().createUI();
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
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton middleButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {

		frame.add(panel);
		frame.setVisible(true);
		leftButton.setText("Ducks");
		rightButton.setText("Frog");
		middleButton.setText("Fluffy Unicorn");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		middleButton.addActionListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		panel.add(middleButton);
		frame.pack();
		frame.setTitle("cuteness tv");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==leftButton) {
			showDucks();
		}
		if(e.getSource()==rightButton) {
			showFrog();
		}
		if(e.getSource()==middleButton) {
			showFluffyUnicorns();
		}
	}}


