/**
 * Vanshika Jain and Anish Katukam
 */

import javax.swing.JFrame;

public class MuseumViewer {
    public static void main(String[] args) {
        int SCREEN_WIDTH = 800;
        int SCREEN_HEIGHT = 800;
        
        JFrame frame = new JFrame();
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.add(new Painting(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
        frame.setVisible(true);
        frame.setTitle("Museum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AllPeople allPeople = new AllPeople();
        frame.add(allPeople);
        
        frame.setVisible(true);
    }
}