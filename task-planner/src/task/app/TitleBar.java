package task.app;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Component;

public class TitleBar extends JPanel {
	  Color lightColor = new Color(252, 221, 176);

	    TitleBar() {
	        this.setPreferredSize(new Dimension(400, 80)); // Size of the title bar
	        this.setBackground(lightColor); // Color of the title bar
	        JLabel titleText = new JLabel("To Do List"); // Text of the title bar
	        titleText.setPreferredSize(new Dimension(200, 60)); // Size of the text
	        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20)); // Font of the text
	        titleText.setHorizontalAlignment(JLabel.CENTER); // Align the text to the center
	        this.add(titleText); // Add the text to the title bar
	    }
}
