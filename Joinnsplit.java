import java.util.*;
class Joinnsplit{
	public static void main(String []agr){
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a string ");
		String st=s.nextLine();                                 //taking input from user
		String []g=st.split("is");				// spliting the string from where got 'is'
			
		String nmp=String.join("what",g);			//joining the array of string by using join() method
		System.out.println("Case1 : "+nmp);

		String t="";
		for(String n:g){
				if(n==g[0]){
					t=t+n;				//joining the array of string using + concatenate operator
				}else
				t=t+"what"+n;				//joining the array of string using + concatenate operator
			}
		System.out.println("Case2 : "+t);
		String nm="";
		for(int i=0;i<g.length;i++){
			if(i!=g.length-1){
					nm=nm.concat(g[i]).concat("what");		//joining the array of string using concat method
				}else{
					nm=nm.concat(g[i]);				//joining the array of string using concat method
					}
			}
		System.out.println("Case3 : "+nm);
	}

}