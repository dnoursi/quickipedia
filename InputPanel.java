//David Noursi
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
public class InputPanel extends JPanel
{
   private DisplayArea mydarea;
   private JButton newarticle;

   public InputPanel()
   {
   
      setLayout(new FlowLayout());
      setBackground(Color.LIGHT_GRAY);
   
      newarticle = new JButton("Begin Research");
      newarticle.addActionListener(new nextListener());
      add(newarticle);
   
   
   }
   public InputPanel(DisplayArea x)
   {
      mydarea = x;
      
      setLayout(new FlowLayout());
      setBackground(Color.LIGHT_GRAY);
   
      newarticle = new JButton();
      newarticle.addActionListener(new nextListener());
   
      add(newarticle);
   
   
   }
   private class nextListener implements ActionListener
   {
      public nextListener()
      {
      }
      public void actionPerformed(ActionEvent e) 
      {
         String title = JOptionPane.showInputDialog("What would you like to research next?");
         int len = Integer.parseInt(JOptionPane.showInputDialog("Character count?"));
         mydarea.looker(len, title);
      }
   }
}