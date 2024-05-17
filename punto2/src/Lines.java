import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Lines extends Lienzo implements MouseListener {

    ArrayList<Point> Points;
    
    public Lines() {
        super();
        Points = new ArrayList<Point>();
        lienzo.addMouseListener(this);
    }

    public void paint(Graphics g) {
        if (Points.size() <= 1) return;

        g.setPaintMode();
        g.setColor(Color.BLACK);
        g.drawLine(0,0, 100, 100);

        for (int i = 0; i < Points.size() && Points.size() % 2 == 0; i+=2) {
            g.drawLine( (int)Points.get(i).getX(), (int)Points.get(i).getY(), 
                        (int)Points.get(i+1).getX(), (int)Points.get(i+1).getY());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Points.add(e.getPoint());
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }



}
