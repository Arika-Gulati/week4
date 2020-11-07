import java.util.*;
public class Palindrom {
Scanner s=new Scanner(System.in);
public void palindrom() {
int rem;
int rev=0;
int temp;
System.out.println("Enter the number you want to check: ");
int num=s.nextInt();
temp=num;
while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
      }
if(temp==rev) {
System.out.println("number is a palindrom");
     }
else {
System.out.println("number is Not a palindrom");
    }
}    //method bracket
public static void main(String arhs[]) {
Palindrom p=new Palindrom();
p.palindrom();
   }    //main bracket
}   //class bracket
