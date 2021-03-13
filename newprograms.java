
import java.awt.Desktop;
import java.net.URI;
import java.util.*;

public class newprograms {

       public  static void main (String[] args) {

Scanner sc = new Scanner(System.in);

String op[],op2[] = new String[18];
String ut;
String pt;

String it = sc.nextLine();
if(it.contains("https://www.youtube.com/embed/")){
op = it.split("/");
ut = op[4];
 op2 = ut.split(" ");
 pt = op2[0];
it = pt.substring(0, pt.length() -1);

if(Desktop.isDesktopSupported()) {
	Desktop d = Desktop.getDesktop();
	try {
		d.browse(new URI("https://www.youtube.com/watch?v=" + it)) ;
	}catch(Exception e) {
		System.out.println(e);
		
}
}else{
System.out.println("this is not an youtube embed codes");
	}
	
}





	}
}


