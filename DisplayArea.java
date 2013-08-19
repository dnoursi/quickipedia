//David Noursi
import javax.swing.*;
import java.util.*;
import java.io.*;
public class DisplayArea extends JPanel
{
   private String[] segs;
   private int x;
   public DisplayArea()
   {
   }      
   public void looker(int l, String t)
   {
      Article todisplay = new Article(t);
      segs = new String[x];
   
      try
      {
         Scanner sc = new Scanner(new File(t+".txt"));
         x=Integer.parseInt(sc.nextLine());
         segs = new String[x];
         for(int y=0; y<x;y=y+1)
         {
            segs[y]=sc.nextLine();
         }
         sc.close();
      }
      catch(FileNotFoundException e)
      {
         System.exit(0);
      }
      todisplay.setText(segs);
      JOptionPane.showMessageDialog(null,""+todisplay.fetchFeed(l));
   }
}