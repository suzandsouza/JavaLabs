/*Fibonacci Series
WAP to read term no. Write a function in the program to generate  and print
the fibonacci term

*/
/*import java.util.Scanner;
class Fibonacci{  
        public static void main(String args[])  
{    
        int n1=0,n2=1,n3,i;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int count=scan.nextInt();

        scan.close();
        System.out.print(n1+" "+n2);//printing 0 and 1    
        for(i=2;i<count;++i) //begin with 2 as 0 is printed 
        {    
           n3=n1+n2;    
           System.out.print(" "+n3);    
           n1=n2;    
           n2=n3;    
         }    
  
}
}  */

/*Name: Suzan Dsouza
   R.No: 9194
   Class: Comp A  
/*Fibonacci Series
WAP to read term then write a function in the program to generate and print the fibonacci term
*/
import java.util.Scanner;
class Fibonacci{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i;
        Scanner x1=new Scanner(System.in);
        System.out.println("Enter any number:");
        int count=x1.nextInt();   //Here we use the object x1 to input any variable count from the user
                                  //nextInt refrs to take the input till you encounter next line 
        x1.close();
        System.out.print(n1+ " "+n2); //printing 0 and 1
        
        for(i=2;i<count;++i)   //Now begin with 2 as 0 is already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3); //keep adding the numbers
            n1=n2;
            n2=n3;
        }
    }
}