import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

public class GUI_ex1 extends JFrame implements ActionListener {
    public static final int MAX_POINTS = 10;
    public static final int DRAW_SIZE = 400;

    private Point[] tabPoints = new Point[MAX_POINTS];
    private int number = 0;
    private JPanel draw;
    private Color changeColorDraw = Color.BLACK;

    public GUI_ex1() {
        super("GUI 6");
        setSize(DRAW_SIZE, DRAW_SIZE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        add(panel1, BorderLayout.NORTH);

        JButton button1 = new JButton("Shape");
        button1.addActionListener(this);
        panel1.add(button1);

        JButton button2 = new JButton("Quit");
        button2.addActionListener(this);
        panel1.add(button2);

        draw = new DrawPanel();
        draw.setBackground(Color.WHITE);
        add(draw, BorderLayout.CENTER);

        setJMenuBar(createMenu());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JMenuBar createMenu() {
        JMenuBar bar = new JMenuBar();


        JMenu menu = new JMenu("ColorMenu");
        bar.add(menu);

        JMenuItem item = new JMenuItem("Black");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Red");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Green");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Blue");
        item.addActionListener(this);
        menu.add(item);

        return bar;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Shape")) {
            addPoint(new Point((int) (Math.random() * DRAW_SIZE),
                    (int) (Math.random() * DRAW_SIZE)));
            draw.repaint();
        } else if (command.equals("Black")) {
            changeColorDraw = Color.BLACK;
            draw.repaint();
        } else if (command.equals("Red")) {
            changeColorDraw = Color.RED;
            draw.repaint();
        } else if (command.equals("Green")) {
            changeColorDraw = Color.GREEN;
            draw.repaint();
        } else if (command.equals("Blue")) {
            changeColorDraw = Color.BLUE;
            draw.repaint();
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
            g.setColor(changeColorDraw);

            for (int i = 1; i < number; i++) {
                g.drawLine((int) tabPoints[i - 1].getX(), (int) tabPoints[i - 1].getY(),
                        (int) tabPoints[i].getX(), (int) tabPoints[i].getY());
            }
        }
    }

    public static void main(String[] args) {
        GUI_ex1 gui = new GUI_ex1();
        gui.setVisible(true);
    }
}

// added color menu, quit still inactive