import java.lang.*;
import java.util.Random;
import java.util.Date;

public class PrintQuote
{
public static void main(String args[])
{
    Date date=new Date();
    String array[]={"Don't stop until you are proud","Push yourself because no one else is going to do it for you","Your success and happiness lie in you","Find your spirit and no challenge will keep you from acheiving your goals","Set peace in your mind as your higgest goal,and organise your life around it","If you can't figure out your purpose, figure out your passion" };

    Random random=new Random();
    int number=random.nextInt(3);
    System.out.println(date);
    System.out.println(array[number]);

}

}


//Make yt shots
//Make Community posts so that keeps updating the user
/*
import java.util.*;
class PrintQuote{
    public static void main(String args[])
{
   Date date=new Date();
   Random ran=new Random();
   int randomNo=ran.nextInt(3);
   String quotes[]={"Hello","It's a great day", "Afresh newday","Gracious be your day"};
   System.out.println(date);
   System.out.println(quotes[randomNo]);

}

}*/