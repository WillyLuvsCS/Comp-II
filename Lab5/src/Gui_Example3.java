import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui_Example3 extends JFrame implements ActionListener {
  
    public static final int DRAW_SIZE = 400;
       public Gui_Example3(){
       super("GUI 3");

       setSize(DRAW_SIZE, DRAW_SIZE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
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

        JPanel panel2 = new JPanel();
        add(panel2, BorderLayout.CENTER);
        panel2.setBackground(Color.WHITE);
    
    }
    public void actionPerformed(ActionEvent e) {
            System.out.println("actionPerformed was called");
    }

   public static void main(String[] args) {
       Gui_Example3 gui;
       gui= new Gui_Example3();
       gui.setVisible(true);
   }
}

// Recognizes a button was pressed
