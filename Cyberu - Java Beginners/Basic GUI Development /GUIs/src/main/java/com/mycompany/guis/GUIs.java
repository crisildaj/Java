package com.mycompany.guis;

import java.awt.Dimension;

// Swing is a type of GUI. The Swing library contains Java classes and components that provide tools for creating desktop based GUI applications.
import javax.swing.*;

/* GUI (Graphical User Interface) development =  refers to the process of creating the visual elements and interactive components of a software application 
that allow users to interact with the program using a graphical interface, such as 
windows, buttons, menus, icons, and other visual elements, rather than just text-based commands */

public class GUIs {

    public static void main(String[] args) {
        // Define a Runnable Task called GUITask to create and display the GUI
        Runnable GUITask = new Runnable() {

            @Override
            public void run () {
                // Call the MakeGUI method to create the GUI
                MakeGUI();
            }
        };
        
        // Use SwingUtilities.invokeLater() to run the GUI task on the Event Dispatch Thread (EDT)
        // SwingUtilities.invokeLater()queues task specified for the EDT to process sequentially 
        SwingUtilities.invokeLater(GUITask);
        /* In Java Swing applications, you should execute code that interacts with the GUI on a specific thread called Event Dispatch Thread (EDT)
         * EDT = a thread in Swing applications responsible for handling GUI events:
         *  - button clicks, mouse movements, repaint requests
         * EDT ensures GUI interactions are processed sequentially, without interference 
          */
        
    }

    private static void MakeGUI() {
        
        // Create a JFrame (a window) with the title "Hello World GUI"
        JFrame frame = new JFrame ("Hello World GUI");

        // Set the default close operation to exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Sets dimensions for GUI
        frame.setPreferredSize(new Dimension(400, 400));

        // JLabel = text label
        JLabel label = new JLabel("Hi, I am a GUI.");

        // Add JLabel to the content pane of the JFrame
        frame.getContentPane().add(label);

        // Automatically adjust the size of the window to fit its contents (the JLabel)
        frame.pack();

        // Make the window visible to the user
        frame.setVisible(true);
    }
}
