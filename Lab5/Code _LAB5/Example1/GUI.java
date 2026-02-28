import javax.swing.*;
public class GUI extends JFrame{
   public static final int DRAW_SIZE = 400;
   public GUI(){
       super("GUI 1");
       setSize(DRAW_SIZE, DRAW_SIZE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
   
   public static void main(String[] args) {
     GUI gui;
     gui = new GUI();
     gui.setVisible(true);
  }
}
