import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.sound.sampled.Line;
import javax.swing.JFrame;

public class Multicolor extends Lienzo implements MouseListener {

    ArrayList<Point> Points;
    Map<Integer,Color> Lines = new HashMap<Integer, Color>();
    
    public Multicolor() {
        super();
        setTitle("Haz click para dibujar lineas Multicolor");
        Points = new ArrayList<Point>();
        Lines = new HashMap<Integer, Color>();
        lienzo.addMouseListener(this);
    }

    public void paint(Graphics g) {
        Color lineColor = null;
        g.setPaintMode();
        Random r = new Random();
        lineColor = new Color(r.nextInt());
        g.setColor(lineColor);
        Lines.put(Points.size(), lineColor);
        for (int i = 0; i < Points.size() && Points.size() % 2 == 0; i+=2) {
            g.setColor(Lines.get(i));
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
