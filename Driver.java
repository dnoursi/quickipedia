   //David Noursi
   import javax.swing.JFrame;
   public class Driver
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Quickipedia");
         frame.setSize(800, 600);
         frame.setLocation(200,100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new MainPanel());
         frame.setVisible(true);
      }
   }