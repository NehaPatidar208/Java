import java.util.*;
class Reverse_St
{
 public static void main(String [] arg){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	String m=s.next();
	StringBuffer st=new StringBuffer(m);
	System.out.println("Reverse of"+m+"="+st.reverse());
 }
}