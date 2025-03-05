import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;



public class Slider extends JButton implements MouseMotionListener {
    private int stickCont = 5;
    private int stickX = getWidth() / 2-10;
    private int penSize = 5;

    public Slider(int w, int h, int stickCount) {
        setSize(w,h);
        this.stickCont  = stickCount;
        stickX = getWidth() / 2-10;
        addMouseMotionListener(this);

    }
    public int getPenSize() {
        return penSize;
    }

    public void setStickCount(int stickCount){
        this.stickCont = stickCount;
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLACK);
        g.drawLine(10, getHeight() / 2, getWidth()-10, getHeight()/2);

        for (int i = 0; i <= stickCont; i++) {
            g.drawLine(10 + (getWidth()-20)/stickCont*i, getHeight()/2-10, 10 + (getWidth()-20)/stickCont*i, getHeight()/2+10);
        }
        g.setColor(Color.RED);
        g.fillOval(stickX, getHeight()/2-10, 20, 20);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        stickX = e.getX();
        if (stickX < 10) stickX = 10;
        if (stickX > getWidth()-10) stickX = getWidth()-10;
        penSize = 1 + (stickX - 10) * (50 - 1) / (getWidth() - 40);
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
