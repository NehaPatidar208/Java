import java.util.*;
class Palindrome
{
	public static void main(String [] arg){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to check that palindrome or not");
		int num=sc.nextInt();
		int i,temp=num,sum=0,rev;
		while(temp >0){
			rev=temp%10;
			sum=sum*10+rev;
			temp=temp/10;
		}
		if(sum==num){
			System.out.println(num+" is palindrome number");
		}else{
			System.out.println(num+" is not a palindrome number");
		}
	}

}