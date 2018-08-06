package janani;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,a=0,count=0;
String str="" ;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
while(n!=0){
	a=n%10;
	n=n/10;
	if(((a==0)||(a==1))){
		str="no";
				count ++;
	}
	
}
if(count==0){
	str="yes";
			
}
System.out.println(str);
	}

}
