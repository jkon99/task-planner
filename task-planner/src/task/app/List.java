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

public class List extends JPanel{
	
	  Color lightColor = new Color(252, 221, 176);

	    List() {

	        GridLayout layout = new GridLayout(10, 1);
	        layout.setVgap(5); // Vertical gap

	        this.setLayout(layout); // 10 tasks
	        this.setPreferredSize(new Dimension(400, 560));
	        this.setBackground(lightColor);
	    }

	    public void updateNumbers() {
	        Component[] listItems = this.getComponents();

	        for (int i = 0; i < listItems.length; i++) {
	            if (listItems[i] instanceof Task) {
	                ((Task) listItems[i]).changeIndex(i + 1);
	            }
	        }

	    }

	    public void removeCompletedTasks() {

	        for (Component c : getComponents()) {
	            if (c instanceof Task) {
	                if (((Task) c).getState()) {
	                    remove(c); // remove the component
	                    updateNumbers(); // update the indexing of all items
	                }
	            }
	        }

	    }
}
