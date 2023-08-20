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

public class Footer extends JPanel{
	  JButton addTask;
	    JButton clear;

	    Color orange = new Color(233, 133, 128);
	    Color lightColor = new Color(252, 221, 176);
	    Border emptyBorder = BorderFactory.createEmptyBorder();

	    Footer() {
	        this.setPreferredSize(new Dimension(400, 60));
	        this.setBackground(lightColor);

	        addTask = new JButton("Add Task"); // add task button
	        addTask.setBorder(emptyBorder); // remove border
	        addTask.setFont(new Font("Sans-serif", Font.ITALIC, 20)); // set font
	        addTask.setVerticalAlignment(JButton.BOTTOM); // align text to bottom
	        addTask.setBackground(orange); // set background color
	        this.add(addTask); // add to footer

	        this.add(Box.createHorizontalStrut(20)); // Space between buttons

	        clear = new JButton("Clear finished tasks"); // clear button
	        clear.setFont(new Font("Sans-serif", Font.ITALIC, 20)); // set font
	        clear.setBorder(emptyBorder); // remove border
	        clear.setBackground(orange); // set background color
	        this.add(clear); // add to footer
	    }

	    public JButton getNewTask() {
	        return addTask;
	    }

	    public JButton getClear() {
	        return clear;
	    }
}
