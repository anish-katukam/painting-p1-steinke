import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Painting extends JComponent { 

    private static final BufferedImage MONA_LISA;

    static {
        try {
            MONA_LISA = ImageIO.read(new File("C:\\mona_lisa.jpg"));
        } catch (IOException e) {
            throw new RuntimeException("Image not found.", e);
        }
    }
    
    private final int x, y;

    public Painting(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(MONA_LISA, x - MONA_LISA.getWidth()/2, y - MONA_LISA.getHeight()/2, null);
    }

}
