/*Recursive program on Factorial */
import java.util.Scanner;
class postlab1
{  

static int factorial(int n)
{
if(n==0)
return 1;
else
return(n* factorial(n-1));

}
public static void main(String args[])
{
int i,fact=1;
Scanner x1=new Scanner(System.in);
System.out.println("Enter a number");
int number=x1.nextInt();
x1.close();

fact=factorial(number);
System.out.println("Factorial of "+number+" is:"+fact);


}

 }