//David Noursi
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
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