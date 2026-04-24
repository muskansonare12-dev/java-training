
import java.util.Scanner;
public class traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed:");
        int speed = sc.nextInt();
        int fine=0;
        String repeated;

        if (speed>100){
            fine+=1000;
            System.out.println("fine rs-" + fine);
        }
        else if(speed>80){
            fine+=500;
            System.out.println("fine rs-" + fine);
        }

        System.out.println("repeated:");
        repeated=sc.next();

        if(repeated.equals("yes")){
        fine*=2;
       
    } else{
    System.out.println(fine);
    
   }
   System.out.println(fine);
   sc.close();
   
}

        



















    
    }        


        
    
