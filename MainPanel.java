//David Noursi
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
public class MainPanel extends JPanel
{
   private DisplayArea displayarea;
   private InputPanel inputpanel;
   public MainPanel()
   {
      setLayout(new FlowLayout());
      setBackground(Color.LIGHT_GRAY);
      
      displayarea = new DisplayArea();
      add(displayarea);
      
      inputpanel = new InputPanel(displayarea);
      add(inputpanel);
   }
}