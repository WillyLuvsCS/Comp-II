import javax.swing.*;
import java.awt.*;
public class Gui_Example2 extends JFrame{

       public static final int DRAW_SIZE = 400;
       public Gui_Example2(){
       super("GUI 2");

       setSize(DRAW_SIZE, DRAW_SIZE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        add(panel1, BorderLayout.NORTH);
        
        JButton button1 = new JButton("Shape");
        panel1.add(button1);

        JButton button2 = new JButton("Quit");
        panel1.add(button2);

        JPanel panel2 = new JPanel();
        add(panel2, BorderLayout.CENTER); 
        panel2.setBackground(Color.WHITE);
        
  }
   public static void main(String[] args) {
       Gui_Example2 gui;
       gui = new Gui_Example2();
       gui.setVisible(true);
  }
}

// Implements button with no functionality

