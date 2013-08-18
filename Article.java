//David Noursi
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.Graphics;
public class Article
{
   private Segment[] mySegs;
   private String myTitle;
   public Article(String t)
   {
      myTitle = t;
   }
   public void setText(String[] s)
   {
   mySegs = new Segment[s.length];
      for(int x=0; x<s.length; x=x+1)
      {
         mySegs[x] = new Segment(s[x]);
      }
   }
   public String fetchFeed(int l)
   {
      for(int x=0; x<mySegs.length; x=x+1)
      {
         if(l<cumLength(x))
         {
            return makeArticle(x-1);
         }
      }
      return makeArticle(0);
   }
   public String makeArticle(int i)
   {
      String toReturn = "";
      for(int x=0; x<=i; x=x+1)
      {
      toReturn = toReturn + mySegs[x].getText();
      }
      return toReturn;
   }
   public int cumLength(int i)
   {
      int cumSum = 0;
      for(int x=0; x<=i; x=x+1)
      {
         cumSum=cumSum+mySegs[x].getLength();
      }
      return cumSum;
   }
}
