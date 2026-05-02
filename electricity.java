import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units consumed:");
        int units = sc.nextInt();
        double bill = 0;
        double surcharge = 0;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = units*7;
        } else {
            bill = units *10;
        }
        if(bill>2000)
        {
            surcharge = bill * 0.10;
        }
        double total=bill+surcharge;

        System.out.println("Electricity bill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total bill: " + total);
        sc.close();
    }
}
