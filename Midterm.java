package midterm;
import java.util.Scanner;

public class Midterm {

    
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
        System.out.println("enter day ");
        
        int sday =input.nextInt();
        
         
        
        System.out.println("enter month ");
        int smonth =input.nextInt();
        System.out.println("enter year");
       int syear =input.nextInt();
      Date date=new Date(  sday, smonth,syear);
      
        System.out.println("("+date.getday()+"/"+date.getmonth()+"/"+date.getyear()+")" );
 
    }
    
}
