import java.util.Scanner;
public class worehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n =sc.nextInt();
        int total=0;

        for(int i=1;i<=n;i++){
            int curr = sc.nextInt();
            int minreq=sc.nextInt();
            if(curr<minreq){
                System.out.println("restock needed for product"+i);
                total++;
            }
           
        }

         System.out.println("total products that needed to be restocked: " + total);
    

    }
    
}
