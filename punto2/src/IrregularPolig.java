import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class IrregularPolig extends Lienzo implements MouseListener {

    ArrayList<Point> Points;
    
    public IrregularPolig() {
        super();
        setTitle("Haz click para dibujar un poligono irregular");
        Points = new ArrayList<Point>();
        lienzo.addMouseListener(this);
    }

    public void paint(Graphics g) {
        if (Points.size() <= 1) return;
        super.paint(g);
        g.setPaintMode();
        g.setColor(Color.BLACK);

        for (int i = 0; i < Points.size(); i++) {
            int index = (i+1) % Points.size();
            g.drawLine( (int)Points.get(i).getX(), (int)Points.get(i).getY(), 
                        (int)Points.get(index).getX(), (int)Points.get(index).getY());
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
