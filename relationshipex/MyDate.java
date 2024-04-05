package relationshipex;

public class MyDate {
int dd,mm,yy;


   public MyDate() {
	   dd=21;
	   mm=07;
	   yy=2003;
	   
   }
   public MyDate(int dd,int mm, int yy) {
	
	   this.dd=dd;
	   this.mm=mm;
	   this.yy=yy;
   }
  public void display() {
	  System.out.println(dd+"-"+mm+"-"+yy);
  }
}
