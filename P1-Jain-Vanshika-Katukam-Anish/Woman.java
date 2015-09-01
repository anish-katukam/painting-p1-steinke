import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;

/**
 * The people that are looking at the painting go in here
 * 
 * @author Vanshika Jain
 * @version #1
 */

public class Woman
{
    private int xRight;
    private int yUp;
    Color bodyColor;
    public Woman(int x, int y, Color c){
        xRight = x;
        yUp = y;
        bodyColor = c;
    }
    public void draw(Graphics2D g2){
        g2.setColor(bodyColor);
        Rectangle body = new Rectangle(xRight + 100, yUp + 550, 50, 75);
        g2.draw(body);
        g2.fillRect(xRight + 100, yUp + 550, 50, 75);
        g2.setColor(Color.black);
        Ellipse2D.Double head = new Ellipse2D.Double(xRight + 100, yUp + 500, 50, 50);
        g2.draw(head);
        g2.fillOval(xRight + 100, yUp + 500, 50, 50);
        Rectangle hair = new Rectangle(xRight + 102, yUp + 525, 45, 50);
        g2.draw(hair);
        g2.fillRect(xRight + 102, yUp + 525, 45, 50);
        g2.setColor(Color.black);
        Line2D.Double armOne = new Line2D.Double(xRight + 100, yUp + 587, xRight + 60, yUp + 560);
        g2.draw(armOne);
        Line2D.Double armTwo = new Line2D.Double(xRight + 150, yUp + 587, xRight + 190, yUp + 560);
        g2.draw(armTwo);
        Line2D.Double legOne = new Line2D.Double(xRight + 117, yUp + 625, xRight + 117, yUp + 700);
        g2.draw(legOne);
        Line2D.Double legTwo = new Line2D.Double(xRight + 133, yUp + 625, xRight + 133, yUp + 700);
        g2.draw(legTwo);
    }
}
