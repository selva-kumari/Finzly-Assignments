import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="aaioe";
		char c[]=s.toCharArray();
		int a=0,e=0,i=0,o=0,u=0;
		int x;
		for(x=0;x<c.length;x++){
		    if(c[x]=='a')
		        a=1;
		    else if(c[x]=='e')
		        e=1;
		    else if(c[x]=='i')
		        i=1;
		    else if(c[x]=='o')
		        o=1;
		   else if(c[x]=='u')
		        u=1;
		    }
		if(a==1 && e==1 && i==1 && o==1 && u==1){
		    System.out.println("All vowels presented");
		}
		else{
		    System.out.println("some missing");
		}
	}
}
