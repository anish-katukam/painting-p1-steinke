/**
 * Vanshika Jain 
 * August 24, 2015
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;

public class AllPeople extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Man man1 = new Man(0, 0, Color.red);
        man1.draw(g2);
        Woman woman1 = new Woman(100, 0, Color.blue);
        woman1.draw(g2);
        Man man2 = new Man(150, 100, Color.yellow);
        man2.draw(g2);
        Woman woman2 = new Woman(300, 10, Color.magenta);
        woman2.draw(g2);
        Woman woman3 = new Woman(400, 10, Color.cyan);
        woman3.draw(g2);
        Man man3 = new Man(250, 100, Color.darkGray);
        man3.draw(g2);
    }
}