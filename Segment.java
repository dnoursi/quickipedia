//David Noursi
public class Segment
{
   private String myText;
   private String subjectTag;
   public Segment(String text)
   {
      this.myText = text;
   }
   public Segment(String text, String subjectTag)
   {
	   this.myText = text;
	   this.subjectTag = subjectTag;
   }
   public String getText()
   {
      return myText;
   }
   public String getSubjectTag(){
	   return this.subjectTag;
   }
   public int getLength()
   {
      return myText.length();
   }
}
