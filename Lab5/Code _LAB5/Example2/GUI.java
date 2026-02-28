import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame{
       public static final int DRAW_SIZE = 400;
       public GUI(){
       super("GUI 2");
       setSize(DRAW_SIZE, DRAW_SIZE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       JPanel panneau1 = new JPanel();
        panneau1.setBackground(Color.BLUE);
        add(panneau1, BorderLayout.NORTH);
        
        JButton bouton1 = new JButton("Shape");
        panneau1.add(bouton1);

        JButton bouton2 = new JButton("Quit");
        panneau1.add(bouton2);

        JPanel panneau2 = new JPanel();
        add(panneau2, BorderLayout.CENTER); 
        panneau2.setBackground(Color.WHITE);
        
  }
   public static void main(String[] args) {
     GUI gui;
     gui= new GUI();
     gui.setVisible(true);
  }
}


