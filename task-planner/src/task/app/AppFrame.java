package task.app;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class AppFrame extends JFrame {

    private TitleBar title;
    private Footer footer;
    private List list;

    private JButton newTask;
    private JButton clear;
    // private JButton undo;

    AppFrame() {
        this.setSize(400, 600); // 400 width and 600 height
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        this.setVisible(true); // Make visible

        title = new TitleBar();
        footer = new Footer();
        list = new List();

        this.add(title, BorderLayout.NORTH); // Add title bar on top of the screen
        this.add(footer, BorderLayout.SOUTH); // Add footer on bottom of the screen
        this.add(list, BorderLayout.CENTER); // Add list in middle of footer and title

        newTask = footer.getNewTask();
        clear = footer.getClear();

        addListeners();
    }

    public void addListeners() {
        newTask.addMouseListener(new MouseAdapter() {
            @override
            public void mousePressed(MouseEvent e) {
            	if (e.getButton() == MouseEvent.BUTTON1) {
	                Task task = new Task();
	                list.add(task); // Add new task to list
	                list.updateNumbers(); // Updates the numbers of the tasks
	
	                task.getDone().addMouseListener(new MouseAdapter() {
	                    @override
	                    public void mousePressed(MouseEvent e) {
	                    	if (e.getButton() == MouseEvent.BUTTON1) {
	                    		 task.changeState(); // Change color of task
	                             list.updateNumbers(); // Updates the numbers of the tasks
	                             revalidate(); // Updates the frame
	                    	}
	                    }
	                });
            	}
            }

        });

        clear.addMouseListener(new MouseAdapter() {
            @override
            public void mousePressed(MouseEvent e) {
            	if (e.getButton() == MouseEvent.BUTTON1) {
	                list.removeCompletedTasks(); // Removes all tasks that are done
	                repaint(); // Repaints the list
            	}
            }
        });
    }
}
