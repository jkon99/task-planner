package task.app;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class TitleBar extends JPanel {
	  Color lightColor = new Color(252, 221, 176);

	    TitleBar() {
	        this.setPreferredSize(new Dimension(400, 80)); // Size of the title bar
	        this.setBackground(lightColor); // Color of the title bar
	        JLabel titleText = new JLabel("Task Planner"); // Text of the title bar
	        titleText.setPreferredSize(new Dimension(200, 60)); // Size of the text
	        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20)); // Font of the text
	        titleText.setHorizontalAlignment(JLabel.CENTER); // Align the text to the center
	        this.add(titleText); // Add the text to the title bar
	    }
}
