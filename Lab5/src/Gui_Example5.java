import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui_Example5 extends JFrame implements ActionListener {
    public static final int MAX_POINTS = 10;
    private Point[] tabPoints = new Point[MAX_POINTS];
    private int number = 0;
    private JPanel draw;
    public static final int DRAW_SIZE = 400;

    public Gui_Example5() {
        super("GUI 5");
        setSize(DRAW_SIZE, DRAW_SIZE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        add(panel1, BorderLayout.NORTH);

        JButton button1, button2;
        button1 = new JButton("Shape");
        button1.addActionListener(this);
        panel1.add(button1);

        button2 = new JButton("Quit");
        button2.addActionListener(this);
        panel1.add(button2);

        draw = new DrawPanel();
        draw.setBackground(Color.WHITE);
        add(draw, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Shape")) {
            addPoint(new Point((int)(Math.random() * DRAW_SIZE), (int)(Math.random() * DRAW_SIZE)));
            draw.repaint();
        } else {
            System.out.println("Quit button is pressed");
        }
    }

    private void addPoint(Point p) {
        if (number < MAX_POINTS) {
            tabPoints[number++] = p;
        }
    }

    private class DrawPanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 1; i < number; i++)
                g.drawLine((int)(tabPoints[i - 1].getX()), (int)(tabPoints[i - 1].getY()),
                        (int)(tabPoints[i].getX()), (int)(tabPoints[i].getY()));
        }
    }

    public static void main(String[] args) {
        Gui_Example5 gui;
        gui = new Gui_Example5();
        gui.setVisible(true);
    }
}

// Implemented drawing functionality for shape button, quit button still doesnt work