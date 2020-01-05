import java.util.*;
class Reverse
{
 public static void main(String [] arg){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a number to reverse it");
	int num=s.nextInt();
	int r,d=0;
	int m=num;
	while(num>0){
	   r=num%10;
		d=d*10+r;
	num=num/10;
  	}
 	
	System.out.println("Reverse of"+m+"="+d);
  
 }
}