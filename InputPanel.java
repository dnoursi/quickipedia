import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//David Noursi

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
      public void actionPerformed(ActionEvent e) 
      {
         String title = JOptionPane.showInputDialog("What would you like to research next?");
         int len = Integer.parseInt(JOptionPane.showInputDialog("Character count?"));
         mydarea.looker(len, title);
      }
   }
}