/**
 * Vanshika Jain and Anish Katukam
 */
import javax.swing.*;
import javax.swing.JFrame;

public class MuseumViewer {
    
    public static void main(String[] args) {
        
        
        final int screenWidth = 1500;
        final int screenHeight = 1500;
        
        final JFrame frame = new JFrame();
        frame.setSize(screenHeight, screenHeight);
        frame.add(new Painting((screenHeight/2) - 75, screenHeight/4));
        frame.setVisible(true);
        frame.setTitle("Museum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final AllPeople allPeople = new AllPeople();
        frame.add(allPeople);
        
        frame.setVisible(true);
    }
    
}