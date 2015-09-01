/**
 * Vanshika Jain 
 * August 24, 2015
 */

import javax.swing.JFrame;

public class MuseumViewer{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("Museum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AllPeople allPeople = new AllPeople();
        frame.add(allPeople);
        
        frame.setVisible(true);
    }
}