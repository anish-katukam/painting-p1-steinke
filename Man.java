import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import java.util.Random;

/**
 * The people that are looking at the painting go in here
 * 
 * @author Vanshika Jain
 * @version #1
 */

public class Man
{
    private int xLeft;
    private int yDown;
    Color shirtColor;
    public Man(int x, int y, Color s){
        xLeft = x;
        yDown = y;
        shirtColor = s;
    }
    
    public void draw(Graphics2D g2){
        g2.setColor(shirtColor);
        Rectangle body = new Rectangle(xLeft + 100, yDown + 550, 50, 75);
        g2.draw(body);
        g2.fillRect(xLeft + 100, yDown + 550, 50, 75);
        g2.setColor(Color.black);
        Ellipse2D.Double head = new Ellipse2D.Double(xLeft + 100, yDown + 500, 50, 50);
        g2.draw(head);
        g2.fillOval(xLeft + 100, yDown + 500, 50, 50);
        g2.setColor(Color.orange);
        Arc2D.Double hair = new Arc2D.Double(xLeft + 100, yDown + 500, 50, 50, 180, 180, Arc2D.CHORD);
        g2.draw(hair);
        g2.fillArc(xLeft + 100, yDown + 500, 50, 50, 180, 180);
        g2.setColor(Color.black);
        Line2D.Double armOne = new Line2D.Double(xLeft + 100, yDown + 587, xLeft + 60, yDown + 560);
        g2.draw(armOne);
        Line2D.Double armTwo = new Line2D.Double(xLeft + 150, yDown + 587, xLeft + 190, yDown + 560);
        g2.draw(armTwo);
        Line2D.Double legOne = new Line2D.Double(xLeft + 117, yDown + 625, xLeft + 117, yDown + 700);
        g2.draw(legOne);
        Line2D.Double legTwo = new Line2D.Double(xLeft + 133, yDown + 625, xLeft + 133, yDown + 700);
        g2.draw(legTwo);
        
    }
}
