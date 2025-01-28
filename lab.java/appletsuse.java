import java.awt.*;
import java.applet.*;
public class appletsuse extends Applet {
    String Name="Ananta Nag", Fathername="Pratap Nag", Gender="Male", Address="At/po-Gopaipali",clgname="GCEK",Branch="CSE";
    int Rollno=2101110079;
    public void paint(Graphics g){
        g.drawString("College Name:"+clgname,10, 10);    
        g.drawString("Branch:"+Branch, 10, 20);    
        g.drawString("Name:"+Name, 10, 30);
        g.drawString("Father Name:"+Fathername, 10, 40);    
        g.drawString("Gender:"+Gender, 10, 50);    
        g.drawString("Address:"+Address, 10, 60);    
        String s="Rollno:"+String.valueOf(Rollno);
    }
}
