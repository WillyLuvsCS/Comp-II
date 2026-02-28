import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
  
public static final int DRAW_SIZE = 400;
       public GUI(){
       super("GUI 3");
       setSize(DRAW_SIZE, DRAW_SIZE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
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

        JPanel panneau2 = new JPanel();
        add(panneau2, BorderLayout.CENTER); 
        panneau2.setBackground(Color.WHITE);
    
  }
    public void actionPerformed(ActionEvent e) {
            System.out.println("actionPerformed was called");
    }
   public static void main(String[] args) {
     GUI gui;
     gui= new GUI();
     gui.setVisible(true);
  }
}


