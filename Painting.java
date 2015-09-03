//ANISH KATUKAM DID THIS

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.geom.Rectangle2D;

public class Painting extends JComponent { 

    private static final int FRAME_WIDTH = 10;    
    private static final Color MAHOGANY = new Color(0x601407);

    private static final BufferedImage OBAMA_LISA;
    private static final BufferedImage PIET;
    
    private static final int OBAMA_LISA_HEIGHT;
    private static final int OBAMA_LISA_WIDTH;
    private static final int PIET_HEIGHT;
    private static final int PIET_WIDTH;
    
    static {
        try {
            OBAMA_LISA = ImageIO.read(new File("mona_lisa.jpg"));
            OBAMA_LISA_HEIGHT = OBAMA_LISA.getHeight();
            OBAMA_LISA_WIDTH = OBAMA_LISA.getWidth();
            
            PIET = ImageIO.read(new File("piet.jpg"));
            PIET_HEIGHT = PIET.getHeight();
            PIET_WIDTH = PIET.getWidth();
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
        g.setColor(MAHOGANY);
        g.fillRect(x - OBAMA_LISA_WIDTH/2 - FRAME_WIDTH - 300, y - OBAMA_LISA_HEIGHT/2 - FRAME_WIDTH - 100, OBAMA_LISA_WIDTH + (FRAME_WIDTH * 2), OBAMA_LISA_HEIGHT + (FRAME_WIDTH * 2));
        g.drawImage(OBAMA_LISA, x - OBAMA_LISA_WIDTH/2 - 300, y - OBAMA_LISA_HEIGHT/2  - 100, null);
        g.setColor(Color.BLACK);
        g.drawRect(x - OBAMA_LISA_WIDTH/2 - 300, y - OBAMA_LISA_HEIGHT/2  - 100, OBAMA_LISA_WIDTH, OBAMA_LISA_HEIGHT);
        g.drawRect(x - OBAMA_LISA_WIDTH/2 - FRAME_WIDTH - 300, y - OBAMA_LISA_HEIGHT/2 - FRAME_WIDTH  - 100, OBAMA_LISA_WIDTH + (FRAME_WIDTH * 2), OBAMA_LISA_HEIGHT + (FRAME_WIDTH * 2));
        
        drawPiet(g);
    }

    public void drawPiet(Graphics g){
        g.setColor(MAHOGANY);
        g.fillRect(x - PIET_WIDTH/2 - FRAME_WIDTH + 300, y - PIET_HEIGHT/2 - FRAME_WIDTH  - 100, PIET_WIDTH + (FRAME_WIDTH * 2), PIET_HEIGHT + (FRAME_WIDTH * 2));
        g.drawImage(PIET, x - PIET_WIDTH/2 + 300, y - PIET_HEIGHT/2  - 100, null);
        g.setColor(Color.BLACK);
        g.drawRect(x - PIET_WIDTH/2 + 300, y - PIET_HEIGHT/2, PIET_WIDTH, PIET_HEIGHT  - 100);
        g.drawRect(x - PIET_WIDTH/2 - FRAME_WIDTH + 300, y - PIET_HEIGHT/2 - FRAME_WIDTH  - 100, PIET_WIDTH + (FRAME_WIDTH * 2), PIET_HEIGHT + (FRAME_WIDTH * 2));
    }
}
