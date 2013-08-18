//David Noursi
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.Graphics;
public class Segment
{
   private String myText;
   public Segment(String a)
   {
      myText = a;
   }
   public String getText()
   {
      return myText;
   }
   public int getLength()
   {
      return myText.length();
   }
}
