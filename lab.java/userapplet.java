import java.awt.*;
import java.applet.*;
public class userapplet extends Applet{
    int v1=10, v2=20,v3=30;
    int avg=(v1+v2+v3)/3; 
    public void paint(Graphics g){
       String s1="first number="+String.valueOf(v1); 
       String s2="second number="+String.valueOf(v2); 
       String s3="third number="+String.valueOf(v3); 
       String s4="average of these number="+String.valueOf(avg); 
    }
    
}
