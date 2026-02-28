import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;


public class GUI extends JFrame implements ActionListener {
    public static final int MAX_POINTS = 10;
    private Point[] tabPoints = new Point[MAX_POINTS];
    private int number = 0;
    private JPanel draw;
    public static final int DRAW_SIZE = 400;
    private Color changeColorDraw = Color.BLACK;
   
    public GUI(){
       super("GUI 6");
       setSize(DRAW_SIZE, DRAW_SIZE);
        
        JPanel panneau1 = new JPanel();
        panneau1.setBackground(Color.BLUE);
        add(panneau1, BorderLayout.NORTH);
        
        JButton bouton1, bouton2;
        bouton1 = new JButton("Shape");
        bouton1.addActionListener(this);
        panneau1.add(bouton1);

        bouton2 = new JButton("Quit");
        bouton2.addActionListener(this);
        panneau1.add(bouton2);

        draw = new DrawPanel();
        draw.setBackground(Color.WHITE);
        add(draw, BorderLayout.CENTER); 
              
        setJMenuBar(createMenu());
        
         setDefaultCloseOperation(EXIT_ON_CLOSE);
   
  }
        JMenuBar createMenu() {
        JMenuBar bar = new JMenuBar();
        
        JMenu menu = new JMenu("Color Menu");
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
       
          // YOUR CODE COMES HERE
    }


   private void addPoint(Point p) {
        if (number < MAX_POINTS)
            tabPoints[number++] = p;
    }

    private class DrawPanel extends JPanel {
        public void paint(Graphics g) {
           // YOUR CODE COMES HERE
        }
    }

   
   public static void main(String[] args) {
     GUI gui;
     gui = new GUI();
     gui.setVisible(true);
  }
}
