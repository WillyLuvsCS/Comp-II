import javax.swing.*;
public class Gui_Example1 extends JFrame {

   public static final int DRAW_SIZE = 400;

   public Gui_Example1(){
       super("GUI 1");
       setSize(DRAW_SIZE, DRAW_SIZE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
   
   public static void main(String[] args) {
       Gui_Example1 gui;
       gui = new Gui_Example1();
       gui.setVisible(true);
  }
}

// Just empty drawing space